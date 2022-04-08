package com.wemapjobs.wemapjobs.service;

import java.util.List;

import com.wemapjobs.wemapjobs.model.Users;

public interface UserService {

	
	  // Save operation
    Users saveUser(Users user);
 
    // Read operation
    List<Users> findUsers();
 
    // Update operation
    Users updateUser(Users users,
                                Long userId);
 
    // Delete operation
    void deleteUserById(Long userId);
	
}
