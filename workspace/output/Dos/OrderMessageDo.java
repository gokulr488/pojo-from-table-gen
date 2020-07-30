package PojoFromTableGen.pojos.dos;

import java.sql.Date;
import java.sql.Timestamp;

public class OrderMessageDo {

	private int sequenceNo;
	private int tokenNo;
	private String timestamp;
	private Timestamp time;
	private String messageType;
	private double ordreId;
	private String orderType;
	private int qty;
	private int price;


	public int getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
		
	public int getTokenNo() {
		return tokenNo;
	}

	public void setTokenNo(int tokenNo) {
		this.tokenNo = tokenNo;
	}
		
	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
		
	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}
		
	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
		
	public double getOrdreId() {
		return ordreId;
	}

	public void setOrdreId(double ordreId) {
		this.ordreId = ordreId;
	}
		
	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
		
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
		
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
		


}
