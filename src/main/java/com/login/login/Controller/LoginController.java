package com.login.login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.login.Service.LoginService;

import jakarta.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@GetMapping("/welcome")
	public String sayHello() {
		return "hello";
	}

	@PostMapping("/validateUser")
	public String validateUser(HttpServletRequest request) {
		boolean saveUserDetails = loginService.validateUserDetails(request);
		return "hello";
	}

	@GetMapping("/register")
	public String getRegister() {
		return "registration";
	}

	@PostMapping("/saveRegister")
	public String saveRegister(HttpServletRequest request) {
		boolean saveUserDetails = loginService.saveUserDetails(request);
		return "registration";
	}

}
