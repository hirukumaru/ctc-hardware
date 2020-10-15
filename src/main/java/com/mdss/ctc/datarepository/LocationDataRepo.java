package com.mdss.ctc.datarepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdss.ctc.model.Location;

public interface LocationDataRepo extends JpaRepository<Location, Integer>
{

}
