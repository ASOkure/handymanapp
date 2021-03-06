package com.aksam.configuration;




import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;





@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.aksam")



public class AppConfig implements WebMvcConfigurer {

	

	/**
	 * Configure ViewResolvers to deliver preferred views.
	 */
	/*
	 * @Bean public void configureViewResolvers(ViewResolverRegistry registry) {
	 * 
	 * InternalResourceViewResolver viewResolver = new
	 * InternalResourceViewResolver(); viewResolver.setViewClass(JstlView.class);
	 * viewResolver.setPrefix("/WEB-INF/views/"); viewResolver.setSuffix(".jsp");
	 * registry.viewResolver(viewResolver); }
	 */

	// define a bean for ViewResolver
	@Bean
	public ViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	/**
	 * Configure ResourceHandlers to serve static resources like CSS/ Javascript
	 * etc...
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	}

	
	 @Bean
	    public JavaMailSender getMailSender(){
	        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
	         
	        //Using gmail
	        mailSender.setHost("smtp.gmail.com");
	        mailSender.setPort(587);
	        mailSender.setUsername("akan.okure@gmail.com");
	        mailSender.setPassword("uweminam7282");
	         
	        Properties javaMailProperties = new Properties();
	        javaMailProperties.put("mail.smtp.starttls.enable", "true");
	        javaMailProperties.put("mail.smtp.auth", "true");
	        javaMailProperties.put("mail.transport.protocol", "smtp");
	        javaMailProperties.put("mail.debug", "true");//Prints out everything on screen
	         
	        mailSender.setJavaMailProperties(javaMailProperties);
	        return mailSender;
	    }
	 
	 /*
	     * FreeMarker configuration.
	     */
	    @Bean
	    public FreeMarkerConfigurationFactoryBean getFreeMarkerConfiguration() {
	        FreeMarkerConfigurationFactoryBean bean = new FreeMarkerConfigurationFactoryBean();
	        bean.setTemplateLoaderPath("/fmtemplates/");
	        return bean;
	    }
}

