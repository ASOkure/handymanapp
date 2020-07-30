package com.aksam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
		
	@RequestMapping("/")
		public String home( ) {
			
			
			return "home";
		}

		
	
	@RequestMapping("/quote")
	public String Quote( ) {
		
		
		return "quote";
	}


	
	@RequestMapping("/tradeSignUp")
	public String tradeSignUp( ) {
		
		
		return "tradeSignUp";
	}

	

	
	@RequestMapping("/logout")
	public String Logout( ) {
		
		
		return "logout";
	}

	}