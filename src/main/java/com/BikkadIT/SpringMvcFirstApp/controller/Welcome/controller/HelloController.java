package com.BikkadIT.SpringMvcFirstApp.controller.Welcome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HelloController {
	@GetMapping("/hello")
	public String gethello(Model model){
		String str = "hiiii";
		model.addAttribute("HELLO", str);
		
		return "contact";
		
	}

}
