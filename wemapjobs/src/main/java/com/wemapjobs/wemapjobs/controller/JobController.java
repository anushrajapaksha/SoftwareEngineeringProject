package com.wemapjobs.wemapjobs.controller;

import java.rmi.ServerException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wemapjobs.wemapjobs.model.Jobs;
import com.wemapjobs.wemapjobs.model.Users;
import com.wemapjobs.wemapjobs.service.JobService;

@RestController
@RequestMapping("/wemapjobs")
public class JobController {

	
	@Autowired
	JobService jobService;
	
	@RequestMapping(value = "/findJob", method = RequestMethod.GET,
    		consumes = MediaType.APPLICATION_JSON_VALUE)
    public Jobs findJob(@RequestBody Jobs job) throws ServerException{
    	
    	String title =job.getTitle();
    	String location=job.getLocation();
    	
    	Jobs findJob= jobService.findJob(title,location);
    	if (findJob == null) {
            throw new ServerException("Job not found");
        } else {
            return findJob ;
        }
    
    }
	
	
}
