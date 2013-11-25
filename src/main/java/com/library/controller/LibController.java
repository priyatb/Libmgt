package com.library.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.library.processor.LoginRequestProcessor;
import com.library.viewmodel.LoginModel;


@Controller
public class LibController {

	@Autowired 
	ServletContext servletContext;
	
	@RequestMapping(value="index", method={RequestMethod.GET})
	public String handleRequest(Model m) {
		 m.addAttribute("loginModel", new LoginModel());
		 
		 return "index";
	}
	
	@RequestMapping(value="index", method={RequestMethod.POST})
	public String handleRequest(LoginModel loginModel, Model m) {

		LoginRequestProcessor lProcessor = new LoginRequestProcessor();
		if(lProcessor.processRquest(loginModel)){
			return "redirect:next.jsp";
		}
		return "index";
	}
	
	@RequestMapping(value="next", method={RequestMethod.GET, RequestMethod.POST})
	public String handleMenu(HttpServletRequest request, HttpServletResponse response) {
		if(request.getParameter("menu") != null){
			Integer value = Integer.parseInt(request.getParameter("menu"));
			if(value != null){
				if(value == 1){
					return "redirect:addStudent";
				}else if(value == 2){
					return "redirect:addBook";
				}else if(value == 3){
					return "redirect:searchBook";
				}else if(value == 4){
					return "redirect:searchStudent";
				}else if(value == 5){
					return "redirect:issueBook";
				}else if(value == 6){
					return "redirect:returnBook";
				}
			}
		}
		return "next";
	}
	
	@RequestMapping(value="{action}", method={RequestMethod.GET, RequestMethod.POST})
	public String handleService(HttpServletRequest request, HttpServletResponse response){
		String action = request.getRequestURI().split("/")[3];
		return action;
	}
}
