package com.mindgate.main.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.pojo.EmployeeDetails;
import com.mindgate.main.repository.EmployeeDetailsRepositoryInterface;


@Service
public class EmployeeDetailsService implements EmployeeDetailsServiceInterface {
@Autowired
private EmployeeDetailsRepositoryInterface employeeDetailsRepositoryInterface;
	@Override
	public boolean addEmployeeDetails(EmployeeDetails employeeDetails) {
		return employeeDetailsRepositoryInterface.addEmployeeDetails(employeeDetails);
	}

	@Override
	public boolean updateEmployeeDetails(EmployeeDetails employeeDetails) {
		return employeeDetailsRepositoryInterface.updateEmployeeDetails(employeeDetails);
	}

	@Override
	public boolean deleteEmployeeDetailsByemployeeDetailsId(int employeeDetailsId) {
		return employeeDetailsRepositoryInterface.deleteEmployeeDetailsByemployeeDetailsId(employeeDetailsId);
	}

	@Override
	public EmployeeDetails getEmployeeDetailsByemployeeDetailsId(int employeeDetailsId) {
		return employeeDetailsRepositoryInterface.getEmployeeDetailsByemployeeDetailsId(employeeDetailsId);
	}

	@Override
	public List<EmployeeDetails> getAllEmployeeDetails() {
		return employeeDetailsRepositoryInterface.getAllEmployeeDetails();
	}

}
