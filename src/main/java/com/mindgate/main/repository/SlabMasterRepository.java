package com.mindgate.main.repository;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.pojo.SlabMaster;
import com.mindgate.main.repository.LoginDetailRowMapper;

@Repository
public class SlabMasterRepository implements SlabMasterRepositoryInterface {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String INSERT_SlabMaster = "INSERT INTO slab_master(DESIGNATION,SLAB,TRAVEL_MODE )VALUES(?,?,?)";
	private static final String SELECT_ALL_SlabMaster = "SELECT * FROM SLAB_MASTER";
	private static final String SELECT_SINGLE_SlabMaster = "SELECT * FROM SLAB_MASTER WHERE SLAB_MASTER_ID = ?";
	private static final String UPDATE_SlabMaster = "UPDATE SLAB_MASTER SET DESIGNATION =?,SLAB= ?,TRAVEL_MODE=? WHERE SLAB_MASTER_ID = ?";

	private static final String DELETE_SlabMaster = "DELETE SLAB_MASTER WHERE SLAB_MASTER_ID = ?";

	private int resultCount;

	@Override
	public boolean addSlabMaster(SlabMaster slabMaster) {

		Object[] args = {slabMaster.getDesignation(), slabMaster.getSlab(),slabMaster.getTravelMode() };

		resultCount = jdbcTemplate.update(INSERT_SlabMaster, args);

		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateSlabMasterBySlabMasterId(SlabMaster slabMaster) {
		
		
		System.out.println(slabMaster);
		Object[] args = {slabMaster.getDesignation(),slabMaster.getSlab(),slabMaster.getTravelMode(),slabMaster.getSlabMasterId()};
		resultCount = jdbcTemplate.update(UPDATE_SlabMaster,args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteSlabMaster(int slabMasterId) {
		Object[] args = {slabMasterId};
		resultCount = jdbcTemplate.update(DELETE_SlabMaster, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public SlabMaster getSlabMasterByslabMasterId(int slabMasterId) {
		Object[] args = {slabMasterId};
		SlabMaster slabMaster = jdbcTemplate.queryForObject(SELECT_SINGLE_SlabMaster , new SlabMasterRowMapper(), args);
		return slabMaster;
	}

	@Override
	public List<SlabMaster> getAllSlabMaster() {
		List<SlabMaster> details = jdbcTemplate.query(SELECT_ALL_SlabMaster, new SlabMasterRowMapper());
		return details ;
	}

}
