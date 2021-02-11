package com.shnell.shnellgo.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name ="flight_details")
public class FlightEntity {
		
		@Id
		private String flightId;
		private String airlines;
		private String source;
		private String destination;
		private Double fare;
		@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
		private Date flightAvailableDate;
		private String departureTime;
		private String arrivalTime;
		private Integer seatCount;
		
		
		public String getFlightId() {
			return flightId;
		}
		public void setFlightId(String flightId) {
			this.flightId = flightId;
		}
		public String getAirlines() {
			return airlines;
		}
		public void setAirlines(String airlines) {
			this.airlines = airlines;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public Double getFare() {
			return fare;
		}
		public void setFare(Double fare) {
			this.fare = fare;
		}
		public Date getFlightAvailableDate() {
			return flightAvailableDate;
		}
		public void setFlightAvailableDate(Date flightAvailableDate) {
			this.flightAvailableDate = flightAvailableDate;
		}
		public String getDepartureTime() {
			return departureTime;
		}
		public void setDepartureTime(String departureTime) {
			this.departureTime = departureTime;
		}
		public String getArrivalTime() {
			return arrivalTime;
		}
		public void setArrivalTime(String arrivalTime) {
			this.arrivalTime = arrivalTime;
		}
		public Integer getSeatCount() {
			return seatCount;
		}
		public void setSeatCount(Integer seatCount) {
			this.seatCount = seatCount;
		}
		@Override
		public String toString() {
			return "FlightEntity [flightId=" + flightId + ", airlines=" + airlines + ", source=" + source
					+ ", destination=" + destination + ", fare=" + fare + ", flightAvailableDate=" + flightAvailableDate
					+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", seatCount=" + seatCount
					+ "]";
		}
		
		
		
		
		
}

