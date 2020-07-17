package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.domain.User;
import com.example.demo.repo.UserRepository;


@Service
public class UserService {
    
	@Autowired
	private UserRepository userRepository;
    
	public List<User> getAll() {
		return userRepository.findAll();
	}
	
	public User save(User user) {
		return userRepository.save(user);
		
	}
	
	public User login(String userName , String password) {
		return userRepository.findByUserNameAndPassword(userName , password);
	}
}
