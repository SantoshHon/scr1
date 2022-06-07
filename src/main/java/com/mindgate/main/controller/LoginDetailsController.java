package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.pojo.LoginDetails;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("logins")
public class LoginDetailsController {
	@Autowired
	private com.mindgate.main.service.LoginDetailsServiceInterFace LoginDetailsServiceInterFace;

	@RequestMapping(value = "login", method = RequestMethod.POST)
     public LoginDetails login(@RequestBody LoginDetails loginDetails)
     {
		return LoginDetailsServiceInterFace.login(loginDetails);
		
     }

	
	//@RequestMapping(value = "login", method = RequestMethod.POST)
	public boolean addLoginDetails(@RequestBody LoginDetails loginDetails) {
		System.out.println(loginDetails);
		return LoginDetailsServiceInterFace.addLoginDetails(loginDetails);

	}
	@RequestMapping(value = "login", method = RequestMethod.PUT)
	public boolean updateLoginDetails(@RequestBody LoginDetails loginDetails)
	{
		return LoginDetailsServiceInterFace.updateLoginDetails(loginDetails);
		
	}
	@RequestMapping(value = "login/{id}", method = RequestMethod.DELETE)
	public boolean deleteLoginDetails(@PathVariable("id")  int loginId) 
	{
		return LoginDetailsServiceInterFace.deleteLoginDetails(loginId);
		
	}
	@RequestMapping(value = "login/{id}", method = RequestMethod.GET)
	public LoginDetails getLoginDetailsByloginId(@PathVariable("id") int loginId)
	{
		return LoginDetailsServiceInterFace.getLoginDetailsByloginId(loginId);
		
	}
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public List<LoginDetails>getAllLoginDetails()
	{
		return LoginDetailsServiceInterFace.getAllLoginDetails();
		
	}

}
