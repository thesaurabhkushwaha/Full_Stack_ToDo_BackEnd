package com.in18minutes.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthenticationController {
	
	@GetMapping("/basicauth")
	public AuthenticationBean basicAuth() {
		//throw new RuntimeException("Oops! an error occurred - contact support : 12121212");
		return new AuthenticationBean("You are authenticated");
	}	
}
