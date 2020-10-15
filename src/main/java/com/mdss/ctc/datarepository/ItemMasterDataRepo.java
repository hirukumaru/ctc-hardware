package com.mdss.ctc.datarepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdss.ctc.model.ItemMaster;

public interface ItemMasterDataRepo extends JpaRepository<ItemMaster, Integer>
{

}
