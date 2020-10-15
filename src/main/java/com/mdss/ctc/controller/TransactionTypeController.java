package com.mdss.ctc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdss.ctc.datarepository.TransactionTypeDataRepo;
import com.mdss.ctc.model.TransactionType;

@RestController
@RequestMapping(value = "/assetLog/transactionType")
public class TransactionTypeController
{
	@Autowired
	private TransactionTypeDataRepo tratypdr;
	
	@GetMapping(value = "/info")
	private String info()
	{
		return "Transaction Type";
	}
	
	@GetMapping(value = "/getAll")
	private List<TransactionType> getAll()
	{
		return tratypdr.findAll();
	}
	
	@GetMapping(value = "/getOne/{traTypId}")
	private Optional<TransactionType> getOne(@PathVariable int traTypId)
	{
		return tratypdr.findById(traTypId);
	}
}
