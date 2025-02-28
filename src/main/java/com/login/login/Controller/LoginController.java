package com.login.login.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class LoginController {

	@GetMapping("/welcome")
	public String sayHello() {
		
		return "hello";

	}
	
	@GetMapping("/register")
	public String getRegister() {
		
		return "registration";

	}

}
