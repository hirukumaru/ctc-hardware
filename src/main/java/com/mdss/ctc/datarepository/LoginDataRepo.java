package com.mdss.ctc.datarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mdss.ctc.model.Login;

public interface LoginDataRepo extends JpaRepository<Login, Integer>
{
	@Query(value = "select * from login where user_name = ?1 and password = ?2", nativeQuery = true)
	Login logAsUser(String username, String password);
}
