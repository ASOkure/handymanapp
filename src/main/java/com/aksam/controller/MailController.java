package com.aksam.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aksam.entity.Handyman;
import com.aksam.entity.Job;
import com.aksam.mailservice.MailService;
import com.aksam.service.HandymanService;
import com.aksam.service.JobService;

@Controller
public class MailController {

	private Logger logger = Logger.getLogger(getClass().getName());

	@Autowired
	public MailService mailService;

	@Autowired
	public HandymanService handymanService;

	@Autowired
	public JobService jobService;

	@RequestMapping("/handymanemailform")
	public String HandymanEmailForm() {

		return "handymanemailform";
	}

	@RequestMapping("/result")
	public String emailSent() {

		return "result";
	}

	
	
	@RequestMapping(value = "/sendHandymanEmail", method = RequestMethod.POST)
	public String SendHandymanEmail() {
		
		
		mailService.sendEmail();

		
		return  "result";

	}

}
