package com.aksam.mailservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;
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
import com.aksam.service.HandymanService;
import com.aksam.service.JobService;

import freemarker.template.Configuration;

@Service
public class MailServiceImpl implements MailService{
	
	@Autowired
	JavaMailSender mailSender;
	
	@Autowired
	HandymanService handymanService;
	
	@Autowired
	JobService jobService;
	
	@Autowired
	Configuration freemarkerConfiguration;
	
	@Override
	public void sendEmail ( ) {
		
	
		
		MimeMessagePreparator preparator = getMessagePreparator();
		
		try {
            mailSender.send(preparator);
            System.out.println("Message has been sent.............................");
        }
        catch (MailException ex) {
            System.err.println(ex.getMessage());
        }
	
	}



	
		private MimeMessagePreparator getMessagePreparator(){
		
		MimeMessagePreparator preparator = new MimeMessagePreparator() {

			public void prepare(MimeMessage mimeMessage) throws Exception {
            	
				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
				
			//	 Handyman handyman  =  new Handyman();
				 List<Handyman> handyman = new ArrayList<Handyman>();
				 
				 List<String> handymanEmail = new ArrayList<String>();
				 
				 handyman.addAll(handymanService.getAllHandyman());
				 
				 Iterator<Handyman> iterator = handyman.iterator();
				 
				 while (iterator.hasNext()) {

				Handyman handymaniter = iterator.next();
				 
				handymanEmail.add(handymaniter.getEmail().toLowerCase());
				 }
				 
				 
				 handymanEmail.forEach(email -> {
					try {
						helper.setTo(email);
					} catch (MessagingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
							
						 
				
				
				 helper.setSubject("Your job on Handymanapp");
	               	helper.setFrom("akan.okure@gmail.com");
	              // 	helper.setTo(handymanService.);
	               	
	               	
	             	Map<String, Object> model = new HashMap<String, Object>();
   	             
	               	 model.put("handyman", handyman);
	                
	            	String text = geFreeMarkerTemplateContent(model);
	                System.out.println("Template content : "+text);

	                // use the true flag to indicate you need a multipart message
	            	helper.setText(text, true);

			}
		};
		return preparator;
		}
	               	
            	
        		//	List<Handyman> handyman = new ArrayList<Handyman>();

        			//List<Job> jobs = new ArrayList<Job>();

        		//	List<String> handymanEmail = new ArrayList<String>();

        		//	handyman.addAll(handymanService.getAllHandyman());

        		//	jobs.addAll(jobService.getAllJobpost());

        			// iterate over handyman list and get handyman id, and email.

        		//	Iterator<Handyman> iterator = handyman.iterator();

        		//	while (iterator.hasNext()) {

        			//	Handyman handymaniter = iterator.next();

        			//	Iterator<Job> iteratorjob = jobs.iterator();

        			//	while (iteratorjob.hasNext()) {

        			//		Job jobiter = iteratorjob.next();

        				//	if (handymaniter.getBusinesstype().equals(jobiter.getJob_type())

        					//		&& handymaniter.getBusinessAddress().equals(jobiter.getJob_lga()))

        						// handymaniter.getEmail().toLowerCase();

        					//	handymanEmail.add(handymaniter.getEmail().toLowerCase());

        				//	handymanEmail.forEach(email -> mailService.sendEmail(email));
        					
        				// 	helper.setSubject("Your job on Handymanapp");
        	             //  	helper.setFrom("solutionproviders062020@gmail.com");
        	               	
        	               	
        	               	//helper.setTo(handymanEmail.forEach(email -> aa));
        	               	
        	               	//  handymanEmail.forEach(email -> {
							//	try {
							//		helper.setTo(email);
							//	} catch (MessagingException e) {
									// TODO Auto-generated catch block
								//	e.printStackTrace();
							//	}
							//}
        	       
        	               	/*Map<String, Object> model = new HashMap<String, Object>();
        	             
        	               	 model.put("handyman", handyman);
        	                
        	            	String text = geFreeMarkerTemplateContent(model);
        	                System.out.println("Template content : "+text);

        	                // use the true flag to indicate you need a multipart message
        	            	helper.setText(text, true);*/

        	            	//Additionally, let's add a resource as an attachment as well.
        	            //	helper.addAttachment("cutie.png", new ClassPathResource("linux-icon.png"));

        	  //          }
        	//        };
		//};
        	       
        		
        							

        				

				
        		
            	
   

public String geFreeMarkerTemplateContent(Map<String, Object> model){
	StringBuffer content = new StringBuffer();
	try{
     content.append(FreeMarkerTemplateUtils.processTemplateIntoString( 
    		 freemarkerConfiguration.getTemplate("fm_mailTemplate.txt"),model));
     return content.toString();
	}catch(Exception e){
		System.out.println("Exception occured while processing fmtemplate:"+e.getMessage());
	}
      return "";
}
		
		}
		

