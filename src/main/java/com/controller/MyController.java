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

//this class is controller class which handles request.

@Controller
public class MyController {

	@Autowired
	ProductService service;
	 @Autowired
	  ServletContext req;
	 @Autowired
	 UserService userService;
	 
	 
	 //(/)request maaping when procject runs it will call this request 
	 
	 @RequestMapping("/")
	 public String show()
	 {
		  System.out.println("Controller");
		
		 return "index";
	 }
	
	 
	 //When admin click on viewAll Option it will come to this request will return list of product on ViewAll jsp page
	 
	 @RequestMapping("/ViewAll")  
	 public ModelAndView getList() {  
	  List<Product> productList = service.getList();  
	  return new ModelAndView("ViewAll", "productList", productList);  
	 }  
	 
	 
	 /*When admin click on addproduct it will come to this request and will save the product into db using service object of
	  * ProductService interface.
	  * req is object of ServletContext used to take the real and context path of project to save image and image path into database
	  * getFilePath is userdefined function which is in Product class  
	   
	 */
	 
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
	
	  
	  /*
	   *  This function will call when admin will click delete option which is on ViewAll Jsp
	   *  service is object of ProductService interface
	   *  service is calling deleteProduct function. implementation of this function is in productDaoImpl class.
	   *  
	   * */
	  @RequestMapping("/delete")
	  public String deleteProduct(@RequestParam("id")String prodid)
	  {
		  service.deleteProduct(prodid);
		  return "redirect:ViewAll";
		  
	  }
	  
	  /*
	   * This rquest is call when admin click on edit option which is on ViewAll jsp
	   * in this service object is calling getProductById() which return all information of selected product on Edit jsp
	   * 
	   */
	  
	  
	  @RequestMapping("/Edit")  
	  public ModelAndView editUser(@RequestParam String id,  
	    @ModelAttribute Product product) {  
	   Product productObject =service.getProductbyId(id); 
	   System.out.println("Edit:"+productObject.getPname());
	   return new ModelAndView("Edit", "productObject", productObject);  
	  }  
	  
	  
	  /*
	   * This request will call when admin will click on update option which is on EDIT JSP
		 
	   */
	   
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
	  
	  
	  /*
	   * 
	   * This function will call when user click on register button which is on register page
	   * userService is object of UserService interface using which calls the addUser()
	   *  */
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
	  
	  
	  /*
	   * This request will call when user click on sign up option which is on index jsp
	   * 
	   */
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
	  
	  
	  @RequestMapping("/Aboutus")
	  public String aboutus()
	  {
		  return "Aboutus";
	  }
	  
}
