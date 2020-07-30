package PojoFromTableGen.pojos.dos;

import java.sql.Date;
import java.sql.Timestamp;

public class TradeMessageDo {

	private int sequenceNo;
	private int tokenNo;
	private String timestamp;
	private Timestamp time;
	private String messageType;
	private double buyOrderId;
	private double sellOrderId;
	private int tradePrice;
	private int tradeQty;


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
		
	public double getBuyOrderId() {
		return buyOrderId;
	}

	public void setBuyOrderId(double buyOrderId) {
		this.buyOrderId = buyOrderId;
	}
		
	public double getSellOrderId() {
		return sellOrderId;
	}

	public void setSellOrderId(double sellOrderId) {
		this.sellOrderId = sellOrderId;
	}
		
	public int getTradePrice() {
		return tradePrice;
	}

	public void setTradePrice(int tradePrice) {
		this.tradePrice = tradePrice;
	}
		
	public int getTradeQty() {
		return tradeQty;
	}

	public void setTradeQty(int tradeQty) {
		this.tradeQty = tradeQty;
	}
		


}
