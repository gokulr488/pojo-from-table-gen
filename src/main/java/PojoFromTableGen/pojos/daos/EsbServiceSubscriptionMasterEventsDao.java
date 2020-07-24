package PojoFromTableGen.pojos.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import PojoFromTableGen.pojos.dos.EsbServiceSubscriptionMasterEventsDo;

public class EsbServiceSubscriptionMasterEventsDao {

	//TODO add where conditions accordingly
	private static final String selectQuery = "SELECT SERVICE_ID,ACTIVATION_DATE,SUBSCRIPTION_ID "
			+ "FROM ESB_SERVICE_SUBSCRIPTION_MASTER_EVENTS WHERE SUBSCRIPTION_ID = ?";

	public List<EsbServiceSubscriptionMasterEventsDo> findBy(long subscriptionId, Connection conn) {
		try (PreparedStatement stmt = conn.prepareStatement(selectQuery)) {
			stmt.setLong(1, subscriptionId);

			List<EsbServiceSubscriptionMasterEventsDo> dos = new ArrayList<EsbServiceSubscriptionMasterEventsDo>();

			ResultSet res = stmt.executeQuery();
			while (res.next()) {
				EsbServiceSubscriptionMasterEventsDo eventsDo = new EsbServiceSubscriptionMasterEventsDo();
				eventsDo.setServiceId(res.getString("SERVICE_ID"));
				eventsDo.setActivationDate(res.getDate("ACTIVATION_DATE"));
				eventsDo.setSubscriptionId(res.getLong("SUBSCRIPTION_ID"));

				dos.add(eventsDo);
			}

			return dos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
