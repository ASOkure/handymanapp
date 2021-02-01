package com.aksam.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aksam.appuser.ApplicationUser;
import com.aksam.service.UserService;



@Controller
@RequestMapping("/register")
public class RegistrationController {
	

	/*
	 * @Autowired private UserService userService;
	 */
	@Autowired
    private UserService userService;
	
    private Logger logger = Logger.getLogger(getClass().getName());
    
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}	
	
	@GetMapping("/showRegistrationForm")
	public String showMyLoginPage(Model theModel) {
		
		theModel.addAttribute("applicationUser", new ApplicationUser());
		
		return "registration-form";
	}

	@PostMapping("/processRegistrationForm")
	public String processRegistrationForm(
				@Valid @ModelAttribute("applicationUser") ApplicationUser theApplicationUser, 
				BindingResult theBindingResult, 
				Model theModel) {
		
		String userName = theApplicationUser.getUserName();
		logger.info("Processing registration form for: " + userName);
		
		// form validation
		 if (theBindingResult.hasErrors()){
			 return "registration-form";
	        }

		// check the database if user already exists
        com.aksam.entity.User existing = userService.findByUserName(userName);
        
        
         
        if (existing != null){
        	theModel.addAttribute("applicationUser", new ApplicationUser());
			theModel.addAttribute("registrationError", "User name already exists.");

			logger.warning("User name already exists.");
        	return "registration-form";
        }
     // create user account        						
        userService.save(theApplicationUser);
        
        logger.info("Successfully created user: " + userName);
        
        return "registration-confirmation";		
	}
}

	
	
	
	/*private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	
    private Logger logger = Logger.getLogger(getClass().getName());
    
    private Map<String, String> roles;
    
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}	
	
	
	@PostConstruct
	protected void loadRoles() {
		
		// using hashmap, could also read this info from a database
		
		roles = new LinkedHashMap<String, String>();
		
		// key=the role, value=display to user 
		roles.put("ROLE_HANDYMAN", "Handyman");
		roles.put("ROLE_HIRER", "Hirer");
		roles.put("ROLE_ADMIN", "Admin");		
	}
	
	
	@GetMapping("/showRegistrationForm")
	public String showMyLoginPage(Model theModel) {
		
		theModel.addAttribute("applicationUser", new ApplicationUser());
		
		// add roles to the model for form display
				theModel.addAttribute("roles", roles);
		
		return "registration-form";
	}

	@PostMapping("/processRegistrationForm")
	public String processRegistrationForm(
				@Valid @ModelAttribute("applicationUser") ApplicationUser theApplicationUser, 
				BindingResult theBindingResult, 
				Model theModel) {
		
		String userName = theApplicationUser.getUserName();
		logger.info("Processing registration form for: " + userName);
		
		// form validation
		 if (theBindingResult.hasErrors()){
			 
			 
			 
			 theModel.addAttribute("applicationUser", new ApplicationUser());
				
				// add roles to the model for form display
				theModel.addAttribute("roles", roles);
				
				theModel.addAttribute("registrationError", "User name/password can not be empty.");
				
				logger.warning("User name/password can not be empty.");
			 
			 
			 return "registration-form";
	        }
		 
		// check the database if user already exists
			boolean userExists = doesUserExist(userName);
			
			if (userExists) {
				theModel.addAttribute("applicationUser", new ApplicationUser());

				// add roles to the model for form display
				theModel.addAttribute("roles", roles);
				
				theModel.addAttribute("registrationError", "User name already exists.");

				logger.warning("User name already exists.");
				
				return "registration-form";			
			}

			// encrypt the password
	        String encodedPassword = passwordEncoder.encode(theApplicationUser.getPassword());

	        // prepend the encoding algorithm id
	        encodedPassword = "{bcrypt}" + encodedPassword;
	                 
			// give user default role of "employee"
	        List<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList();
	        authorities.add(new SimpleGrantedAuthority("ROLE_HANDYMAN"));
	        
	        // if the user selected role other than employee, 
	        // then add that one too (multiple roles)
	        String formRole = theApplicationUser.getFormRole();

	        if (!formRole.equals("ROLE_HANDYMAN")) {
	        		authorities.add(new SimpleGrantedAuthority(formRole));
	        }
	        
	        // create user object (from Spring Security framework)
	        User tempUser = new User(userName, encodedPassword, authorities);

	        // save user in the database
	        userDetailsManager.createUser(tempUser);		
			
	        logger.info("Successfully created user: " + userName);
	        
	        return "registration-confirmation";		
		}
		
		private boolean doesUserExist(String userName) {
			
			logger.info("Checking if user exists: " + userName);
			
			// check the database if the user already exists
			boolean exists = userDetailsManager.userExists(userName);
			
			logger.info("User: " + userName + ", exists: " + exists);
			
			return exists;
		}

	}

			
*/			
			
			
			/*
			 * // check the database if user already exists User existing =
			 * userService.findByUserName(userName); if (existing != null){
			 * theModel.addAttribute("applicationUser", new ApplicationUser());
			 * theModel.addAttribute("registrationError", "User name already exists.");
			 * 
			 * logger.warning("User name already exists."); return "registration-form"; }
			 */
     // create user account        						
      /*  userService.save(theApplicationUser);
        
        logger.info("Successfully created user: " + userName);
        
        return "registration-confirmation";		
	}
}*/



