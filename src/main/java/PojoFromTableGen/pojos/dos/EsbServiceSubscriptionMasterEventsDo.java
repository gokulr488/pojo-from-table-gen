package PojoFromTableGen.pojos.dos;

import java.sql.Date;

public class EsbServiceSubscriptionMasterEventsDo {

	private String serviceId;
	private Date activationDate;
	private long subscriptionId;


	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
		
	public Date getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}
		
	public long getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(long subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
		


}
