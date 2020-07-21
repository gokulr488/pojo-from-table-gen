package PojoFromTableGen.pojos.dos;

import java.sql.Date;

public class TSubSrvDo {

	private long subSrvId;
	private String oId;
	private String stId;
	private String soId;
	private Date dateFrom;
	private Date dateTo;
	private String lockYn;
	private String adslEnabledYn;
	private long subSrvListId;


	public long getSubSrvId() {
		return subSrvId;
	}

	public void setSubSrvId(long subSrvId) {
		this.subSrvId = subSrvId;
	}
		
	public String getOId() {
		return oId;
	}

	public void setOId(String oId) {
		this.oId = oId;
	}
		
	public String getStId() {
		return stId;
	}

	public void setStId(String stId) {
		this.stId = stId;
	}
		
	public String getSoId() {
		return soId;
	}

	public void setSoId(String soId) {
		this.soId = soId;
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
		
	public String getLockYn() {
		return lockYn;
	}

	public void setLockYn(String lockYn) {
		this.lockYn = lockYn;
	}
		
	public String getAdslEnabledYn() {
		return adslEnabledYn;
	}

	public void setAdslEnabledYn(String adslEnabledYn) {
		this.adslEnabledYn = adslEnabledYn;
	}
		
	public long getSubSrvListId() {
		return subSrvListId;
	}

	public void setSubSrvListId(long subSrvListId) {
		this.subSrvListId = subSrvListId;
	}
		


}
