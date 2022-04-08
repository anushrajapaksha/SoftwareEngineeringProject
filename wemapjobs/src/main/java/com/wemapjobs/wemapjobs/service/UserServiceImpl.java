package com.wemapjobs.wemapjobs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wemapjobs.wemapjobs.model.Users;
import com.wemapjobs.wemapjobs.repository.UsersRepository;
@Service
public class UserServiceImpl implements UserService{

	 @Autowired
	 private UsersRepository userRepository;
	
	
	
	@Override
	public Users saveUser(Users user) {
		// TODO Auto-generated method stub
	 return userRepository.save(user);

	}

	@Override
	public List<Users> findUsers() {
		// TODO Auto-generated method stub
		return (List<Users>)
				userRepository.findAll();
	}

	@Override
	public Users updateUser(Users users, Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(Long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Users findUserByEmailandPassword(String email,String password) {
		// TODO Auto-generated method stub
		return userRepository.findUserByEmailandPassword(email, password);
	}

}
