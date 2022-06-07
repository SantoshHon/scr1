package com.mindgate.main.controller;



import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.pojo.TravellingRequestDetails;
import com.mindgate.main.service.TravlingRequestDetailsServiceInterface;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("travlingrequests")
public class TravlingRequestDetailsController {
	@Autowired
	private TravlingRequestDetailsServiceInterface detailsServiceInterface;
	@RequestMapping(value = "travlingrequest", method = RequestMethod.POST)
	public boolean addTravellingRequestDetails(@RequestBody TravellingRequestDetails travellingRequestDetails)
	{
		System.out.println(travellingRequestDetails);
		return detailsServiceInterface.addTravellingRequestDetails(travellingRequestDetails);
	}
	@RequestMapping(value = "travlingrequest", method = RequestMethod.PUT)

	public boolean updateTravellingRequestDetailsBytravelRequestId(@RequestBody TravellingRequestDetails travellingRequestDetails)
	{
		return detailsServiceInterface.updateTravellingRequestDetailsBytravelRequestId(travellingRequestDetails);
		
	}
	@RequestMapping(value = "travlingrequest/{id}", method = RequestMethod.DELETE)

	public boolean deleteTravellingRequestDetailsBytravelRequestId(@PathVariable("id") int travelRequestId)
	{
		return detailsServiceInterface.deleteTravellingRequestDetailsBytravelRequestId(travelRequestId);
		
	}
	@RequestMapping(value = "travlingrequest/{id}", method = RequestMethod.GET)

	public TravellingRequestDetails getTravellingRequestDetailsBytravelRequestId(@PathVariable("id") int travelRequestId)
	{
		return detailsServiceInterface.getTravellingRequestDetailsBytravelRequestId(travelRequestId);
		
	}
	@RequestMapping(value = "travlingrequest", method = RequestMethod.GET)

	public List<TravellingRequestDetails> getAllTravellingRequestDetails()
	{
		return detailsServiceInterface.getAllTravellingRequestDetails();
		
	}
}
