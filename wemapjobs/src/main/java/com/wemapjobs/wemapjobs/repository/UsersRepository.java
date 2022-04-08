package com.wemapjobs.wemapjobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wemapjobs.wemapjobs.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>  {

}
