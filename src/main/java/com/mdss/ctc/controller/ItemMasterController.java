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

import com.mdss.ctc.datarepository.ItemMasterDataRepo;
import com.mdss.ctc.model.ItemMaster;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/assetLog/itemMaster")
public class ItemMasterController
{
	@Autowired
	private ItemMasterDataRepo itemasdr;
	
	@GetMapping(value = "/info")
	private String info()
	{
		return "Item Master";
	}
	
	@GetMapping(value = "/getAll")
	private List<ItemMaster> getAll()
	{
		return itemasdr.findAll();
	}
	
	@GetMapping(value = "/getOne/{iteId}")
	private Optional<ItemMaster> getOne(@PathVariable int iteId)
	{
		return itemasdr.findById(iteId);
	}
	
	@PostMapping(value = "/create")
	private ItemMaster create(@RequestBody ItemMaster iteMas)
	{
		return itemasdr.save(iteMas);
	}
	
	@DeleteMapping(value = "/delete/{iteId}")
	private void delete(@PathVariable int iteId)
	{
		itemasdr.deleteById(iteId);		
	}
	
	@PutMapping(value = "/update/{iteId}")
	private ItemMaster update(@PathVariable int iteId, @RequestBody ItemMaster iteMas)
	{
		ItemMaster itemmaster = itemasdr.getOne(iteId);
		
		itemmaster.setCategory_id(iteMas.getCategory_id());
		itemmaster.setBrand_id(iteMas.getBrand_id());
		itemmaster.setName_and_model(iteMas.getName_and_model());
		itemmaster.setLast_modified_date(iteMas.getLast_modified_date());
		itemmaster.setLast_modified_user_id(iteMas.getLast_modified_user_id());
		itemmaster.setIs_active(iteMas.isIs_active());
		
		return itemasdr.save(itemmaster);
	}
}
