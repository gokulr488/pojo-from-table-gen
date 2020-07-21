package PojoFromTableGen.pojos.dos;

import java.sql.Date;

public class TSubCtgDo {

	private String categoryType;
	private String category;
	private Date dateFrom;
	private Date dateTo;
	private long subCtgListId;


	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
		
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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
		
	public long getSubCtgListId() {
		return subCtgListId;
	}

	public void setSubCtgListId(long subCtgListId) {
		this.subCtgListId = subCtgListId;
	}
		


}
