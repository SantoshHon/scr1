package com.mindgate.main.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.pojo.TravelDetails;
import com.mindgate.main.repository.TravelDetailsRepositoryInterface;


@Service
public class TravelDetailsService implements TravelDetailsServiceInterface{
	@Autowired
	private TravelDetailsRepositoryInterface travelDetailsRepositoryInterface;

	@Override
	public boolean addTravelDetails(TravelDetails travelDetails) {
		return travelDetailsRepositoryInterface.addTravelDetails(travelDetails);
	}

	@Override
	public boolean updateTravelDetailsByTravelDetailsId(TravelDetails travelDetails) {
		return travelDetailsRepositoryInterface.updateTravelDetailsByTravelDetailsId(travelDetails);
	}

	@Override
	public boolean deleteTravelDetailsByTravelDetailsId(int travelDetailsId) {
		return travelDetailsRepositoryInterface.deleteTravelDetailsByTravelDetailsId(travelDetailsId);
	}

	@Override
	public TravelDetails getTravelDetailsByTravelDetailsId(int travelDetailsId) {
		return travelDetailsRepositoryInterface.getTravelDetailsByTravelDetailsId(travelDetailsId);
	}

	@Override
	public List<TravelDetails> getAllTravelDetails() {
		return travelDetailsRepositoryInterface.getAllTravelDetails();
	}

}
