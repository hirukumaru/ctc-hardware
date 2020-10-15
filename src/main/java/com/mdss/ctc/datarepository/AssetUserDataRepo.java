package com.mdss.ctc.datarepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdss.ctc.model.AssetUser;

public interface AssetUserDataRepo extends JpaRepository<AssetUser, Integer>
{

}
