package com.fms.entity;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private BigInteger flightNo;
	private String fromPlace;
	private String toPlace;
	private String startDateTime;
	private String endDateTime;
	private String scheduledDays;
	private String instrumentName;
	private Integer busiSeats;
	private Integer nonbusSeats;
	private String flightModel;
	private Integer ticketCost;
	private Integer noOfRows;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNoOfRows() {
		return noOfRows;
	}
	public void setNoOfRows(Integer noOfRows) {
		this.noOfRows = noOfRows;
	}
	private String mealType;
	private Integer seatCapacity;
	
	
	public BigInteger getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(BigInteger flightNo) {
		this.flightNo = flightNo;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public String getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}
	public String getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(String endDateTime) {
		this.endDateTime = endDateTime;
	}
	public String getScheduledDays() {
		return scheduledDays;
	}
	public void setScheduledDays(String scheduledDays) {
		this.scheduledDays = scheduledDays;
	}
	public String getInstrumentName() {
		return instrumentName;
	}
	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}
	public int getBusiSeats() {
		return busiSeats;
	}
	public void setBusiSeats(int busiSeats) {
		this.busiSeats = busiSeats;
	}
	public int getNonbusSeats() {
		return nonbusSeats;
	}
	public void setNonbusSeats(int nonbusSeats) {
		this.nonbusSeats = nonbusSeats;
	}
	public String getFlightModel() {
		return flightModel;
	}
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	public int getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}
	
	public String getMealType() {
		return mealType;
	}
	public void setMealType(String mealType) {
		this.mealType = mealType;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	

}
