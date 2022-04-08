package com.wemapjobs.wemapjobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wemapjobs.wemapjobs.model.Jobs;

@Repository
public interface JobRepository extends JpaRepository<Jobs, Integer>  {
	
	
	@Query("SELECT j FROM Jobs j WHERE j.title =:title and j.location =:location")
	public Jobs findJob(String title,String location);

}
