package com.wemapjobs.wemapjobs.controller;

import java.rmi.ServerException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wemapjobs.wemapjobs.model.Users;
import com.wemapjobs.wemapjobs.repository.UsersRepository;
import com.wemapjobs.wemapjobs.service.UserService;

@RestController
@RequestMapping("/wemapjobs")
public class UsersController {

  	
    @Autowired 
    private UserService userService;

    
    
	
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<Users> findUsers(){
    	
    	return userService.findUsers();
    }
    
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST,
    		consumes = MediaType.APPLICATION_JSON_VALUE, 
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Users> createUser(@RequestBody Users user) throws ServerException {
    	
    	Users newuser = userService.saveUser(user);
        if (newuser == null) {
            throw new ServerException("User not created");
        } else {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
    	
    	
    }
	
}
