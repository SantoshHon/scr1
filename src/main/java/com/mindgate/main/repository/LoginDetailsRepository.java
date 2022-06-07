package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.pojo.LoginDetails;

@Repository
public class LoginDetailsRepository implements LoginDetailsRepositoryInterface {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String INSERT_LoginDetails = "INSERT INTO LOGIN_DETAILS(PASSWORD,ROLE) VALUES(?,?)";
	private static final String SELECT_ALL_LoginDetails = "SELECT * FROM LOGIN_DETAILS";
	private static final String SELECT_SINGLE_LoginDetails = "SELECT * FROM LOGIN_DETAILS WHERE LOGIN_ID = ?";
	private static final String UPDATE_LoginDetails = "UPDATE LOGIN_DETAILS SET PASSWORD = ? , ROLE = ? "
			+ "	WHERE LOGIN_ID = ?";
	private static final String DELETE_LoginDetails = "DELETE LOGIN_DETAILS WHERE LOGIN_ID = ?";
	
	private static final String   login="SELECT * FROM LOGIN_DETAILS WHERE LOGIN_ID = ? AND PASSWORD = ? ";

	private int resultCount;

	// @Override
	public boolean addLoginDetails(LoginDetails loginDetails) {

		//System.out.println("inserting new loginDetails into database");
	//	System.out.println(loginDetails);

		Object[] args = { loginDetails.getPassword(), loginDetails.getRole() };

		resultCount = jdbcTemplate.update(INSERT_LoginDetails, args);

		if (resultCount > 0)
			return true;
		else
			return false;

	}

	// @Override
	public boolean updateLoginDetails(LoginDetails loginDetails) {
		Object[] args = { loginDetails.getPassword(), loginDetails.getRole(), loginDetails.getLoginId() };
		resultCount = jdbcTemplate.update(UPDATE_LoginDetails, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	// @Override
	public boolean deleteLoginDetails(int loginId) {
		Object[] args = { loginId };
		resultCount = jdbcTemplate.update(DELETE_LoginDetails, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	// @Override
	public LoginDetails getLoginDetailsByloginId(int loginId) {
		Object[] args = { loginId };
		LoginDetails details = jdbcTemplate.queryForObject(SELECT_SINGLE_LoginDetails, new LoginDetailRowMapper(),
				args);
		return details;
	}

	// @Override
	public List<LoginDetails> getAllLoginDetails() {

		List<LoginDetails> details = jdbcTemplate.query(SELECT_ALL_LoginDetails, new LoginDetailRowMapper());
		return details;

	}

	@Override
	public LoginDetails login(LoginDetails loginDetails) {
		try {
		Object[] args = {loginDetails.getLoginId(),loginDetails.getPassword() };
		LoginDetails loginDetails1=jdbcTemplate.queryForObject(login, new LoginDetailRowMapper(),args);
		
			
		return loginDetails1;
		}
		catch (Exception e) {
			return new LoginDetails();
		}
	}

}
