package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.pojo.SlabMaster;

public interface SlabMasterServiceInterface {
	public boolean addSlabMaster(SlabMaster slabMaster);
	public boolean updateSlabMasterBySlabMasterId(SlabMaster slabMaster);
	public boolean deleteSlabMaster(int slabMasterId);
	public SlabMaster getSlabMasterByslabMasterId(int slabMasterId);
	public List<SlabMaster>getAllSlabMaster();
}
