package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.main.pojo.EmployeeDetails;
import com.mindgate.main.pojo.LoginDetails;

@Repository
@Scope("prototype")
public class EmployeeDetailsRowMapper implements RowMapper<EmployeeDetails> {

	@Autowired
	private LoginDetailsRepository loginDetailsRepository;

	public EmployeeDetails mapRow(ResultSet resultSet, int i) throws SQLException {
		System.out.println("in emplohyeedetailsrowmapper");
		int employeeDetailsId = resultSet.getInt("EMPLOYEE_ID");
		String firstName = resultSet.getString("FIRST_NAME");
		String lastName = resultSet.getString("LAST_NAME");
		String address = resultSet.getString("ADDRESS");
		int managerId = resultSet.getInt("MANAGER_ID");
		String city = resultSet.getString("CITY");
		String state = resultSet.getString("STATE");
		String emailId = resultSet.getString("EMAIL_ID");
		String contactNo = resultSet.getString("CONTACT_NO");
		String designation = resultSet.getString("DESIGNATION");
		int loginId = resultSet.getInt("LOGIN_ID");
		LoginDetails loginDetails = loginDetailsRepository.getLoginDetailsByloginId(loginId);
		// LoginDetails LoginDetails = (com.mindgate.main.pojo.LoginDetails)
		// resultSet.getObject(i);
		EmployeeDetails employeeDetails = new EmployeeDetails(employeeDetailsId, firstName, lastName, address,
				managerId, city, state, emailId, contactNo, designation, loginDetails);
		System.out.println(employeeDetails);
		return employeeDetails;

	}

}
