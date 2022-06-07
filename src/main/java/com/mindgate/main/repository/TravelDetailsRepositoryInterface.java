package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.pojo.TravelDetails;

public interface TravelDetailsRepositoryInterface {
	public boolean addTravelDetails(TravelDetails travelDetails);
	public boolean updateTravelDetailsByTravelDetailsId(TravelDetails travelDetails);
	public boolean deleteTravelDetailsByTravelDetailsId(int travelDetailsId);
	public TravelDetails getTravelDetailsByTravelDetailsId(int travelDetailsId);
	public List<TravelDetails> getAllTravelDetails();

}
