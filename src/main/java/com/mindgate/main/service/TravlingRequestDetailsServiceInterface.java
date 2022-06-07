package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.pojo.TravellingRequestDetails;

public interface TravlingRequestDetailsServiceInterface {
	public boolean addTravellingRequestDetails(TravellingRequestDetails travellingRequestDetails);
	public boolean updateTravellingRequestDetailsBytravelRequestId(TravellingRequestDetails travellingRequestDetails);
	public boolean deleteTravellingRequestDetailsBytravelRequestId(int travelRequestId);
	public TravellingRequestDetails getTravellingRequestDetailsBytravelRequestId(int travelRequestId);
	public List<TravellingRequestDetails> getAllTravellingRequestDetails();


}
