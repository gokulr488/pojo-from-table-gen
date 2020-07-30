package PojoFromTableGen.pojos.dos;

import java.sql.Date;
import java.sql.Timestamp;

public class EsbContactAttachmentEventsDo {

	private long seqId;
	private String subscriber;
	private long level;
	private long contactId;
	private String contactType;
	private String status;


	public long getSeqId() {
		return seqId;
	}

	public void setSeqId(long seqId) {
		this.seqId = seqId;
	}
		
	public String getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(String subscriber) {
		this.subscriber = subscriber;
	}
		
	public long getLevel() {
		return level;
	}

	public void setLevel(long level) {
		this.level = level;
	}
		
	public long getContactId() {
		return contactId;
	}

	public void setContactId(long contactId) {
		this.contactId = contactId;
	}
		
	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
		
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
		


}
