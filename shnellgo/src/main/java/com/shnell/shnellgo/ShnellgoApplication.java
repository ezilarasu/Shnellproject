package com.shnell.shnellgo;


import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.shnell.shnellgo.service.FlightService;
import com.shnell.shnellgo.service.UserService;
import com.shnell.shnellgo.entity.FlightEntity;
import com.shnell.shnellgo.entity.UserEntity;
import com.shnell.shnellgo.model.UserEntityModel;

@SpringBootApplication
public class ShnellgoApplication {

	public static void main(String[] args) {
		AbstractApplicationContext factory = (AbstractApplicationContext) SpringApplication.run(ShnellgoApplication.class, args);
	
//		FlightService service = factory.getBean(FlightService.class);
//		
//		List<FlightEntity> li = service.searchFlights("Chennai", "Noida", Date.valueOf(LocalDate.of(2021, 9, 30)));
//		
//		li.forEach(System.out :: println);
		
		UserService userService = factory.getBean(UserService.class);
//						
//		System.out.println(userService.authenticateLogin("Jack", "Jack1234"));
		
//		UserEntity userEntity = new UserEntity();
//		userEntity.setCity("chennai");
//		userEntity.setEmail("abc@gmail.com");
//		userEntity.setName("ezil");
//		userEntity.setPassword("abcd");
//		userEntity.setPhone(1234567890);
//		userEntity.setRole("admin");
//		
//		
//		
//		userService.registerUser(userEntity);
		
	//System.out.println(service.updateFlight("madras", "usa", "f56"));	
//		if(!userService.findUser("admin")) {
//			UserEntityModel userEntity = new UserEntityModel();
//			userEntity.setCity("chennai");
//			userEntity.setEmail("abc@gmail.com");
//			userEntity.setName("admin");
//			userEntity.setPassword("admin");
//			userEntity.setPhone(1234567890);
//			
//			
//			userService.registerUser(userEntity);
//		}
		
		//userService.SetAccessToUser("admin", 1);
		
//		
	
	}
	
	

}
