package com.aksam.service;

import java.util.Arrays;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aksam.appuser.ApplicationUser;
import com.aksam.dao.RoleDao;
import com.aksam.dao.UserDao;
import com.aksam.entity.Role;
import com.aksam.entity.User;


@Service
public class UserServiceImpl implements UserService {
	
	
	// need to inject user dao
		@Autowired
		private UserDao userDao;

		@Autowired
		private RoleDao roleDao;
		
		
		  @Autowired private BCryptPasswordEncoder passwordEncoder;
		 

		@Override
		@Transactional
		public User findByUserName(String userName) {
			// check the database if the user already exists
			return userDao.findByUserName(userName);
		}

		@Override
		@Transactional
		public void save(ApplicationUser applicationUser) {
			User user = new User();
			 // assign user details to the user object
			user.setUserName(applicationUser.getUserName());
			user.setPassword(passwordEncoder.encode(applicationUser.getPassword()));
			user.setFirstName(applicationUser.getFirstName());
			user.setLastName(applicationUser.getLastName());
			user.setEmail(applicationUser.getEmail());

			// give user default role of "employee"
			user.setRoles(Arrays.asList(roleDao.findRoleByName("ROLE_HANDYMAN")));

			 // save user in the database
			userDao.save(user);
		}

		@Override
		@Transactional
		public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
			User user = userDao.findByUserName(userName);
			if (user == null) {
				throw new UsernameNotFoundException("Invalid username or password.");
			}
			return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
					mapRolesToAuthorities(user.getRoles()));
		}

		private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
			return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
		}

		@Override
		@Transactional
		public List<User> getAllUsers() {
			
			
			return userDao.getAllUsers();
			
		}
	}



