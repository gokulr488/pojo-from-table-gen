package PojoFromTableGen.pojos.dos;

import java.sql.Date;

public class TSubCllDo {

	private String cllType;
	private long cllValue;
	private Date cllActivationDate;
	private Date cllStartDate;
	private Date cllEndDate;
	private long cllThreshold1;
	private long cllThreshold2;
	private long cllThreshold3;
	private String cllNotificationMethod;
	private String cllNotificationNumber;
	private long subCllListId;


	public String getCllType() {
		return cllType;
	}

	public void setCllType(String cllType) {
		this.cllType = cllType;
	}
		
	public long getCllValue() {
		return cllValue;
	}

	public void setCllValue(long cllValue) {
		this.cllValue = cllValue;
	}
		
	public Date getCllActivationDate() {
		return cllActivationDate;
	}

	public void setCllActivationDate(Date cllActivationDate) {
		this.cllActivationDate = cllActivationDate;
	}
		
	public Date getCllStartDate() {
		return cllStartDate;
	}

	public void setCllStartDate(Date cllStartDate) {
		this.cllStartDate = cllStartDate;
	}
		
	public Date getCllEndDate() {
		return cllEndDate;
	}

	public void setCllEndDate(Date cllEndDate) {
		this.cllEndDate = cllEndDate;
	}
		
	public long getCllThreshold1() {
		return cllThreshold1;
	}

	public void setCllThreshold1(long cllThreshold1) {
		this.cllThreshold1 = cllThreshold1;
	}
		
	public long getCllThreshold2() {
		return cllThreshold2;
	}

	public void setCllThreshold2(long cllThreshold2) {
		this.cllThreshold2 = cllThreshold2;
	}
		
	public long getCllThreshold3() {
		return cllThreshold3;
	}

	public void setCllThreshold3(long cllThreshold3) {
		this.cllThreshold3 = cllThreshold3;
	}
		
	public String getCllNotificationMethod() {
		return cllNotificationMethod;
	}

	public void setCllNotificationMethod(String cllNotificationMethod) {
		this.cllNotificationMethod = cllNotificationMethod;
	}
		
	public String getCllNotificationNumber() {
		return cllNotificationNumber;
	}

	public void setCllNotificationNumber(String cllNotificationNumber) {
		this.cllNotificationNumber = cllNotificationNumber;
	}
		
	public long getSubCllListId() {
		return subCllListId;
	}

	public void setSubCllListId(long subCllListId) {
		this.subCllListId = subCllListId;
	}
		


}
