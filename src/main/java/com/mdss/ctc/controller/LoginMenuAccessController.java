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

import com.mdss.ctc.datarepository.LoginMenuAccessDataRepo;
import com.mdss.ctc.model.LoginMenuAccess;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/assetLog/loginMenuAccess")
public class LoginMenuAccessController
{
	@Autowired
	private LoginMenuAccessDataRepo logmenaccdr;
	
	@GetMapping(value = "/info")
	private String info()
	{
		return "Login Menu Access";
	}
	
	@GetMapping(value = "/getAll")
	private List<LoginMenuAccess> getAll()
	{
		return logmenaccdr.findAll();
	}
	
	@GetMapping(value = "/getOne/{logMenAccId}")
	private Optional<LoginMenuAccess> getOne(@PathVariable int logMenAccId)
	{
		return logmenaccdr.findById(logMenAccId);
	}
	
	@PostMapping(value = "/create")
	private LoginMenuAccess create(@RequestBody LoginMenuAccess logmenacc)
	{
		return logmenaccdr.save(logmenacc);
	}
	
	@DeleteMapping(value = "/delete/{logMenAccId}")
	private void delete(@PathVariable int logMenAccId)
	{
		logmenaccdr.deleteById(logMenAccId);
	}
	
	@PutMapping(value = "/update/{assMasId}")
	private LoginMenuAccess update(@PathVariable int logMenAccId, @RequestBody LoginMenuAccess logmenacc)
	{
		LoginMenuAccess loginmenuaccess = logmenaccdr.getOne(logMenAccId);
		
		loginmenuaccess.setMenu_item_1(logmenacc.getMenu_item_1());
		loginmenuaccess.setMenu_item_2(logmenacc.getMenu_item_2());
		loginmenuaccess.setMenu_item_3(logmenacc.getMenu_item_3());
		loginmenuaccess.setMenu_item_4(logmenacc.getMenu_item_4());
		loginmenuaccess.setMenu_item_5(logmenacc.getMenu_item_5());
		loginmenuaccess.setMenu_item_6(logmenacc.getMenu_item_6());
		loginmenuaccess.setMenu_item_7(logmenacc.getMenu_item_7());
		loginmenuaccess.setMenu_item_8(logmenacc.getMenu_item_8());
		loginmenuaccess.setMenu_item_9(logmenacc.getMenu_item_9());
		loginmenuaccess.setMenu_item_10(logmenacc.getMenu_item_10());
		loginmenuaccess.setLast_modified_date(logmenacc.getLast_modified_date());
		loginmenuaccess.setLast_modified_user_id(logmenacc.getLast_modified_user_id());
		
		return logmenaccdr.save(loginmenuaccess);		
	}
}
