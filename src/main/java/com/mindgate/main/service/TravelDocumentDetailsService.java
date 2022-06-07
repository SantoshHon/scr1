package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.pojo.TravelDocumentDetails;

@Service
public class TravelDocumentDetailsService implements TravelDocumentDetailsServiceInterface {
    @Autowired
    private  com.mindgate.main.repository.TravelDocumentDetailsRepsitoryInterface TravelDocumentDetailsRepsitoryInterface;
	@Override
	public boolean addTravelDocumentDetails(TravelDocumentDetails documentDetails) {
		return  TravelDocumentDetailsRepsitoryInterface.addTravelDocumentDetails(documentDetails);
	}

	@Override
	public boolean updateTravelDocumentDetailsBydocumentId(TravelDocumentDetails documentDetails) {
		return TravelDocumentDetailsRepsitoryInterface.updateTravelDocumentDetailsBydocumentId(documentDetails);
	}

	@Override
	public boolean deleteTravelDocumentDetailsBydocumentId(int documentId) {
		return TravelDocumentDetailsRepsitoryInterface.deleteTravelDocumentDetailsBydocumentId(documentId);
	}

	@Override
	public TravelDocumentDetails getTravelDocumentDetailsByTravelDetailsId(int documentId) {
		return TravelDocumentDetailsRepsitoryInterface.getTravelDocumentDetailsByTravelDetailsId(documentId);
	}

	@Override
	public List<TravelDocumentDetails> getAllTravelDocumentDetails() {
		return TravelDocumentDetailsRepsitoryInterface.getAllTravelDocumentDetails();
	}
	
	

}
