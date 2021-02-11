package com.shnell.shnellgo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.shnell.shnellgo.entity.FlightEntity;
import com.shnell.shnellgo.entity.UserEntity;
import com.shnell.shnellgo.model.UserEntityModel;
import com.shnell.shnellgo.model.UserLoginModel;
import com.shnell.shnellgo.service.FlightService;
import com.shnell.shnellgo.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private FlightService flightService;
	
	@Autowired
	private UserService userService;
			
	
	
	
	@GetMapping(value = {"/allflights" ,"/"})
	public ModelAndView getAll() {
		
		
		
		List<FlightEntity> flights = flightService.allFlights();
		
		return new ModelAndView("allflights", "flights" , flights);
	}
	

	
	@GetMapping(value = {"/allusers"})
	public ModelAndView showAllUsers() {
		
		List<UserEntity> users = userService.getAllUser();
		
		
		return new ModelAndView("allusers", "users" , users);
		
	}
	
	
	@GetMapping(value="/user/{id}")
	public RedirectView giveAccess( @RequestParam(name = "access") String role , @PathVariable String id ) {
		
		userService.SetAccessToUser(role, Integer.valueOf(id));
		
		return new RedirectView("/shnell/allusers");
		
	}
	
	@GetMapping(value = "/addflights")
	public ModelAndView addFlight() {
		
		FlightEntity flight = new FlightEntity();
		
		return new ModelAndView("flightform", "flight" , flight);
	}
	
	@PostMapping(value="/saveflight")
	public RedirectView saveFlight(@ModelAttribute("flight") FlightEntity flight ) {
		

		if(flightService.addFlight(flight)) {
			return new RedirectView("allflights");
		}
			
		
		 return new RedirectView("addflights");
		
	}
	
	@GetMapping(value="/edit/{id}")    
    public ModelAndView edit(@PathVariable String id){    
        FlightEntity flight =flightService.getFlight(id);
          
        return new ModelAndView("editform", "flight" , flight);  
    }    
    /* It updates model object. */    
    @PostMapping(value="/editsave")    
    public RedirectView editsave(@ModelAttribute("flight") FlightEntity flight){   
    	System.out.println(flight.getFlightId());
    	System.out.println(flight.getSource());
        System.out.println(flightService.updateFlight(flight.getSource(), flight.getDestination(), flight.getFlightId()));  
        
        return new RedirectView("allflights");
    } 
    
    @PostMapping(value="/delete/{id}")
    public RedirectView deleteFlight(@PathVariable String id) {
    	
    	flightService.deleteFlight(id);
    	
    	return new RedirectView("/shnell/allflights");
    }
    
    @GetMapping(value = { "/login"})
	public ModelAndView showIndex() {

    	return new ModelAndView("login");
	}
    
    @GetMapping(value="/logout")
    public RedirectView showLogOut() {		
    	return new RedirectView("/shnell/");
    }
    
    @GetMapping(value = {"accessDenied","/error"})
	public String showAccessDenied() {

		return "accessDenied";
	}
    
    
    @GetMapping(value="/registeruser")
    public ModelAndView register() {
    	
    	
    	return new ModelAndView("registerform" , "user" , new UserEntityModel());
    }
    
    
    @PostMapping(value="/registeruser")
    public ModelAndView registerUser(@ModelAttribute("user") UserEntityModel user) {
    	
    	userService.registerUser(user);
    	
    	return new ModelAndView("login");
    }
    
}


