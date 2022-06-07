package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.pojo.EmployeeDetails;

public interface EmployeeDetailsServiceInterface {
	
	public boolean addEmployeeDetails(EmployeeDetails employeeDetails);
	public boolean updateEmployeeDetails(EmployeeDetails employeeDetails);
	public boolean deleteEmployeeDetailsByemployeeDetailsId(int employeeDetailsId);
	public EmployeeDetails getEmployeeDetailsByemployeeDetailsId(int employeeDetailsId);
	public List<EmployeeDetails>getAllEmployeeDetails();

}
