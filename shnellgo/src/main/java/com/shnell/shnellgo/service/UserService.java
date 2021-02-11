package com.shnell.shnellgo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.shnell.shnellgo.entity.UserEntity;
import com.shnell.shnellgo.model.UserEntityModel;
import com.shnell.shnellgo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	
	public boolean findUser(String username) {
		
	Optional<UserEntity> optionalEntity = 	userRepository.findByName(username);
		
	if(optionalEntity.isPresent()) {
		return true;
	}else {
		return false;
	}}
	
	
	
	public void registerUser(UserEntityModel userEntityModel) {
		
		UserEntity userEntity = userEntityModel.createUserEntity();
		
		userEntity.setPassword(passwordEncoder.encode(userEntityModel.getPassword()));
		userRepository.save(userEntity);
	
		
	}
	
	public List<UserEntity> getAllUser() {
		
		return userRepository.findAll();
	}
	
	@Transactional
	public int SetAccessToUser(String role , int id) {
		
		if(role.equals("admin")) {
			return userRepository.setAccessUser("ROLE_ADMIN", id);
		}else
			return userRepository.setAccessUser("ROLE_USER", id);
		
		
	}
	
}
