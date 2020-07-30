package PojoFromTableGen.pojos.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import PojoFromTableGen.pojos.dos.TradeMessageDo;

public class TradeMessageDao {

	//TODO add where conditions accordingly
	private static final String selectQuery = "SELECT sequence_no,token_no,timestamp,time,message_type,buy_order_id,sell_order_id,trade_price,trade_qty FROM trade_message WHERE ";

	public List<TradeMessageDo> findBy(long subscriptionId, Connection conn) {
		try (PreparedStatement stmt = conn.prepareStatement(selectQuery)) {
			stmt.setLong(1, subscriptionId);

			List<TradeMessageDo> dos = new ArrayList<TradeMessageDo>();

			ResultSet res = stmt.executeQuery();
			while (res.next()) {
				TradeMessageDo eventsDo = new TradeMessageDo();
				eventsDo.setSequenceNo(res.getInt("sequence_no"));
				eventsDo.setTokenNo(res.getInt("token_no"));
				eventsDo.setTimestamp(res.getString("timestamp"));
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
