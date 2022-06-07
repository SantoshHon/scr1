package com.mindgate.main.repository;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.pojo.TravalAgentDetails;


@Repository
public class TravalAgentDetailsRepository implements TravalAgentDetailsRepositoryInterface{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private TravalAgentDetailRowMaster agentDetailRowMaster;

	private static final String INSERT_TravalAgentDetails = "INSERT INTO TRAVEL_AGENT_DETAILS(TRAVEL_AGENT_NAME,SLAB_MASTER_ID,LOGIN_ID)VALUES(?,?,?)";
	private static final String SELECT_ALL_TravalAgentDetails = "SELECT * FROM TRAVEL_AGENT_DETAILS";
	private static final String SELECT_SINGLE_TravalAgentDetails = "SELECT * FROM TRAVEL_AGENT_DETAILS WHERE TRAVLE_AGENT_ID = ?";
	private static final String UPDATE_TravalAgentDetailsByagentId = "UPDATE TRAVEL_AGENT_DETAILS SET TRAVEL_AGENT_NAME=?,SLAB_MASTER_ID=?,LOGIN_ID=? WHERE TRAVLE_AGENT_ID = ?";

	private static final String DELETE_TravalAgentDetailsByagentId = "DELETE TRAVEL_AGENT_DETAILS WHERE TRAVLE_AGENT_ID = ?";
	private int resultCount;
	@Override
	public boolean addTravalAgentDetails(TravalAgentDetails travalAgentDetails) {
		Object[] args = {travalAgentDetails.getTravelAgentName(),travalAgentDetails.getSlabMaster().getSlabMasterId(),travalAgentDetails.getLoginDetails().getLoginId()};
		resultCount = jdbcTemplate.update(INSERT_TravalAgentDetails, args);

		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateTravalAgentDetailsByAgentId(TravalAgentDetails travalAgentDetails) {
		//System.out.println(travalAgentDetails);
		Object[] args = {travalAgentDetails.getTravelAgentName(),travalAgentDetails.getSlabMaster().getSlabMasterId(),travalAgentDetails.getLoginDetails().getLoginId(),travalAgentDetails.getAgentId()};
		resultCount = jdbcTemplate.update(UPDATE_TravalAgentDetailsByagentId, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteTravalAgentDetailsByAgentId(int agentId) {
		Object[] args = {agentId};
		resultCount = jdbcTemplate.update(DELETE_TravalAgentDetailsByagentId, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public TravalAgentDetails getTravalAgentDetailsByAgentId(int agentId) {
		Object[] args ={agentId};
		TravalAgentDetails travalAgentDetails=jdbcTemplate.queryForObject(SELECT_SINGLE_TravalAgentDetails , agentDetailRowMaster, args);
		return travalAgentDetails;
	}

	@Override
	public List<TravalAgentDetails> getAllTravalAgentDetails() {
		List<TravalAgentDetails> travalAgentDetails = jdbcTemplate.query(SELECT_ALL_TravalAgentDetails, agentDetailRowMaster);
		return travalAgentDetails ;
	}

}
