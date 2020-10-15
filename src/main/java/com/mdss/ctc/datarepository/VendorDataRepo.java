package com.mdss.ctc.datarepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdss.ctc.model.Vendor;

public interface VendorDataRepo extends JpaRepository<Vendor, Integer>
{

}
