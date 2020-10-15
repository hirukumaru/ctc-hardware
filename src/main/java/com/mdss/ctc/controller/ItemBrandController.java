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

import com.mdss.ctc.datarepository.ItemBrandDataRepo;
import com.mdss.ctc.model.ItemBrand;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value= "/assetLog/itemBrand")
public class ItemBrandController
{
	@Autowired
	private ItemBrandDataRepo itembradr;
	
	@GetMapping(value = "/info")
	private String info()
	{
		return "Item Brand";
	}
	
	@GetMapping(value = "/getAll")
	private List<ItemBrand> getAll()
	{
		return itembradr.findAll();
	}
	
	@GetMapping(value = "/getOne/{iteBraId}")
	private Optional<ItemBrand> getOne(@PathVariable int iteBraId)
	{
		return itembradr.findById(iteBraId);
	}
	
	@PostMapping(value = "/create")
	private ItemBrand create(@RequestBody ItemBrand itebra)
	{
		return itembradr.save(itebra);
	}
	
	@DeleteMapping(value = "/delete/{iteBraId}")
	private void delete(@PathVariable int iteBraId)
	{
		itembradr.deleteById(iteBraId);
	}
	
	@PutMapping(value = "/update/{iteBraId}")
	private ItemBrand update(@PathVariable int iteBraId, @RequestBody ItemBrand itebra)
	{
		ItemBrand itembrand = itembradr.getOne(iteBraId);
		
		itembrand.setBrand_name(itebra.getBrand_name());
		itembrand.setIs_active(itebra.isIs_active());
		itembrand.setLast_modified_date(itebra.getLast_modified_date());
		itembrand.setLast_modified_user_id(itebra.getLast_modified_user_id());
		
		return itembradr.save(itembrand);
		
	}
}
