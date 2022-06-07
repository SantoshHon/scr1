package com.mindgate.main.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.pojo.TravelDocumentDetails;
import com.mindgate.main.service.TravelDocumentDetailsServiceInterface;


@RestController
@RequestMapping("documentdetails")
public class TravelDocumentDetailsController {
	@Autowired
	private TravelDocumentDetailsServiceInterface travelDocumentDetails;
	@RequestMapping(value = "documentdetail", method = RequestMethod.POST)
	public boolean addTravelDocumentDetails(@RequestBody TravelDocumentDetails TravelDocumentDetails)
	{
		return travelDocumentDetails.addTravelDocumentDetails(TravelDocumentDetails);
		
	}
	@RequestMapping(value = "documentdetail", method = RequestMethod.PUT)

	public boolean updateTravelDocumentDetailsBydocumentId(@RequestBody TravelDocumentDetails documentDetails)
	{
		return travelDocumentDetails.updateTravelDocumentDetailsBydocumentId(documentDetails);
		
	}
	@RequestMapping(value = "documentdetail/(id)", method = RequestMethod.DELETE)

	public boolean deleteTravelDocumentDetailsBydocumentId(@PathVariable("id") int documentId)
	{
		return travelDocumentDetails.deleteTravelDocumentDetailsBydocumentId(documentId);
		
	}
	@RequestMapping(value = "documentdetail/{id}", method = RequestMethod.GET)

	public TravelDocumentDetails getTravelDocumentDetailsByTravelDetailsId(@PathVariable("id") int documentId)
	{
		return travelDocumentDetails.getTravelDocumentDetailsByTravelDetailsId(documentId);
		
	}
	@RequestMapping(value = "documentdetail", method = RequestMethod.GET)

	public List<TravelDocumentDetails> getAllTravelDocumentDetails()
	{
		return travelDocumentDetails.getAllTravelDocumentDetails();
		
	}
	}


