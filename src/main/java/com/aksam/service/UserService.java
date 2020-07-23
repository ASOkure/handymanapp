package com.aksam.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.aksam.appuser.ApplicationUser;
import com.aksam.entity.User;

public interface UserService extends UserDetailsService {
	
	
	 User findByUserName(String userName);

	  void save(ApplicationUser applicationUser);


}
