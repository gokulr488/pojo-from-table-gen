package PojoFromTableGen.pojos.dos;

import java.sql.Date;

public class TSrvIdDo {

	private String idType;
	private String id;
	private Date startDate;
	private Date endDate;
	private long subSrvIdListId;


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
		
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
		
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
		
	public long getSubSrvIdListId() {
		return subSrvIdListId;
	}

	public void setSubSrvIdListId(long subSrvIdListId) {
		this.subSrvIdListId = subSrvIdListId;
	}
		


}
