package PojoFromTableGen.pojos.dos;

import java.sql.Date;

public class TSubRolDo {

	private String roleType;
	private Date dateFrom;
	private long subRolListId;


	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
		
	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
		
	public long getSubRolListId() {
		return subRolListId;
	}

	public void setSubRolListId(long subRolListId) {
		this.subRolListId = subRolListId;
	}
		


}
