package PojoFromTableGen.pojos.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import PojoFromTableGen.pojos.dos.EsbServiceDetailsEventsDo;

public class EsbServiceDetailsEventsDao {

	//TODO add where conditions accordingly
	private static final String selectQuery = "SELECT SERVICE_ID,SERVICE_NAME,CREATE_DATE,CREATE_USER,INSTANCE_ID,APPLICABLE_CONNECTION_TYPE,SEQ_ID,LANG_ID,ENTITY_ID,UPDATE_DATE FROM ESB_SERVICE_DETAILS_EVENTS WHERE ";

	public List<EsbServiceDetailsEventsDo> findBy(long subscriptionId, Connection conn) {
		try (PreparedStatement stmt = conn.prepareStatement(selectQuery)) {
			stmt.setLong(1, subscriptionId);

			List<EsbServiceDetailsEventsDo> dos = new ArrayList<EsbServiceDetailsEventsDo>();

			ResultSet res = stmt.executeQuery();
			while (res.next()) {
				EsbServiceDetailsEventsDo eventsDo = new EsbServiceDetailsEventsDo();
				eventsDo.setServiceId(res.getLong("SERVICE_ID"));
				eventsDo.setServiceName(res.getString("SERVICE_NAME"));
				eventsDo.setCreateDate(res.getTimestamp("CREATE_DATE"));
				eventsDo.setCreateUser(res.getString("CREATE_USER"));
				eventsDo.setInstanceId(res.getString("INSTANCE_ID"));
				eventsDo.setApplicableConnectionType(res.getLong("APPLICABLE_CONNECTION_TYPE"));
				eventsDo.setSeqId(res.getLong("SEQ_ID"));
				eventsDo.setLangId(res.getLong("LANG_ID"));
				eventsDo.setEntityId(res.getLong("ENTITY_ID"));
				eventsDo.setUpdateDate(res.getTimestamp("UPDATE_DATE"));

				dos.add(eventsDo);
			}

			return dos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
