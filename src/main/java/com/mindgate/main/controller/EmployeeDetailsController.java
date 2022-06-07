package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.pojo.EmployeeDetails;
import com.mindgate.main.service.EmployeeDetailsServiceInterface;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("employeetraval")
public class EmployeeDetailsController {
	@Autowired
	private EmployeeDetailsServiceInterface employeeDetailsServiceInterface;

	@RequestMapping(value = "employeedetails", method = RequestMethod.POST)
	public boolean addEmployeeDetails(@RequestBody EmployeeDetails employeeDetails) {
		System.out.println(employeeDetails);
		return employeeDetailsServiceInterface.addEmployeeDetails(employeeDetails);

	}

	@RequestMapping(value = "employeedetails", method = RequestMethod.PUT)
	public boolean updateEmployeeDetails(@RequestBody EmployeeDetails employeeDetails) {
		return employeeDetailsServiceInterface.updateEmployeeDetails(employeeDetails);

	}

	@RequestMapping(value = "employeedetails/{id}", method = RequestMethod.DELETE)
	public boolean deleteEmployeeDetailsByemployeeDetailsId(@PathVariable("id") int employeeDetailsId) {
		return employeeDetailsServiceInterface.deleteEmployeeDetailsByemployeeDetailsId(employeeDetailsId);

	}

	@RequestMapping(value = "employeedetails/{id}", method = RequestMethod.GET)
	public EmployeeDetails getEmployeeDetailsByemployeeDetailsId(@PathVariable("id") int employeeDetailsId) {
		return employeeDetailsServiceInterface.getEmployeeDetailsByemployeeDetailsId(employeeDetailsId);

	}

	@RequestMapping(value = "employeedetails", method = RequestMethod.GET)
	public List<EmployeeDetails> getAllEmployeeDetails() {
		return employeeDetailsServiceInterface.getAllEmployeeDetails();

	}
}
