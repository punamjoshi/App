package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.ProductService;
import com.EntityClassess.Product;


@Controller
public class MyController {

	@Autowired
	ProductService service;
	
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
	 
	  public String save(@ModelAttribute("product") Product product,BindingResult result)
	  {
		//  System.out.println("*****"+product.getFile());
		  service.addProduct(product);
		  
		  return "AdminHome";
	  }
	  @RequestMapping(value="/upload" ,method=RequestMethod.GET)
	  @ResponseBody
	  public String upload(@RequestParam("file")String name)
	  {
		  System.out.println("inside upload"+name);
		  
		  return "AddProduct";
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
	   service.updateProduct(product);  
	   return new ModelAndView("redirect:ViewAll");  
	    
	   
	 }  
	  
	  
	  @RequestMapping("/Login")
	  public String login()
	  {
		  return "Login";
	  }
	  
	  @RequestMapping("/Register")
	  public String register()
	  {
		  return "Register";
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
	  
}
