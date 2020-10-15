package com.mdss.ctc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdss.ctc.datarepository.LoginDataRepo;
import com.mdss.ctc.datarepository.LoginMenuAccessDataRepo;
import com.mdss.ctc.model.Login;
import com.mdss.ctc.model.LoginMenuAccess;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/assetLog/login")
public class LoginController
{
	@Autowired
	private LoginDataRepo lr;
	private LoginMenuAccessDataRepo logmenaccdr;
	
	@GetMapping(value = "/info")
	private String info()
	{
		return "Login";
	}
	
	@GetMapping(value = "/getAll")
	private List<Login> getAll()
	{
		return lr.findAll();
	}
	
	@GetMapping(value = "/getOne/{login_id}")
	private Optional<Login> getOne(@PathVariable int login_id)
	{
		return lr.findById(login_id);
	}
	
	@PostMapping(value = "/create")
	private Login create(@RequestBody Login l)
	{		
		Login login = lr.save(l);
		
		LoginMenuAccess logmenacc = new LoginMenuAccess();
		
		logmenacc.setLogin_id(login.getId());
		logmenacc.setMenu_item_1(0);
		logmenacc.setMenu_item_2(0);
		logmenacc.setMenu_item_3(0);
		logmenacc.setMenu_item_4(0);
		logmenacc.setMenu_item_5(0);
		logmenacc.setMenu_item_6(0);
		logmenacc.setMenu_item_7(0);
		logmenacc.setMenu_item_8(0);
		logmenacc.setMenu_item_9(0);
		logmenacc.setMenu_item_10(0);
		
		logmenaccdr.save(logmenacc);
		
		return login;
	}
	
	@PostMapping(value = "/delete/{login_id}")
	private void delete(@PathVariable int login_id)
	{
		lr.deleteById(login_id);
	}
	
	@PutMapping(value = "/update/{login_id}/{keyword}")
	private Login update(@PathVariable int login_id, @PathVariable String keyword, @RequestBody Login log)
	{
		Login login = lr.getOne(login_id);
		
		login.setUser_name(log.getUser_name());
		login.setPassword(keyword);
		login.setFull_name(log.getFull_name());
		login.setLogin_as(log.getLogin_as());
		login.setIs_active(log.isIs_active());
		login.setLast_modified_date(log.getLast_modified_date());
		login.setLast_modified_user_id(log.getLast_modified_user_id());
		
		return lr.save(login);
	}
	
	@GetMapping(value = "/logAsUser/{username}/{keyword}")
	private Login logAsUser(@PathVariable String username,@PathVariable String keyword)
	{
		return lr.logAsUser(username, keyword);
	}
}
