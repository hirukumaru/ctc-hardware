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

import com.mdss.ctc.datarepository.AssetConditionDataRepo;
import com.mdss.ctc.model.AssetCondition;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/assetLog/assetCondition")
public class AssetConditionController
{
	@Autowired
	private AssetConditionDataRepo asscondr;
	
	@GetMapping(value = "/info")
	private String info()
	{
		return "Asset Condition";
	}
	
	@GetMapping(value = "/getAll")
	private List<AssetCondition> getAll()
	{
		return asscondr.findAll();
	}
	
	@GetMapping(value = "/getOne/{assConId}")
	private Optional<AssetCondition> getOne(@PathVariable int assConId)
	{
		return asscondr.findById(assConId);
	}
	
	@PostMapping(value = "/create")
	private AssetCondition create(@RequestBody AssetCondition assCon)
	{
		return asscondr.save(assCon);
	}
	
	@DeleteMapping(value = "/delete/{assConId}")
	private void delete(@PathVariable int assConId)
	{
		asscondr.deleteById(assConId);
	}
	
	@PutMapping(value = "/update/{assConId}")
	private AssetCondition update(@PathVariable int assConId, @RequestBody AssetCondition assCon)
	{
		AssetCondition assetcondition = asscondr.getOne(assConId);
		
		assetcondition.setCondition_name(assCon.getCondition_name());
		assetcondition.setIs_active(assCon.isIs_active());
		
		return asscondr.save(assetcondition);
	}
	
}