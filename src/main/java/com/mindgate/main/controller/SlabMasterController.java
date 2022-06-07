package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.pojo.SlabMaster;
import com.mindgate.main.service.SlabMasterServiceInterface;

@RestController
@RequestMapping("slab")
public class SlabMasterController {
	@Autowired
	private SlabMasterServiceInterface masterServiceInterface;
	@RequestMapping(value = "slabmaster", method = RequestMethod.POST)
	public boolean addSlabMaster(@RequestBody SlabMaster slabMaster)
	{System.out.println(slabMaster);
		return masterServiceInterface.addSlabMaster(slabMaster);
	}
	@RequestMapping(value = "slabmaster", method = RequestMethod.PUT)
	public boolean updateSlabMasterBySlabMasterId(@RequestBody SlabMaster slabMaster)
	{
		return masterServiceInterface.updateSlabMasterBySlabMasterId(slabMaster) ;
		
	}
	@RequestMapping(value = "slabmaster/{id}", method = RequestMethod.DELETE)
	public boolean deleteSlabMaster(@PathVariable("id") int slabMasterId)
	{
		return masterServiceInterface.deleteSlabMaster(slabMasterId);
		
	}
	@RequestMapping(value = "slabmaster/{id}", method = RequestMethod.GET)
	public SlabMaster getSlabMasterByslabMasterId(@PathVariable("id")int slabMasterId)
	{
		return masterServiceInterface.getSlabMasterByslabMasterId(slabMasterId);
		
	}
	@RequestMapping(value = "slabmaster", method = RequestMethod.GET)
	public List<SlabMaster>getAllSlabMaster()
	{
		return masterServiceInterface.getAllSlabMaster();
		
	}

}
