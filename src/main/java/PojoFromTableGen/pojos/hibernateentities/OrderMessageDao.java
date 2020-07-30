package PojoFromTableGen.pojos.hibernateentities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderMessageDao {

	// TODO add where conditions accordingly
	private static final String selectQuery = "SELECT sequence_no,token_no,timestamp,time,message_type,ordre_id,order_type,qty,price "
			+ "FROM order_message WHERE ";

	private static final String insertQuery = "INSERT INTO order_message values(?,?,?,?,?,?,?,?,?)";

	public void insert(List<OrderMessageDo> orderMessages, Connection conn) {
		try (PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
			for (OrderMessageDo orderMessage : orderMessages) {
				stmt.setInt(1, orderMessage.getSequenceNo());
				stmt.setInt(2, orderMessage.getTokenNo());
				stmt.setLong(3, orderMessage.getTimestamp());
				stmt.setTimestamp(4, orderMessage.getTime());
				stmt.setString(5, orderMessage.getMessageType());
				stmt.setDouble(6, orderMessage.getOrderId());
				stmt.setString(7, orderMessage.getOrderType());
				stmt.setInt(8, orderMessage.getQty());
				stmt.setInt(9, orderMessage.getPrice());
				stmt.addBatch();
			}
			stmt.execute();
			conn.commit();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public List<OrderMessageDo> findBy(long subscriptionId, Connection conn) {
		try (PreparedStatement stmt = conn.prepareStatement(selectQuery)) {
			stmt.setLong(1, subscriptionId);

			List<OrderMessageDo> dos = new ArrayList<OrderMessageDo>();

			ResultSet res = stmt.executeQuery();
			while (res.next()) {
				OrderMessageDo eventsDo = new OrderMessageDo();
				eventsDo.setSequenceNo(res.getInt("sequence_no"));
				eventsDo.setTokenNo(res.getInt("token_no"));
				eventsDo.setTimestamp(res.getLong("timestamp"));
				eventsDo.setTime(res.getTimestamp("time"));
				eventsDo.setMessageType(res.getString("message_type"));
				eventsDo.setOrderId(res.getDouble("ordre_id"));
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
