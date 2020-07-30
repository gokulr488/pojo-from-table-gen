package PojoFromTableGen.pojos.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import PojoFromTableGen.pojos.dos.OrderMessageDo;

public class OrderMessageDao {

	//TODO add where conditions accordingly
	private static final String selectQuery = "SELECT sequence_no,token_no,timestamp,time,message_type,ordre_id,order_type,qty,price "
			+ "FROM order_message WHERE ";
	
	private static final String insertQuery="";

	public List<OrderMessageDo> findBy(long subscriptionId, Connection conn) {
		try (PreparedStatement stmt = conn.prepareStatement(selectQuery)) {
			stmt.setLong(1, subscriptionId);

			List<OrderMessageDo> dos = new ArrayList<OrderMessageDo>();

			ResultSet res = stmt.executeQuery();
			while (res.next()) {
				OrderMessageDo eventsDo = new OrderMessageDo();
				eventsDo.setSequenceNo(res.getInt("sequence_no"));
				eventsDo.setTokenNo(res.getInt("token_no"));
				eventsDo.setTimestamp(res.getString("timestamp"));
				eventsDo.setTime(res.getTimestamp("time"));
				eventsDo.setMessageType(res.getString("message_type"));
				eventsDo.setOrdreId(res.getDouble("ordre_id"));
				eventsDo.setOrderType(res.getString("order_type"));
				eventsDo.setQty(res.getInt("qty"));
				eventsDo.setPrice(res.getInt("price"));

				dos.add(eventsDo);
			}

			return dos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
