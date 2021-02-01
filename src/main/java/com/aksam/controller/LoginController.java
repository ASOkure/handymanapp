package com.aksam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

	@RequestMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		
		
		return "fancy-login";
		
	}
	
	// add request mapping for /access-denied
	
	@GetMapping("/access-denied")
	public String showAccessDenied() {
		
		return "access-denied";
		
	}
	
	@RequestMapping("/redirectToLoginPage")
	public String redirectToLoginPage() {
		
		
		return "fancy-login";
		
	}
	
	
}









