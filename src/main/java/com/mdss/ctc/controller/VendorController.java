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

import com.mdss.ctc.datarepository.VendorDataRepo;
import com.mdss.ctc.model.Vendor;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/assetLog/vendor")
public class VendorController
{
	@Autowired
	private VendorDataRepo vendr;
	
	@GetMapping(value = "/info")
	private String info()
	{
		return "Vendor";
	}
	
	@GetMapping(value = "/getAll")
	private List<Vendor> getAll()
	{
		return vendr.findAll();
	}
	
	@GetMapping(value = "/getOne/{venId}")
	private Optional<Vendor> getOne(@PathVariable int venId)
	{
		return vendr.findById(venId);
	}
	
	@PostMapping(value = "/create")
	private Vendor create(@RequestBody Vendor ven)
	{
		return vendr.save(ven);
	}
	
	@DeleteMapping(value = "/delete/{venId}")
	private void delete(@PathVariable int venId)
	{
		vendr.deleteById(venId);		
	}
	
	@PutMapping(value = "/update/{venId}")
	private Vendor update(@PathVariable int venId, @RequestBody Vendor ven)
	{
		Vendor vendor = vendr.getOne(venId);
		
		vendor.setVendor_name(ven.getVendor_name());
		vendor.setPhone_no(ven.getPhone_no());
		vendor.setEmail(ven.getEmail());
		vendor.setLast_modified_date(ven.getLast_modified_date());
		vendor.setLast_modified_user_id(ven.getLast_modified_user_id());
		vendor.setIs_active(ven.isIs_active());
		
		return vendr.save(vendor);
	}
}
