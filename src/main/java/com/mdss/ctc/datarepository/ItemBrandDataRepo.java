package com.mdss.ctc.datarepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdss.ctc.model.ItemBrand;

public interface ItemBrandDataRepo extends JpaRepository<ItemBrand, Integer>
{

}
