package com.mdss.ctc.datarepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdss.ctc.model.ItemType;

public interface ItemTypeDataRepo extends JpaRepository<ItemType, Integer>
{
	
}
