package com.mindgate.main.repository;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.pojo.TravelDocumentDetails;


@Repository
public class TravelDocumentDetailsRepository implements TravelDocumentDetailsRepsitoryInterface{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private int resultCount;
	
	private static final String INSERT_travel_documents_details = " INSERT INTO travel_documents_details(DOCUMENT_TYPE ,DOCUMENT_NAME,DOCUMENT_FILE) VALUES (?,? ,?)";
	private static final String SELECT_ALL_travel_documents_details = "SELECT * FROM travel_documents_details";
	private static final String SELECT_SINGLE_travel_documents_details= "SELECT * FROM travel_documents_details WHERE DOCUMENT_ID = ?";
	private static final String UPDATE_travel_documents_detailsByDocumentId = "UPDATE travel_documents_details SET DOCUMENT_TYPE=? ,DOCUMENT_NAME=?,DOCUMENT_FILE=? WHERE DOCUMENT_ID = ?";
	private static final String DELETE_Travel_documents_detailsByDocumentId= "DELETE travel_documents_details WHERE DOCUMENT_ID = ? ";

	@Override
	public boolean addTravelDocumentDetails(TravelDocumentDetails documentDetails) {
		Object[] args= {documentDetails.getDocumentType(),documentDetails.getDocumentName(),documentDetails.getDocumentFile()};
		resultCount=jdbcTemplate.update(INSERT_travel_documents_details,args);
		if(resultCount>0)
			return true;
		else 
			return false;
	}

	@Override
	public boolean updateTravelDocumentDetailsBydocumentId(TravelDocumentDetails documentDetails) {
		Object [] args= {documentDetails.getDocumentType(),documentDetails.getDocumentName(),documentDetails.getDocumentFile(),documentDetails.getDocumentId()};

		resultCount = jdbcTemplate.update(UPDATE_travel_documents_detailsByDocumentId,args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteTravelDocumentDetailsBydocumentId(int documentId) {
		Object[] args = {documentId};
		resultCount = jdbcTemplate.update(DELETE_Travel_documents_detailsByDocumentId, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public TravelDocumentDetails getTravelDocumentDetailsByTravelDetailsId(int documentId) {
		Object[] args = { documentId };
		TravelDocumentDetails documentDetails = jdbcTemplate.queryForObject(SELECT_SINGLE_travel_documents_details, new TravelDocumentDetailsRowMapper(), args);
		return documentDetails;
	}

	@Override
	public List<TravelDocumentDetails> getAllTravelDocumentDetails() {
		List<TravelDocumentDetails> documentDetails = jdbcTemplate.query(SELECT_ALL_travel_documents_details, new TravelDocumentDetailsRowMapper());
		return documentDetails ;
	}

}
