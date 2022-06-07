package com.mindgate.main.service;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.pojo.LoginDetails;
import com.mindgate.main.repository.LoginDetailsRepositoryInterface;




@Service
public class LoginDetailsService  implements LoginDetailsServiceInterFace{
     @Autowired
	private LoginDetailsRepositoryInterface loginDetailsRepositoryInterface;
	@Override
	public boolean addLoginDetails(LoginDetails loginDetails) {
		return loginDetailsRepositoryInterface.addLoginDetails(loginDetails);
	}

	@Override
	public boolean updateLoginDetails(LoginDetails  loginDetails ) {
		return loginDetailsRepositoryInterface.updateLoginDetails(loginDetails);
	}

	@Override
	public boolean deleteLoginDetails(int loginId) {
		return loginDetailsRepositoryInterface.deleteLoginDetails(loginId);
	}

	@Override
	public LoginDetails getLoginDetailsByloginId(int loginId) {
		return loginDetailsRepositoryInterface.getLoginDetailsByloginId(loginId);
	}

	@Override
	public List<LoginDetails> getAllLoginDetails() {
		return loginDetailsRepositoryInterface.getAllLoginDetails();
	}

	@Override
	public LoginDetails login(LoginDetails loginDetails) {
		
		return loginDetailsRepositoryInterface.login(loginDetails);
	}

}
