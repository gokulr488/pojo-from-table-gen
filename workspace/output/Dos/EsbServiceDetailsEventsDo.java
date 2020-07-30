package PojoFromTableGen.pojos.dos;

import java.sql.Date;
import java.sql.Timestamp;

public class EsbServiceDetailsEventsDo {

	private long serviceId;
	private String serviceName;
	private Timestamp createDate;
	private String createUser;
	private String instanceId;
	private long applicableConnectionType;
	private long seqId;
	private long langId;
	private long entityId;
	private Timestamp updateDate;


	public long getServiceId() {
		return serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}
		
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
		
	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
		
	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
		
	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
		
	public long getApplicableConnectionType() {
		return applicableConnectionType;
	}

	public void setApplicableConnectionType(long applicableConnectionType) {
		this.applicableConnectionType = applicableConnectionType;
	}
		
	public long getSeqId() {
		return seqId;
	}

	public void setSeqId(long seqId) {
		this.seqId = seqId;
	}
		
	public long getLangId() {
		return langId;
	}

	public void setLangId(long langId) {
		this.langId = langId;
	}
		
	public long getEntityId() {
		return entityId;
	}

	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}
		
	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}
		


}
