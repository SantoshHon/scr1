package com.mindgate.main.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.pojo.TravalAgentDetails;
import com.mindgate.main.repository.TravalAgentDetailsRepositoryInterface;


@Service
public class TravalAgentDetailsService implements TravalAgentDetailsServiceInterface{
@Autowired
private TravalAgentDetailsRepositoryInterface detailsRepositoryInterface;
	@Override
	public boolean addTravalAgentDetails(TravalAgentDetails travalAgentDetails) {
		return detailsRepositoryInterface.addTravalAgentDetails(travalAgentDetails);
	}

	@Override
	public boolean updateTravalAgentDetailsByAgentId(TravalAgentDetails travalAgentDetails) {
		return detailsRepositoryInterface.updateTravalAgentDetailsByAgentId(travalAgentDetails);
	}

	@Override
	public boolean deleteTravalAgentDetailsByAgentId(int agentId) {
		return detailsRepositoryInterface.deleteTravalAgentDetailsByAgentId(agentId);
	}

	@Override
	public TravalAgentDetails getTravalAgentDetailsByAgentId(int agentId) {
		return detailsRepositoryInterface.getTravalAgentDetailsByAgentId(agentId);
	}

	@Override
	public List<TravalAgentDetails> getAllTravalAgentDetails() {
		return detailsRepositoryInterface.getAllTravalAgentDetails();
	}

}
