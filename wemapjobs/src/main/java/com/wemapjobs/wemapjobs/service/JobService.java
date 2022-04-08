package com.wemapjobs.wemapjobs.service;

import com.wemapjobs.wemapjobs.model.Jobs;


public interface JobService {
	
	Jobs findJob(String title,String location);

}
