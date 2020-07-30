package PojoFromTableGen.pojos.hibernateentities;

import java.sql.Timestamp;

public class OrderMessageDo {

	private int sequenceNo;
	private int tokenNo;
	private long timestamp;
	private Timestamp time;
	private String messageType;
	private double orderId;
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

	public double getOrderId() {
		return orderId;
	}

	public void setOrderId(double orderId) {
		this.orderId = orderId;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

}
