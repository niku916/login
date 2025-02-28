package com.login.login.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.login.Dto.UserManagementDTO;
import com.login.login.Entity.UserManagementEntity;
import com.login.login.Repo.LoginRepo;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class LoginService {

	@Autowired
	LoginRepo loginRepo;

	public boolean saveUserDetails(HttpServletRequest request) {

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
//		if(save.) {
//			
//		}

		return true;
	}

	public boolean validateUserDetails(HttpServletRequest request) {
		boolean isValid = false;
		UserManagementEntity entity = new UserManagementEntity();
		entity.setUserName(request.getParameter("username"));
		entity.setPassword(request.getParameter("password"));
		UserManagementEntity validUser = loginRepo.findByUserNameAndPassword(entity.getUserName(), entity.getPassword());
		if (validUser != null) {
			isValid = true;
		}
		return isValid;
	}

}
