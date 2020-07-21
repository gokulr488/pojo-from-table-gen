package PojoFromTableGen.pojos.dos;

import java.sql.Date;

public class TSubIdDo {

	private String countryId;
	private String idType;
	private String id;
	private Date dateFrom;
	private long subIdListId;


	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
		
	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
		
	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
		
	public long getSubIdListId() {
		return subIdListId;
	}

	public void setSubIdListId(long subIdListId) {
		this.subIdListId = subIdListId;
	}
		


}
