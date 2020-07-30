package PojoFromTableGen.pojos.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import PojoFromTableGen.pojos.dos.EsbContactAttachmentEventsDo;

public class EsbContactAttachmentEventsDao {

	// TODO add where conditions accordingly
	private static final String selectQuery = "SELECT SEQ_ID,SUBSCRIBER,LEVEL_,CONTACT_ID,CONTACT_TYPE,STATUS "
			+ "FROM ESB_CONTACT_ATTACHMENT_EVENTS WHERE SUBSCRIBER = ? and LEVEL_ = ? ";

	public List<EsbContactAttachmentEventsDo> findBy(String subscriber, long level, Connection conn) {
		try (PreparedStatement stmt = conn.prepareStatement(selectQuery)) {
			stmt.setString(1, subscriber);
			stmt.setLong(2, level);

			List<EsbContactAttachmentEventsDo> dos = new ArrayList<EsbContactAttachmentEventsDo>();

			ResultSet res = stmt.executeQuery();
			while (res.next()) {
				EsbContactAttachmentEventsDo eventsDo = new EsbContactAttachmentEventsDo();
				eventsDo.setSeqId(res.getLong("SEQ_ID"));
				eventsDo.setSubscriber(res.getString("SUBSCRIBER"));
				eventsDo.setLevel(res.getLong("LEVEL_"));
				eventsDo.setContactId(res.getLong("CONTACT_ID"));
				eventsDo.setContactType(res.getString("CONTACT_TYPE"));
				eventsDo.setStatus(res.getString("STATUS"));

				dos.add(eventsDo);
			}

			return dos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
