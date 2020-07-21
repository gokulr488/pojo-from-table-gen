package PojoFromTableGen.pojos.dos;

import java.sql.Date;
import java.util.List;

public class TSubEventDo {

	private String eventType;
	private String busEventType;
	private long eventSeq;
	private long requestSeq;
	private Date eventDate;
	private long icapId;
	private String customerId;
	private long icapEventSeq;
	private String refNo;
	private List<SubDtlListDo> subDtlListDos;

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getBusEventType() {
		return busEventType;
	}

	public void setBusEventType(String busEventType) {
		this.busEventType = busEventType;
	}

	public long getEventSeq() {
		return eventSeq;
	}

	public void setEventSeq(long eventSeq) {
		this.eventSeq = eventSeq;
	}

	public long getRequestSeq() {
		return requestSeq;
	}

	public void setRequestSeq(long requestSeq) {
		this.requestSeq = requestSeq;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public long getIcapId() {
		return icapId;
	}

	public void setIcapId(long icapId) {
		this.icapId = icapId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public long getIcapEventSeq() {
		return icapEventSeq;
	}

	public void setIcapEventSeq(long icapEventSeq) {
		this.icapEventSeq = icapEventSeq;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public List<SubDtlListDo> getSubDtlListDos() {
		return subDtlListDos;
	}

	public void setSubDtlListDos(List<SubDtlListDo> subDtlListDos) {
		this.subDtlListDos = subDtlListDos;
	}

}
