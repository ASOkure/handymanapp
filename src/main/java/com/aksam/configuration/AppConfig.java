package com.aksam.configuration;




import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.aksam")
//@ComponentScan({"com.aksam.configuration"})


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

	
	 
	 
}

