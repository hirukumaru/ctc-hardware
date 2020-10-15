package com.mdss.ctc.datarepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdss.ctc.model.AssetCondition;

public interface AssetConditionDataRepo extends JpaRepository<AssetCondition, Integer>
{

}
