package com.shnell.shnellgo.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shnell.shnellgo.entity.FlightEntity;
import com.shnell.shnellgo.repository.FlightRepository;

@Service
public class FlightService {
	
	@Autowired
	private FlightRepository flightRepository;
	
	
	public List<FlightEntity> searchFlights(String source , String destination , Date journeyDate){
		
		List<FlightEntity> flights = flightRepository.findFlightDetails(source, destination, journeyDate);
		
		return flights;
		
	}
	
	
	public List<FlightEntity> allFlights(){
		
		
		List<FlightEntity> flights = flightRepository.findAll();
		
		return flights;
		  
	}
	
	@Transactional
	public boolean addFlight(FlightEntity flight) {
		
		FlightEntity fli = flightRepository.saveAndFlush(flight);
		
		if(fli == null)
		{
			return false;
		}
		else {
			return true;
		}
	}
	@Transactional
	public boolean updateFlight( String source , String destination , String flightId ) {
		
//		Optional<FlightEntity> flight = flightRepository.findById(flightId);
//		System.out.println(flight.toString());
//		if(flight.isPresent()) {
//
//			FlightEntity fl = flight.get();
//			
//			fl.setSource(source);
//			fl.setDestination(destination);
//			flightRepository.saveAndFlush(fl);
//			
//			return true;
//		}
//		
//		return false;
		int n = flightRepository.updateFlight(source, destination, flightId);
		
		if(n==0)
			return false;
		return true;
	}
	@Transactional
	public void deleteFlight(String flightId) {
		flightRepository.deleteById(flightId);
		
	}
	
	public FlightEntity getFlight(String id) {
		
		return flightRepository.getOne(id);
	}
	
}
