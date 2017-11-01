package com.cg.trainee.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.trainee.model.Login;
import com.cg.trainee.service.ITraineeService;

@Controller
public class LoginController {

	
	@Autowired
	ITraineeService service;
	
	@RequestMapping("/index")
	public String goToIndex(Model m,HttpServletRequest req){
			m.addAttribute("name",new String());
			m.addAttribute("pass",new String());
			m.addAttribute("msg",new String());
		
		return "loginDetails";
	}
	
	@RequestMapping("/checkLogin")
	public String check(@RequestParam("username") String username, @RequestParam("password") String password,Model m,HttpServletRequest req){
		String pageToRedirect = "loginDetails";
		try{
			System.out.println("in Try ");
			Login log = service.getLoginDetails(username, password);
			if(log.getUsername().equals(username) && log.getPassword().equals(password)){
				System.out.println("in if condition");
				HttpSession session = req.getSession(true);
				session.setAttribute("valid",true);
				session.setAttribute("loginDetails", log);
				session.setAttribute("username", username);
				session.setAttribute("password", password);
				System.out.println("returning data");
				return "options";
			}
		}
		catch(Exception e){
			String name = " Invalid Username.... ";
			String pass = " Invalid PassWord.... ";
			m.addAttribute("name",name);
			m.addAttribute("pass",pass);
			m.addAttribute("msg",new String());
			
		}
		return pageToRedirect;
		
	
	}
/*	
	@RequestMapping("/validateSession")
	public String validSession(HttpServletRequest req,Model m){
		HttpSession session = req.getSession(false);
		boolean isAlive= (boolean) session.getAttribute("valid");
		
		if(isAlive){
		}
		else
		{
			m.addAttribute("name",new String());
			m.addAttribute("pass",new String());
			m.addAttribute("msg","Session is loggedout");
			return "loginDetails";
		}
	}

	*/
	
	
}
