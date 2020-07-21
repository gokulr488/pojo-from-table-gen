package PojoFromTableGen.pojos.dos;

import java.sql.Date;

public class TSubAdrDo {

	private String streetPostalInd;
	private String line1;
	private String line2;
	private String line3;
	private String suburb;
	private String town;
	private String postalCode;
	private String countryId;
	private Date dateFrom;
	private Date dateTo;
	private long subAdrListId;


	public String getStreetPostalInd() {
		return streetPostalInd;
	}

	public void setStreetPostalInd(String streetPostalInd) {
		this.streetPostalInd = streetPostalInd;
	}
		
	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}
		
	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}
		
	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}
		
	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
		
	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}
		
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
		
	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
		
	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
		
	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
		
	public long getSubAdrListId() {
		return subAdrListId;
	}

	public void setSubAdrListId(long subAdrListId) {
		this.subAdrListId = subAdrListId;
	}
		


}
