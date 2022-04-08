package com.wemapjobs.wemapjobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wemapjobs.wemapjobs.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>  {

	
	@Query("SELECT u FROM Users u WHERE u.email =:email and u.password =:password")
	public Users findUserByEmailandPassword(String email,String password);
	
}
