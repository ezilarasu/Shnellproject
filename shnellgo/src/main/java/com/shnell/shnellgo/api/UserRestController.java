package com.shnell.shnellgo.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.shnell.shnellgo.model.UserEntityModel;
import com.shnell.shnellgo.service.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value ="/createuser")
	public String RegisterUser(@Valid @RequestBody  UserEntityModel userEntityModel) {
		
		userService.registerUser(userEntityModel);
		
		return "user created";
		
		
	}
	
	
}
