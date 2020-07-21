package PojoFromTableGen.pojos.dos;

import java.sql.Date;

public class TSrvAtrDo {

	private String name;
	private String value;
	private long subSrvAtrListId;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
		
	public long getSubSrvAtrListId() {
		return subSrvAtrListId;
	}

	public void setSubSrvAtrListId(long subSrvAtrListId) {
		this.subSrvAtrListId = subSrvAtrListId;
	}
		


}
