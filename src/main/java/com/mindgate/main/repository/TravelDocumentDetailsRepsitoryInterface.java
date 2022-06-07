package com.mindgate.main.repository;



import java.util.List;

import com.mindgate.main.pojo.TravelDocumentDetails;



public interface TravelDocumentDetailsRepsitoryInterface {
	public boolean addTravelDocumentDetails(TravelDocumentDetails documentDetails);
	public boolean updateTravelDocumentDetailsBydocumentId(TravelDocumentDetails documentDetails);
	public boolean deleteTravelDocumentDetailsBydocumentId(int documentId);
	public TravelDocumentDetails getTravelDocumentDetailsByTravelDetailsId(int documentId);
	public List<TravelDocumentDetails> getAllTravelDocumentDetails();

}
