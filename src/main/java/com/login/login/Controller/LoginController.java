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

		String msg = loginService.validateUserDetails(request);
		return msg;
	}

	@GetMapping("/register")
	public String getRegister() {
		return "registration";
	}

	@PostMapping("/saveRegister")
	public String saveRegister(HttpServletRequest request) {
		String saveUserDetails = loginService.saveUserDetails(request);
		return saveUserDetails;
	}

}
