package com.shnell.shnellgo.model;

import com.shnell.shnellgo.entity.UserEntity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
public class UserEntityModel {
		
	
	@NotBlank(message = "password cannot be empty")
	private String password;
	@NotBlank(message = "Name cannot be empty")
	private String name;
	
	private String city;
	@Email(message = "Email id is not in format, please check")
	private String email;
	
	private long phone;
	
	

	

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	
	


	public UserEntity createUserEntity() {
		
		UserEntity userEntity = new UserEntity();
		
		userEntity.setCity(getCity());
		userEntity.setEmail(getEmail());
		userEntity.setName(getName());
		userEntity.setPassword(getPassword());
		userEntity.setPhone(getPhone());
		if(getName().equals("admin")) {
			userEntity.setRole("ROLE_ADMIN");
		}else
			userEntity.setRole("ROLE_USER");
		userEntity.setEnabled(1);
		
		return userEntity;
	}
	
}
