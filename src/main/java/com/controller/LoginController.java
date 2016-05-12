package com.controller;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.servlet.ModelAndView;  
  
@Controller  
public class LoginController {  
  
 @RequestMapping("Login")  
 public ModelAndView getLoginForm(Model model,@RequestParam(required = false) String authfailed, String logout, String denied) {  
	 
	 System.out.println("in Login controller");
  String message = "";  
  if (authfailed != null) {  
   message = "Invalid username of password, try again !";  
  } else if (logout != null) {  
   message = "Logged Out successfully, login again to continue !";  
  } else if (denied != null) {  
   message = "Access denied for this user !";  
  }  
 // message="in Login";
  return new ModelAndView("Login", "message", message);  
 }  
  
 @RequestMapping("/User")  
 public String geUserPage(Model model) {  
  return "User";  
 }  
  
 @RequestMapping("admin")  
 public String geAdminPage() {  
  return "admin";  
 }  
  
 @RequestMapping("403page")  
 public String ge403denied() {  
  return "redirect:login?denied";  
 }  
  
}  