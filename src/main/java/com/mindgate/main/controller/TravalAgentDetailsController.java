package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.pojo.TravalAgentDetails;
import com.mindgate.main.service.TravalAgentDetailsServiceInterface;


@RestController
@RequestMapping("agentdetails")
public class TravalAgentDetailsController {
	
	@Autowired
	private TravalAgentDetailsServiceInterface detailsServiceInterface;
	@RequestMapping(value = "agentdetail", method = RequestMethod.POST)
	public boolean addTravalAgentDetails( @RequestBody TravalAgentDetails travalAgentDetails)	{
		return detailsServiceInterface.addTravalAgentDetails(travalAgentDetails);
		
	}
	@RequestMapping(value = "agentdetail", method = RequestMethod.PUT)
	public boolean updateTravalAgentDetailsByAgentId(@RequestBody TravalAgentDetails travalAgentDetails)
	{
		return detailsServiceInterface.updateTravalAgentDetailsByAgentId(travalAgentDetails);
		
	}
	@RequestMapping(value = "agentdetail/{id}", method = RequestMethod.DELETE)
	public boolean deleteTravalAgentDetailsByAgentId(@PathVariable("id") int agentId)
	{
		return detailsServiceInterface.deleteTravalAgentDetailsByAgentId(agentId);
		
	}
	@RequestMapping(value = "agentdetail/{id}", method = RequestMethod.GET)
	public TravalAgentDetails getTravalAgentDetailsByAgentId(@PathVariable("id") int agentId)
	{
		return detailsServiceInterface.getTravalAgentDetailsByAgentId(agentId);
		
	}
	@RequestMapping(value = "agentdetail", method = RequestMethod.GET)
	public List<TravalAgentDetails>getAllTravalAgentDetails()
	{
		return detailsServiceInterface.getAllTravalAgentDetails();
		
	}

}
