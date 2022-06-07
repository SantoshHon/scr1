package com.mindgate.main.pojo;

import java.time.LocalDate;

public class TravelDetails {
	private int travelDetailsId;
	private String hotelBookingStatus;
	private int hotelCost;
	private LocalDate travelDepartureDate;
	private  LocalDate travelReturndate;
	private String ticketbookingStatus;
	private int ticketCost;
	private int foodCost;
	private int otherExpences;
	private int totalCost;
	
	public TravelDetails() {
		// TODO Auto-generated constructor stub
	}

	public TravelDetails(int travelDetailsId, String hotelBookingStatus, int hotelCost, LocalDate travelDepartureDate,
			LocalDate travelReturndate, String ticketbookingStatus, int ticketCost, int foodCost, int otherExpences,
			int totalCost) {
		super();
		this.travelDetailsId = travelDetailsId;
		this.hotelBookingStatus = hotelBookingStatus;
		this.hotelCost = hotelCost;
		this.travelDepartureDate = travelDepartureDate;
		this.travelReturndate = travelReturndate;
		this.ticketbookingStatus = ticketbookingStatus;
		this.ticketCost = ticketCost;
		this.foodCost = foodCost;
		this.otherExpences = otherExpences;
		this.totalCost = totalCost;
	}

	public int getTravelDetailsId() {
		return travelDetailsId;
	}

	public void setTravelDetailsId(int travelDetailsId) {
		this.travelDetailsId = travelDetailsId;
	}

	public String getHotelBookingStatus() {
		return hotelBookingStatus;
	}

	public void setHotelBookingStatus(String hotelBookingStatus) {
		this.hotelBookingStatus = hotelBookingStatus;
	}

	public int getHotelCost() {
		return hotelCost;
	}

	public void setHotelCost(int hotelCost) {
		this.hotelCost = hotelCost;
	}

	public LocalDate getTravelDepartureDate() {
		return travelDepartureDate;
	}

	public void setTravelDepartureDate(LocalDate travelDepartureDate) {
		this.travelDepartureDate = travelDepartureDate;
	}

	public LocalDate getTravelReturndate() {
		return travelReturndate;
	}

	public void setTravelReturndate(LocalDate travelReturndate) {
		this.travelReturndate = travelReturndate;
	}

	public String getTicketbookingStatus() {
		return ticketbookingStatus;
	}

	public void setTicketbookingStatus(String ticketbookingStatus) {
		this.ticketbookingStatus = ticketbookingStatus;
	}

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

	public int getFoodCost() {
		return foodCost;
	}

	public void setFoodCost(int foodCost) {
		this.foodCost = foodCost;
	}

	public int getOtherExpences() {
		return otherExpences;
	}

	public void setOtherExpences(int otherExpences) {
		this.otherExpences = otherExpences;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "TravelDetails [travelDetailsId=" + travelDetailsId + ", hotelBookingStatus=" + hotelBookingStatus
				+ ", hotelCost=" + hotelCost + ", travelDepartureDate=" + travelDepartureDate + ", travelReturndate="
				+ travelReturndate + ", ticketbookingStatus=" + ticketbookingStatus + ", ticketCost=" + ticketCost
				+ ", foodCost=" + foodCost + ", otherExpences=" + otherExpences + ", totalCost=" + totalCost + "]";
	}
	

}
