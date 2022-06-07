package com.mindgate.main.repository;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.pojo.SlabMaster;



public class SlabMasterRowMapper implements RowMapper<SlabMaster> {

	@Override

	public SlabMaster mapRow(ResultSet resultSet, int i) throws SQLException {
		int slabMasterId = resultSet.getInt("SLAB_MASTER_ID");
		String designation = resultSet.getString("DESIGNATION");
		int slab = resultSet.getInt("SLAB");
		String travelMode = resultSet.getString("TRAVEL_MODE");
		SlabMaster slabMaster = new SlabMaster(slabMasterId, designation, slab, travelMode);
		return slabMaster;

	}

	
}
