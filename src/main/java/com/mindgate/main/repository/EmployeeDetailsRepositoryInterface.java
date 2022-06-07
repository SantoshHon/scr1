package com.mindgate.main.repository;



import java.util.List;

import com.mindgate.main.pojo.EmployeeDetails;

public interface EmployeeDetailsRepositoryInterface {
	public boolean addEmployeeDetails(EmployeeDetails employeeDetails);
	public boolean updateEmployeeDetails(EmployeeDetails employeeDetails);
	public boolean deleteEmployeeDetailsByemployeeDetailsId(int employeeDetailsId);
	public EmployeeDetails getEmployeeDetailsByemployeeDetailsId(int employeeDetailsId);
	public List<EmployeeDetails>getAllEmployeeDetails();

}
