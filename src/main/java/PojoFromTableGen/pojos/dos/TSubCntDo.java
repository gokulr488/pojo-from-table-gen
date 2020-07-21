package PojoFromTableGen.pojos.dos;

import java.sql.Date;

public class TSubCntDo {

	private String countryCode;
	private String areaNetworkCode;
	private String dialNumber;
	private String type;
	private Date dateFrom;
	private long subCntListId;


	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
		
	public String getAreaNetworkCode() {
		return areaNetworkCode;
	}

	public void setAreaNetworkCode(String areaNetworkCode) {
		this.areaNetworkCode = areaNetworkCode;
	}
		
	public String getDialNumber() {
		return dialNumber;
	}

	public void setDialNumber(String dialNumber) {
		this.dialNumber = dialNumber;
	}
		
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
		
	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
		
	public long getSubCntListId() {
		return subCntListId;
	}

	public void setSubCntListId(long subCntListId) {
		this.subCntListId = subCntListId;
	}
		


}
