package com.mdss.ctc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdss.ctc.datarepository.AssetMasterDataRepo;
import com.mdss.ctc.model.AssetMaster;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/assetLog/assetMaster")
public class AssetMasterController
{
	@Autowired
	private AssetMasterDataRepo assmasdr;
	
	@GetMapping(value = "/info")
	private String info()
	{
		return "Asset Master";
	}
	
	@GetMapping(value = "/getAll")
	private List<AssetMaster> getAll()
	{
		return assmasdr.findAll();
	}
	
	@GetMapping(value = "/getOne/{assMasId}")
	private Optional<AssetMaster> getOne(@PathVariable int assMasId)
	{
		return assmasdr.findById(assMasId);
	}
	
	@PostMapping(value = "/create")
	private AssetMaster create(@RequestBody AssetMaster assmas)
	{
		return assmasdr.save(assmas);
	}
	
	@DeleteMapping(value = "/delete/{assMasId}")
	private void delete(@PathVariable int assMasId)
	{
		assmasdr.deleteById(assMasId);
	}
	
	@PutMapping(value = "/update/{assMasId}")
	private AssetMaster update(@PathVariable int assMasId, @RequestBody AssetMaster assmas)
	{
		AssetMaster assetmaster = assmasdr.getOne(assMasId);
		
		assetmaster.setAsset_no(assmas.getAsset_no());
		assetmaster.setSerial_no(assmas.getSerial_no());
		assetmaster.setRef_no(assmas.getRef_no());
		assetmaster.setItem_id(assmas.getItem_id());
		assetmaster.setPurchase_date(assmas.getPurchase_date());
		assetmaster.setVendor_id(assmas.getVendor_id());
		assetmaster.setWarranty_period(assmas.getWarranty_period());
		assetmaster.setWarranty_end_date(assmas.getWarranty_end_date());
		assetmaster.setGrn_location_id(assmas.getGrn_location_id());
		assetmaster.setNote(assmas.getNote());
		assetmaster.setIs_active(assmas.isIs_active());
		assetmaster.setLast_modified_date(assmas.getLast_modified_date());
		assetmaster.setLast_modified_user_id(assmas.getLast_modified_user_id());
		
		return assmasdr.save(assetmaster);		
	}
}
