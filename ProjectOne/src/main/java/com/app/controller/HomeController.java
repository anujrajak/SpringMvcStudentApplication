package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public ModelAndView home(){
		
		String message = "HomeController";
		return new ModelAndView("home", "message", message);
	}
	
}
