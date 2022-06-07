package com.mindgate.main.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.pojo.SlabMaster;
import com.mindgate.main.repository.SlabMasterRepositoryInterface;


@Service
public class SlabMasterService  implements SlabMasterServiceInterface{
    @Autowired
	private SlabMasterRepositoryInterface masterRepositoryInterface;
	@Override
	public boolean addSlabMaster(SlabMaster slabMaster) {
		return masterRepositoryInterface.addSlabMaster(slabMaster);
	}

	@Override
	public boolean updateSlabMasterBySlabMasterId(SlabMaster slabMaster) {
		return masterRepositoryInterface.updateSlabMasterBySlabMasterId(slabMaster);
	}

	@Override
	public boolean deleteSlabMaster(int slabMasterId) {
		return masterRepositoryInterface.deleteSlabMaster(slabMasterId);
	}

	@Override
	public SlabMaster getSlabMasterByslabMasterId(int slabMasterId) {
		return masterRepositoryInterface.getSlabMasterByslabMasterId(slabMasterId);
	}

	@Override
	public List<SlabMaster> getAllSlabMaster() {
		return masterRepositoryInterface.getAllSlabMaster();
	}

}
