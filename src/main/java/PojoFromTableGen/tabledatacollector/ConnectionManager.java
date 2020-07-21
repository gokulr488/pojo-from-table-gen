package PojoFromTableGen.tabledatacollector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import PojoFromTableGen.Configs;

public class ConnectionManager {

	private Connection connection;

	public Connection getSourceConnection() {

		try {
			connection = DriverManager.getConnection(Configs.url, Configs.username, Configs.password);
			System.out.println("DB Connected");
		} catch (SQLException e) {
			System.out.println("Unable to get DB Connection");
			e.printStackTrace();
		}
		return connection;

	}

	public Metadata getMetaData() {

		MetaDataCollection dataCollector = new MetaDataCollection();
		try {
			return dataCollector.getMetaData(connection);
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
	}
}
