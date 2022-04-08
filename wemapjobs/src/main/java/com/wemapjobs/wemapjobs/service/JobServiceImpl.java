package com.wemapjobs.wemapjobs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wemapjobs.wemapjobs.model.Jobs;
import com.wemapjobs.wemapjobs.model.Users;
import com.wemapjobs.wemapjobs.repository.JobRepository;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	JobRepository jobRepository;
	
	@Override
	public Jobs findJob(String title, String location) {
		// TODO Auto-generated method stub
	
		return jobRepository.findJob(title, location);

		
		
	}

}
