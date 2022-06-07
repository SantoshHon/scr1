package com.mindgate.main.repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.main.pojo.EmployeeDetails;
import com.mindgate.main.pojo.TravelDetails;
import com.mindgate.main.pojo.TravelDocumentDetails;
import com.mindgate.main.pojo.TravellingRequestDetails;

@Repository
@Scope("prototype")
public class TravlingRequestDetailsRowMapper implements RowMapper<TravellingRequestDetails>{
    @Autowired
	private EmployeeDetailsRepository employeeDetailsRepository;
    @Autowired 
    private TravelDocumentDetailsRepository detailsRepository;
    @Autowired 
    private TravelDetailsRepository travelDetailsRepository;
	@Override
	public TravellingRequestDetails mapRow(ResultSet resultSet, int i) throws SQLException {
		int travelRequestId = resultSet.getInt("TRAVEL_REQUEST_ID");
		LocalDate localDate = resultSet.getDate("TRAVEL_DEPARTURE_DATE").toLocalDate();
		
		LocalDate localDate1 = resultSet.getDate("TRAVEL_RETURN_DATE").toLocalDate();
		
		String travelReason = resultSet.getString("TRAVEL_REASON");
		String vtravelMode = resultSet.getString("TRAVEL_MODE");
		String tarvelStatus = resultSet.getString("TRAVEL_STATUS");
		String ProjectManagerStatus = resultSet.getString("PROJECT_MANAGER_STATUS");
		String directorstatus = resultSet.getString("DIRECTOR_STATUS");
		String travelLocation = resultSet.getString("TRAVEL_LOCATION");
		int employeeDetailsId = resultSet.getInt("EMPLOYEE_ID");
		EmployeeDetails employeeDetails=employeeDetailsRepository.getEmployeeDetailsByemployeeDetailsId(employeeDetailsId);
		
		int travelDetailsId =  resultSet.getInt("TRAVEL_DETAILS_ID");
		TravelDetails travelDetails =travelDetailsRepository.getTravelDetailsByTravelDetailsId(travelDetailsId);
		
		int documentId = resultSet.getInt("DOCUMENT_ID");
		TravelDocumentDetails travelDocumentDetails =detailsRepository.getTravelDocumentDetailsByTravelDetailsId(documentId);
		TravellingRequestDetails travellingRequestDetails=new TravellingRequestDetails(travelRequestId, localDate, localDate1, travelReason, vtravelMode, tarvelStatus, ProjectManagerStatus, directorstatus, travelLocation, employeeDetails, travelDetails, travelDocumentDetails);
		return travellingRequestDetails;
	}

}
