package com.mindgate.main.pojo;



import java.time.LocalDate;

import com.mindgate.main.pojo.EmployeeDetails;


public class TravellingRequestDetails {
	
	 private int travelRequestId;
	 private LocalDate travelDepartureDate;
	 private LocalDate travelReturndate;
	 private String travelReason;
	 private String travelMode;
	 private String tarvelStatus;
	 private String ProjectManagerStatus;
	 private String directorstatus;
	 private String travelLocation;
	 
	 EmployeeDetails employeeDetails;
	 TravelDetails travelDetails;
	TravelDocumentDetails travelDocumentDetails;
	public TravellingRequestDetails() {
		// TODO Auto-generated constructor stub
	}
	public TravellingRequestDetails(int travelRequestId, LocalDate travelDepartureDate, LocalDate travelReturndate,
			String travelReason, String travelMode, String tarvelStatus, String projectManagerStatus,
			String directorstatus, String travelLocation, EmployeeDetails employeeDetails, TravelDetails travelDetails,
			TravelDocumentDetails travelDocumentDetails) {
		super();
		this.travelRequestId = travelRequestId;
		this.travelDepartureDate = travelDepartureDate;
		this.travelReturndate = travelReturndate;
		this.travelReason = travelReason;
		this.travelMode = travelMode;
		this.tarvelStatus = tarvelStatus;
		ProjectManagerStatus = projectManagerStatus;
		this.directorstatus = directorstatus;
		this.travelLocation = travelLocation;
		this.employeeDetails = employeeDetails;
		this.travelDetails = travelDetails;
		this.travelDocumentDetails = travelDocumentDetails;
	}
	public int getTravelRequestId() {
		return travelRequestId;
	}
	public void setTravelRequestId(int travelRequestId) {
		this.travelRequestId = travelRequestId;
	}
	public LocalDate getTravelDepartureDate() {
		return travelDepartureDate;
	}
	public void setTravelDepartureDate(LocalDate travelDepartureDate) {
		this.travelDepartureDate = travelDepartureDate;
	}
	public LocalDate getTravelReturndate() {
		return travelReturndate;
	}
	public void setTravelReturndate(LocalDate travelReturndate) {
		this.travelReturndate = travelReturndate;
	}
	public String getTravelReason() {
		return travelReason;
	}
	public void setTravelReason(String travelReason) {
		this.travelReason = travelReason;
	}
	public String getTravelMode() {
		return travelMode;
	}
	public void setTravelMode(String travelMode) {
		this.travelMode = travelMode;
	}
	public String getTarvelStatus() {
		return tarvelStatus;
	}
	public void setTarvelStatus(String tarvelStatus) {
		this.tarvelStatus = tarvelStatus;
	}
	public String getProjectManagerStatus() {
		return ProjectManagerStatus;
	}
	public void setProjectManagerStatus(String projectManagerStatus) {
		ProjectManagerStatus = projectManagerStatus;
	}
	public String getDirectorstatus() {
		return directorstatus;
	}
	public void setDirectorstatus(String directorstatus) {
		this.directorstatus = directorstatus;
	}
	public String getTravelLocation() {
		return travelLocation;
	}
	public void setTravelLocation(String travelLocation) {
		this.travelLocation = travelLocation;
	}
	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}
	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
	public TravelDetails getTravelDetails() {
		return travelDetails;
	}
	public void setTravelDetails(TravelDetails travelDetails) {
		this.travelDetails = travelDetails;
	}
	public TravelDocumentDetails getTravelDocumentDetails() {
		return travelDocumentDetails;
	}
	public void setTravelDocumentDetails(TravelDocumentDetails travelDocumentDetails) {
		this.travelDocumentDetails = travelDocumentDetails;
	}
	@Override
	public String toString() {
		return "TravellingRequestDetails [travelRequestId=" + travelRequestId + ", travelDepartureDate="
				+ travelDepartureDate + ", travelReturndate=" + travelReturndate + ", travelReason=" + travelReason
				+ ", travelMode=" + travelMode + ", tarvelStatus=" + tarvelStatus + ", ProjectManagerStatus="
				+ ProjectManagerStatus + ", directorstatus=" + directorstatus + ", travelLocation=" + travelLocation
				+ ", employeeDetails=" + employeeDetails + ", travelDetails=" + travelDetails
				+ ", travelDocumentDetails=" + travelDocumentDetails + "]";
	}
	
	 

}
