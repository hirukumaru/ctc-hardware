package com.mdss.ctc.datarepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdss.ctc.model.AssetMaster;

public interface AssetMasterDataRepo extends JpaRepository<AssetMaster, Integer>
{

}
