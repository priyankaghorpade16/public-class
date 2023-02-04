package com.BikkadIT.SpringMvcFirstApp.controller.Welcome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class WelcomeController {
	
	public WelcomeController() {
		super();
		System.out.println("Welcome Class Controller");
	}
	
	@GetMapping("/WelcomeMsg")
	public ModelAndView welcomeMsg() {
		String msg = "Welcome to BikkadIT";
		ModelAndView mav = new ModelAndView();
		mav.addObject("MESSAGE", msg);
		mav.setViewName("Welcome");
		
		return mav;
	}


}
