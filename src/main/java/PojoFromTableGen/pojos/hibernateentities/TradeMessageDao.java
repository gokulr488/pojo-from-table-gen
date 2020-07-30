package PojoFromTableGen.pojos.hibernateentities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TradeMessageDao {

	// TODO add where conditions accordingly
	private static final String selectQuery = "SELECT sequence_no,token_no,timestamp,time,message_type,buy_order_id,sell_order_id,trade_price,trade_qty "
			+ "FROM trade_message WHERE ";
	private static final String insertQuery = "INSERT INTO trade_message values(?,?,?,?,?,?,?,?,?)";

	public void insert(List<TradeMessageDo> tradeMessages, Connection conn) {
		try (PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
			for (TradeMessageDo tradeMessage : tradeMessages) {
				stmt.setInt(1, tradeMessage.getSequenceNo());
				stmt.setInt(2, tradeMessage.getTokenNo());
				stmt.setLong(3, tradeMessage.getTimestamp());
				stmt.setTimestamp(4, tradeMessage.getTime());
				stmt.setString(5, tradeMessage.getMessageType());
				stmt.setDouble(6, tradeMessage.getBuyOrderId());
				stmt.setDouble(7, tradeMessage.getSellOrderId());
				stmt.setInt(8, tradeMessage.getTradePrice());
				stmt.setInt(9, tradeMessage.getTradeQty());
				stmt.addBatch();
			}
			stmt.execute();
			conn.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<TradeMessageDo> findBy(long subscriptionId, Connection conn) {
		try (PreparedStatement stmt = conn.prepareStatement(selectQuery)) {
			stmt.setLong(1, subscriptionId);

			List<TradeMessageDo> dos = new ArrayList<TradeMessageDo>();

			ResultSet res = stmt.executeQuery();
			while (res.next()) {
				TradeMessageDo eventsDo = new TradeMessageDo();
				eventsDo.setSequenceNo(res.getInt("sequence_no"));
				eventsDo.setTokenNo(res.getInt("token_no"));
				eventsDo.setTimestamp(res.getLong("timestamp"));
				eventsDo.setTime(res.getTimestamp("time"));
				eventsDo.setMessageType(res.getString("message_type"));
				eventsDo.setBuyOrderId(res.getDouble("buy_order_id"));
				eventsDo.setSellOrderId(res.getDouble("sell_order_id"));
				eventsDo.setTradePrice(res.getInt("trade_price"));
				eventsDo.setTradeQty(res.getInt("trade_qty"));

				dos.add(eventsDo);
			}

			return dos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
