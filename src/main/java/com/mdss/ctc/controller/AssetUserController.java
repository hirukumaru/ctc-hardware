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

import com.mdss.ctc.datarepository.AssetUserDataRepo;
import com.mdss.ctc.model.AssetUser;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/assetLog/assetUser")
public class AssetUserController
{
	@Autowired
	private AssetUserDataRepo assusedr;
	
	@GetMapping(value = "/info")
	private String info()
	{
		return "Asset User";
	}
	
	@GetMapping(value = "/getAll")
	private List<AssetUser> getAll()
	{
		return assusedr.findAll();
	}
	
	@GetMapping(value = "/getOne/{assUseId}")
	private Optional<AssetUser> getOne(@PathVariable int assUseId)
	{
		return assusedr.findById(assUseId);
	}
	
	@PostMapping(value = "/create")
	private AssetUser create(@RequestBody AssetUser assUse)
	{
		return assusedr.save(assUse);
	}
	
	@DeleteMapping(value = "/delete/{assUseId}")
	private void delete(@PathVariable int assUseId)
	{
		assusedr.deleteById(assUseId);		
	}
	
	@PutMapping(value = "/update/{assUseId}")
	private AssetUser update(@PathVariable int assUseId, @RequestBody AssetUser assUse)
	{
		AssetUser assetuser = assusedr.getOne(assUseId);
		
		assetuser.setUser_name(assUse.getUser_name());
		assetuser.setPhone_no(assUse.getPhone_no());
		assetuser.setEmail_address(assUse.getEmail_address());
		assetuser.setLast_modified_date(assUse.getLast_modified_date());
		assetuser.setLast_modified_user_id(assUse.getLast_modified_user_id());
		assetuser.setIs_active(assUse.isIs_active());
		
		return assusedr.save(assetuser);
	}
}
