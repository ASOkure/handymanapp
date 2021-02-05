package com.aksam.dao;

import java.util.List;


import com.aksam.entity.User;

public interface UserDao {
	
	 User findByUserName(String userName);

	  void save(User user);

		 List<User> getAllUsers();

}
