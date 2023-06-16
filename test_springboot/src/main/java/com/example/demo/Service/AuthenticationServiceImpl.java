/*package com.example.demo.Service;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements IAuthenticationService {
    public String authenticateAndGetUsername() {
        // Xác thực người dùng
		
		 * Authentication authentication = authenticationManager.authenticate( new
		 * UsernamePasswordAuthenticationToken(username, password));
		 * 
		 * // Lấy thông tin của người dùng UserDetails userDetails = (UserDetails)
		 * authentication.getPrincipal(); String userID = userDetails.getUsername();
		 * 
		 * return userID;
		 
    	
    	Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    	String username = authentication.getName();
    	return username;
    }
}

*/