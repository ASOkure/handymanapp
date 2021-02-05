package com.aksam.mailservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;


import com.aksam.entity.Handyman;
import com.aksam.entity.Job;
import com.aksam.entity.User;
import com.aksam.service.HandymanService;
import com.aksam.service.JobService;
import com.aksam.service.UserService;

import freemarker.template.Configuration;

@Service
public class MailServiceImpl implements MailService{
	
	@Autowired
	JavaMailSender mailSender;
	
	@Autowired
	UserService userService;
	
	@Autowired
	JobService jobService;
	
	@Autowired
	Configuration freemarkerConfiguration;
	
	@Override
	public void sendEmail ( ) {
		
		User appuser = new User();
		
		MimeMessagePreparator preparator = getMessagePreparator(appuser);
		
		try {
            mailSender.send(preparator);
            System.out.println("Message has been sent.............................");
        }
        catch (MailException ex) {
            System.err.println(ex.getMessage());
        }
	
	}


	public List<String> getUsersEmail() {

		List<String> emailList = new ArrayList();
		
	
		List<User> users = userService.getAllUsers();

		for (User u : users) {
			
			String email = u.getEmail();

			emailList.add(email);

		}
		
		return emailList;

	}

	private MimeMessagePreparator getMessagePreparator(User user) {

		MimeMessagePreparator preparator = new MimeMessagePreparator() {

			public void prepare(MimeMessage mimeMessage) throws Exception {

				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

				List<String> emails = getUsersEmail();
				
				InternetAddress[] address = new InternetAddress[emails.size()];
				
				for( int i = 0; i < emails.size();  i++) {
					
                 address[i] = new InternetAddress(emails.get(i));
				}
				helper.setSubject("Your job on Solutions Provider App");
				helper.setFrom("akan.okure@gmail.com");
		         helper.setTo(address);
				
				/*
				 * for (String toEmail : emails)
				 * 
				 * helper.setTo(toEmail);
				 */

				Map<String, Object> model = new HashMap<String, Object>();

				model.put("user", user);

				String text = geFreeMarkerTemplateContent(model);
				System.out.println("Template content : " + text);

				// use the true flag to indicate you need a multipart message
				helper.setText(text, true);

			}
		};
		return preparator;
	}

	public String geFreeMarkerTemplateContent(Map<String, Object> model) {
		StringBuffer content = new StringBuffer();
		try {
			content.append(FreeMarkerTemplateUtils
					.processTemplateIntoString(freemarkerConfiguration.getTemplate("fm_mailTemplate.txt"), model));
			return content.toString();
		} catch (Exception e) {
			System.out.println("Exception occured while processing fmtemplate:" + e.getMessage());
		}
		return "";
	}

}
