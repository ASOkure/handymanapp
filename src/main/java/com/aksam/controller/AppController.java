package com.aksam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aksam.entity.Handyman;
import com.aksam.entity.Hirer;
import com.aksam.entity.Job;
import com.aksam.service.HandymanService;
import com.aksam.service.HirerService;
import com.aksam.service.JobService;

@Controller
public class AppController {
	
	
	@Autowired
	HandymanService handymanService;
	
	@Autowired
	JobService jobService;
	//@Autowired
//	HirerService hirerService;
		
	@RequestMapping("/")
		public String home( ) {
			
			
			return "home";
		}

		
	
	
	@RequestMapping("/listhandyman")
	public String listHandyman(Model theModel ) {
		
		List<Handyman> thehandymanList = handymanService.getAllHandyman();
		
		
		theModel.addAttribute("handymanlists", thehandymanList);
		
		return "handymanList";
	}
	
	
//	@RequestMapping("/listhirer")
//	public String listHirer(Model theModel ) {
		
	//	List<Hirer> thehirerList = hirerService.getAllHirers();
		
		
		//theModel.addAttribute("hirerlists", thehirerList);
		
		//return "hirerList";
	//}
	
	
	@RequestMapping("/quote")
	public String Quote( ) {
		
		
		return "quote";
	}


	 @RequestMapping("/redirectToLogin")
	    public String redirectToLogin() {
	        return "redirect:fancy-login";
	    }
	
	@RequestMapping("/tradeSignUp")
	public String tradeSignUp(Model theModel ) {
		
		// create model attribute to bind form data
		
		Handyman  theHandyman = new Handyman();
		
		theModel.addAttribute("handyman", theHandyman);
		
		// attribute name=handyman, value=theHandyman, use attribute name in jsp form.
		
		
		
		return "handymanSignUp";
	}

	
	@RequestMapping( value="/saveHandyman", method = RequestMethod.POST)
	public String saveHandyman(@ModelAttribute("handyman") Handyman theHandyman) {
		
		//save the handyman using our service
		
		handymanService.saveHandyman(theHandyman);
		// to do create handyman list
		return "redirect:/listhandyman";
		
		
	}
	
	@GetMapping("/showFormForHandymanUpdate")
	public String showFormForHandymanUpdate(@RequestParam("handymanId") Long theId, Model theModel) {
		
		// get the handyman from our service
		 Handyman theHandyman = handymanService.getHandymanById(theId);
		// set the handyman as a model attribute to prepopulat the form
		theModel.addAttribute("handyman", theHandyman);
		// send over to our form
		return  "handymanSignUp";
	}
	
	@GetMapping(value="/delete")
	public String deleteHandyman(@RequestParam("handymanId") Long theId) {
		
		//delete the customer
		
		handymanService.deleteHandyman(theId);
		
		return "redirect:/listhandyman";
		}
	
	@RequestMapping("/logout")
	public String Logout( ) {
		
		
		return "logout";
	}
	
	@RequestMapping( value="/processPostJob", method = RequestMethod.POST)
	public String processPostJob(@ModelAttribute("job") Job theJob) {
		
		//save the handyman using our service
		jobService.saveJob(theJob);
	//	handymanService.saveHandyman(theHandyman);
		// to do create handyman list
		return "redirect:/listhandyman";
		
		
	}


	}