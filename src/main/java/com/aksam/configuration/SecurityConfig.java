package com.aksam.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

import com.aksam.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

// add a reference to our security data source

	@Autowired
	private UserService userService;

	/*
	 * @Autowired private DataSource securityDataSource;
	 */

	@Autowired
	private CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler;

	/*
	 * @Autowired private DataSource securityDataSource;
	 * 
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception {auth.jdbcAuthentication().dataSource(securityDataSource); }
	 */

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.authenticationProvider(authenticationProvider());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/hirer").hasRole("HIRER")
				.antMatchers("/handyman/**").hasRole("HANDYMAN").antMatchers("/admin/**").hasRole("ADMIN").and()
				.formLogin().loginPage("/showMyLoginPage").loginProcessingUrl("/authenticateTheUser")
				.successHandler(customAuthenticationSuccessHandler).permitAll().and().logout().permitAll().and()
				.exceptionHandling().accessDeniedPage("/access-denied");

	}

	// beans
	// bcrypt bean definition
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	
	//authenticationProvider bean definition
		@Bean
		public DaoAuthenticationProvider authenticationProvider() {
			DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
			auth.setUserDetailsService(userService); //set the custom user details service
			auth.setPasswordEncoder(passwordEncoder()); //set the password encoder - bcrypt
			return auth;
		}
	
	
	
	
	
	/*
	 * @Bean public UserDetailsManager userDetailsManager() {
	 * 
	 * JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager();
	 * 
	 * jdbcUserDetailsManager.setDataSource(securityDataSource);
	 * 
	 * return jdbcUserDetailsManager; }
	 */

}
