package com.aksam.dao;

import com.aksam.entity.User;

public interface UserDao {
	
	 User findByUserName(String userName);

	  void save(User user);


}
