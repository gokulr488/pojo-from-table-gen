package PojoFromTableGen.pojos.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import PojoFromTableGen.pojos.dos.EsbAddressDetailsEventsDo;

public class EsbAddressDetailsEventsDao {

	// TODO change where conditions accordingly
	private static final String selectQuery = "SELECT ADDRESS_ID,SUBSCRIBER,SUBSCRIBER_LEVEL,ADDRESS_TYPE,ADDR_LINE1,ADDR_LINE2,ADDR_LINE3,ADDR_LINE4,ADDR_LINE5,ADDR_LINE6,ADDR_LINE7,ADDR_LINE8,LANGUAGE_ID,COMPANY,BRANCH,CREATE_USER,UPDATE_USER,CREATE_DATE,UPDATE_DATE,CREATED_FROM,UPDATED_FROM "
			+ "FROM ESB_ADDRESS_DETAILS_EVENTS WHERE ADDRESS_ID = ?";

	public List<EsbAddressDetailsEventsDo> findBy(long addressId, Connection conn) {
		try (PreparedStatement stmt = conn.prepareStatement(selectQuery)) {
			stmt.setLong(1, addressId);

			List<EsbAddressDetailsEventsDo> dos = new ArrayList<EsbAddressDetailsEventsDo>();

			ResultSet res = stmt.executeQuery();
			while (res.next()) {
				EsbAddressDetailsEventsDo eventsDo = new EsbAddressDetailsEventsDo();
				eventsDo.setAddressId(res.getLong("ADDRESS_ID"));
				eventsDo.setSubscriber(res.getString("SUBSCRIBER"));
				eventsDo.setSubscriberLevel(res.getLong("SUBSCRIBER_LEVEL"));
				eventsDo.setAddressType(res.getLong("ADDRESS_TYPE"));
				eventsDo.setAddrLine1(res.getString("ADDR_LINE1"));
				eventsDo.setAddrLine2(res.getString("ADDR_LINE2"));
				eventsDo.setAddrLine3(res.getString("ADDR_LINE3"));
				eventsDo.setAddrLine4(res.getString("ADDR_LINE4"));
				eventsDo.setAddrLine5(res.getString("ADDR_LINE5"));
				eventsDo.setAddrLine6(res.getString("ADDR_LINE6"));
				eventsDo.setAddrLine7(res.getString("ADDR_LINE7"));
				eventsDo.setAddrLine8(res.getString("ADDR_LINE8"));
				eventsDo.setLanguageId(res.getLong("LANGUAGE_ID"));
				eventsDo.setCompany(res.getString("COMPANY"));
				eventsDo.setBranch(res.getString("BRANCH"));
				eventsDo.setCreateUser(res.getString("CREATE_USER"));
				eventsDo.setUpdateUser(res.getString("UPDATE_USER"));
				eventsDo.setCreateDate(res.getDate("CREATE_DATE"));
				eventsDo.setUpdateDate(res.getDate("UPDATE_DATE"));
				eventsDo.setCreatedFrom(res.getDate("CREATED_FROM"));
				eventsDo.setUpdatedFrom(res.getDate("UPDATED_FROM"));

				dos.add(eventsDo);
			}

			return dos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
