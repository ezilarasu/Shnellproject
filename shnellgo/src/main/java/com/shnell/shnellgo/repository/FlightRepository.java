package com.shnell.shnellgo.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shnell.shnellgo.entity.FlightEntity;


@Repository
public interface FlightRepository extends JpaRepository<FlightEntity, String> {
	
	@Query("select f from FlightEntity f where f.source=:source and f.destination=:dest and f.flightAvailableDate=:jdate and f.seatCount>0")
	List<FlightEntity> findFlightDetails(@Param("source") String source, @Param("dest") String destination,
			@Param("jdate") Date date);
	
	
	
	@Modifying( flushAutomatically = true)
	   @Query("update  FlightEntity f  set f.source = :source , f.destination= :dest where f.flightId = :flightid")
	int updateFlight(@Param("source") String source, @Param("dest") String destination, @Param("flightid") String flightId);
	
	
}
