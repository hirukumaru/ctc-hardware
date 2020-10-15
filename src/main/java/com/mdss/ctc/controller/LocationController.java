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

import com.mdss.ctc.datarepository.LocationDataRepo;
import com.mdss.ctc.model.Location;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/assetLog/location")
public class LocationController
{
	@Autowired
	private LocationDataRepo locdr;
	
	@GetMapping(value = "/info")
	private String info()
	{
		return "Location";
	}
	
	@GetMapping(value = "/getAll")
	private List<Location> getAll()
	{
		return locdr.findAll();
	}
	
	@GetMapping(value = "/getOne/{locId}")
	private Optional<Location> getOne(@PathVariable int locId)
	{
		return locdr.findById(locId);
	}
	
	@PostMapping(value = "/create")
	private Location create(@RequestBody Location lo)
	{
		return locdr.save(lo);
	}
	
	@DeleteMapping(value = "/delete/{locId}")
	private void delete(@PathVariable int locId)
	{
		locdr.deleteById(locId);
	}
	
	@PutMapping(value = "/update/{locId}")
	private Location update(@PathVariable int locId, @RequestBody Location loc)
	{
		Location l = locdr.getOne(locId);
		
		l.setLocation_name(loc.getLocation_name());
		l.setIs_active(loc.isIs_active());
		l.setLast_modified_date(loc.getLast_modified_date());
		l.setLast_modified_user_id(loc.getLast_modified_user_id());
		
		return locdr.save(l);
		
	}
}
