package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.main.pojo.LoginDetails;
import com.mindgate.main.pojo.SlabMaster;
import com.mindgate.main.pojo.TravalAgentDetails;

@Repository
@Scope("prototype")

public class TravalAgentDetailRowMaster implements RowMapper<TravalAgentDetails> {

	@Autowired
	private LoginDetailsRepository loginDetailsRepository;
	@Autowired
	private SlabMasterRepository masterRepository;

	@Override
	public TravalAgentDetails mapRow(ResultSet resultSet, int i) throws SQLException {
		int agentId = resultSet.getInt("TRAVLE_AGENT_ID");
		String travelAgentName = resultSet.getString("TRAVEL_AGENT_NAME");

		int slabMasterId = resultSet.getInt("SLAB_MASTER_ID");
		SlabMaster slabMaster = masterRepository.getSlabMasterByslabMasterId(slabMasterId);
		int loginId = resultSet.getInt("LOGIN_ID");
		LoginDetails loginDetails = loginDetailsRepository.getLoginDetailsByloginId(loginId);

		TravalAgentDetails travalAgentDetails = new TravalAgentDetails(agentId, travelAgentName, slabMaster,
				loginDetails);
		System.out.println(travalAgentDetails);
		return travalAgentDetails;

	}

}
