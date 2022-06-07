package com.mindgate.main.repository;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.pojo.TravelDetails;



@Repository
public class TravelDetailsRepository implements TravelDetailsRepositoryInterface {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private int resultCount;

	private static final String INSERT_TRAVELLING_DETAILS = "INSERT INTO TRAVELLING_DETAILS(HOTEL_BOOKING_STATUS ,HOTEL_COST ,TRAVEL_DEPARTURE_DATE ,TRAVEL_RETURN_DATE ,TICKET_BOOKING_STATUS ,TICKET_COST ,FOOD_COST ,OTHER_EXPENCES ,TOTAL_COST )VALUES (?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_ALL_TRAVELLING_DETAILS = "SELECT * FROM TRAVELLING_DETAILS";
	private static final String SELECT_SINGLE_TRAVELLING_DETAILS = "SELECT * FROM TRAVELLING_DETAILS WHERE TRAVEL_DETAILS_ID = ?";
	private static final String UPDATE_TRAVELLING_DETAILS = "UPDATE TRAVELLING_DETAILS SET HOTEL_BOOKING_STATUS = ? , HOTEL_COST = ?,TRAVEL_DEPARTURE_DATE=?,TRAVEL_RETURN_DATE=?,TICKET_BOOKING_STATUS =?,TICKET_COST=?,FOOD_COST=?,OTHER_EXPENCES=?,TOTAL_COST=?  WHERE TRAVEL_DETAILS_ID = ?";

	private static final String DELETE_TRAVELLING_DETAILS = "DELETE TRAVELLING_DETAILS WHERE TRAVEL_DETAILS_ID = ?";

	@Override
	public boolean addTravelDetails(TravelDetails travelDetails) {
		Object[] args= {travelDetails.getHotelBookingStatus(),travelDetails.getHotelCost(),travelDetails.getTravelDepartureDate(),
				travelDetails.getTravelReturndate(),travelDetails.getTicketbookingStatus(),travelDetails.getTicketCost(),
				travelDetails.getFoodCost(),travelDetails.getOtherExpences(),travelDetails.getTotalCost()};
		resultCount=jdbcTemplate.update(INSERT_TRAVELLING_DETAILS,args);
		if(resultCount>0)
			return true;
		else 
			return false;
	}

	@Override
	public boolean updateTravelDetailsByTravelDetailsId(TravelDetails travelDetails) {
		Object [] args= {travelDetails.getHotelBookingStatus(),travelDetails.getHotelCost(),travelDetails.getTravelDepartureDate()
				,travelDetails.getTravelReturndate(),travelDetails.getTicketbookingStatus(),travelDetails.getTicketCost(),
				travelDetails.getFoodCost(),travelDetails.getOtherExpences(),travelDetails.getTotalCost(),travelDetails.getTravelDetailsId()};
		resultCount = jdbcTemplate.update(UPDATE_TRAVELLING_DETAILS,args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteTravelDetailsByTravelDetailsId(int travelDetailsId) {
		Object[] args = {travelDetailsId  };
		resultCount = jdbcTemplate.update(DELETE_TRAVELLING_DETAILS, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}
	

	@Override
	public TravelDetails getTravelDetailsByTravelDetailsId(int travelDetailsId) {
		Object[] args = {travelDetailsId};
		TravelDetails details = jdbcTemplate.queryForObject(SELECT_SINGLE_TRAVELLING_DETAILS , new TravelDetailsRowMapper(), args);
		return details;
	}

	@Override
	public List<TravelDetails> getAllTravelDetails() {
		List<TravelDetails> details = jdbcTemplate.query(SELECT_ALL_TRAVELLING_DETAILS, new TravelDetailsRowMapper());
		return details ;
	}
	
	
	
	
	
}
