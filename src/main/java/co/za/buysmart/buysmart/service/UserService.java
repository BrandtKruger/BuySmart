package co.za.buysmart.buysmart.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import co.za.buysmart.buysmart.model.User;
import co.za.buysmart.buysmart.model.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	 
	User findByEmail(String email);	    
	
	User save(UserRegistrationDto registration);
}
