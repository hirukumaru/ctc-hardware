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

import com.mdss.ctc.datarepository.ItemTypeDataRepo;
import com.mdss.ctc.model.ItemType;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/assetLog/itemType")
public class ItemTypeController
{
	@Autowired
	private ItemTypeDataRepo itetypdr;
	
	@GetMapping(value = "/info")
	private String info()
	{
		return "Item Type";
	}
	
	@GetMapping(value = "/getAll")
	private List<ItemType> getAll()
	{
		return itetypdr.findAll();
	}
	
	@GetMapping(value = "/getOne/{iteTypId}")
	private Optional<ItemType> getOne(@PathVariable int iteTypId)
	{
		return itetypdr.findById(iteTypId);
	}
	
	@PostMapping(value = "/create")
	private ItemType create(@RequestBody ItemType itetyp)
	{
		return itetypdr.save(itetyp);
	}
	
	@DeleteMapping(value = "/delete/{iteTypId}")
	private void delete(@PathVariable int iteTypId)
	{
		itetypdr.deleteById(iteTypId);
	}
	
	@PutMapping(value = "/update/{iteTypId}")
	private ItemType update(@PathVariable int iteTypId, @RequestBody ItemType itetyp)
	{
		ItemType itemtype = itetypdr.getOne(iteTypId);
		
		itemtype.setCategory_name(itetyp.getCategory_name());
		itemtype.setIs_active(itetyp.isIs_active());
		itemtype.setLast_modified_date(itetyp.getLast_modified_date());
		itemtype.setLast_modified_user_id(itetyp.getLast_modified_user_id());
		
		return itetypdr.save(itemtype);
		
	}
}
