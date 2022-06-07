package com.mindgate.main.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mindgate.main.pojo.TravellingRequestDetails;
import com.mindgate.main.repository.TravlingRequestDetailsRepositoryInterface;


@Service
public class TravlingRequestDetailsService implements TravlingRequestDetailsServiceInterface {
	@Autowired
	private TravlingRequestDetailsRepositoryInterface travlingRequestDetailsRepositoryInterface;

	@Override
	public boolean addTravellingRequestDetails(TravellingRequestDetails travellingRequestDetails) {
		return travlingRequestDetailsRepositoryInterface.addTravellingRequestDetails(travellingRequestDetails);
	}

	@Override
	public boolean updateTravellingRequestDetailsBytravelRequestId(TravellingRequestDetails travellingRequestDetails) {
		return travlingRequestDetailsRepositoryInterface
				.updateTravellingRequestDetailsBytravelRequestId(travellingRequestDetails);
	}

	@Override
	public boolean deleteTravellingRequestDetailsBytravelRequestId(int travelRequestId) {
		return travlingRequestDetailsRepositoryInterface.deleteTravellingRequestDetailsBytravelRequestId(travelRequestId);
	}

	@Override
	public TravellingRequestDetails getTravellingRequestDetailsBytravelRequestId(int travelRequestId) {
		return travlingRequestDetailsRepositoryInterface.getTravellingRequestDetailsBytravelRequestId(travelRequestId);
	}

	@Override
	public List<TravellingRequestDetails> getAllTravellingRequestDetails() {
		return travlingRequestDetailsRepositoryInterface.getAllTravellingRequestDetails();
	}

}
