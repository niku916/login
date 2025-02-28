package com.login.login.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.login.Entity.UserManagementEntity;
import com.login.login.Repo.LoginRepo;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class LoginService {

	@Autowired
	LoginRepo loginRepo;

	public String saveUserDetails(HttpServletRequest request) {
		String msg = "";
		String Name = request.getParameter("firstname");
		String Email = request.getParameter("email");
		String MobileNumber = request.getParameter("mobile");
		String Password = request.getParameter("password");
		UserManagementEntity managementEntity = new UserManagementEntity();
		managementEntity.setUserName(Name);
		managementEntity.setEmailId(Email);
		managementEntity.setMobileNumber(MobileNumber);
		managementEntity.setPassword(Password);
		UserManagementEntity save = loginRepo.save(managementEntity);
		if (save != null) {
			msg = "success";
		} else {
			msg = "failed";
		}

		return msg;
	}

	public String validateUserDetails(HttpServletRequest request) {
		String isValidMsg = "failed";
		UserManagementEntity entity = new UserManagementEntity();
		entity.setUserName(request.getParameter("username"));
		entity.setPassword(request.getParameter("password"));
		Optional<UserManagementEntity> validUser = loginRepo.findByUserNameAndPassword(entity.getUserName(),
				entity.getPassword());
		if (validUser.isPresent()) {
			isValidMsg = "success";
		} else {
			isValidMsg = "failed";
		}
		return isValidMsg;
	}

}
