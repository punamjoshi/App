package com.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.ProductService;
import com.DAO.UserService;
import com.EntityClassess.Product;
import com.EntityClassess.User;


@Controller
public class MyController {

	@Autowired
	ProductService service;
	 @Autowired
	  ServletContext req;
	 @Autowired
	 UserService userService;
	 @RequestMapping("/")
	 public String show()
	 {
		  System.out.println("Controller");
		 /* Product p=new Product();
		  
		  p.setCtg("Movie");
		  p.setSubctg("Bollywood");
		  p.setPname("Airlift");
		  p.setPqty("20");
		  p.setPrice("300");
		  p.setProdid("123");
		  service.addProduct(p);
		  System.out.println(" After Controller");*/
		 return "index";
	 }
	
	 
	 @RequestMapping("/ViewAll")  
	 public ModelAndView getList() {  
	  List<Product> productList = service.getList();  
	  return new ModelAndView("ViewAll", "productList", productList);  
	 }  
	 
	 
	 
	  @RequestMapping(value="/save",method=RequestMethod.POST)
	 
	  public String save(@ModelAttribute("product") Product product,BindingResult result) throws UnsupportedEncodingException
	  {
		 
		//  System.out.println(product.getCtg());
		  String p=req.getRealPath("/");
		  //System.out.println("*****"+product.getFile1());
		  String path=product.getFilePath(p,req.getContextPath());
	
		  System.out.println("Context path"+req.getContextPath()+"############"+path); 
		  service.addProduct(product);
		  
		  return "AdminHome";
	  }
	
	  
	  @RequestMapping("/delete")
	  public String deleteProduct(@RequestParam("id")String prodid)
	  {
		  service.deleteProduct(prodid);
		  return "redirect:ViewAll";
		  
	  }
	  
	  
	  @RequestMapping("/Edit")  
	  public ModelAndView editUser(@RequestParam String id,  
	    @ModelAttribute Product product) {  
	   Product productObject =service.getProductbyId(id); 
	   System.out.println("Edit:"+productObject.getPname());
	   return new ModelAndView("Edit", "productObject", productObject);  
	  }  
	   
	  @RequestMapping("/update")  
	  public ModelAndView updateUser(@ModelAttribute Product product) {  
		  System.out.println(""+product.getProdid());
		  String p=req.getRealPath("/");
		  //System.out.println("*****"+product.getFile1());
		  String path=product.getFilePath(p,req.getContextPath());
	
		  System.out.println("Context path"+req.getContextPath()+"############"+path); 
	   service.updateProduct(product);  
	   return new ModelAndView("redirect:ViewAll");  
	    
	   
	 }  
	  
	  
	/*  @RequestMapping("/Login")
	  public String login()
	  {
		  return "Login";
	  }*/
	  
	 /* @RequestMapping(value="/saveUser", method=RequestMethod.POST)
	  public String addUser(@ModelAttribute("userData") User reg)
	  {
		  System.out.println("INside Save User");
		  userService.addUser(reg);
		  
		  return "index";
	  }*/
	  
	  
	  @RequestMapping(value="/saveUser", method=RequestMethod.POST)
	  public String addUser(@Valid @ModelAttribute("userData") User reg,BindingResult result)
	  {
		  System.out.println("INside Save User");
		  if(result.hasErrors())
		  {
			return "Register";  
		  }
		  else
		  {
		  userService.addUser(reg);
		  }
		  return "index";
	  }
	  
	  
	  @RequestMapping("/Register")
	  public ModelAndView register()
	  {
		  User register=getUserObject();
		  ModelAndView model=new ModelAndView("Register");
		  model.addObject(register);
		// model.addObject("userData", register);
		  return model;
	  }
	  
	  @ModelAttribute("userData")
	  public User getUserObject()
	  {
		  return new User();
	  }
	  
	  @RequestMapping("/AdminHome")
	  public String admin()
	  {
		  return "AdminHome";
	  }
	  
	  @RequestMapping(value="/AddProduct")
	  public ModelAndView addProduct()
	  {
		  Product p=new Product();
		  ModelAndView model=new ModelAndView("AddProduct");
		  model.addObject(p);
		  return model;
	  }
	  
	  
	  @RequestMapping("/ViewRecord")
	  public ModelAndView getRecord(@RequestParam String id,  
				    @ModelAttribute Product product) {  
				   Product productObject =service.getProductbyId(id); 
				   System.out.println("view:"+productObject.getPname());
				   return new ModelAndView("ViewRecord", "productObject", productObject);  
				  }  
	  
	  @RequestMapping("/ViewAllByCtg")
	  public ModelAndView getRecords(@RequestParam String id)
	  {
		  
		  List<Product> productList = service.getRecordsByCtg(id);  
		  return new ModelAndView("ViewAll", "productList", productList);  
	  }
	  
}
