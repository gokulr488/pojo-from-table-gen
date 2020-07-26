package PojoFromTableGen;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import PojoFromTableGen.genpojo.MetadataToPojoModel;
import PojoFromTableGen.genpojo.PojoGenerator;
import PojoFromTableGen.genpojo.PojoModel;
import PojoFromTableGen.tabledatacollector.ConnectionManager;
import PojoFromTableGen.tabledatacollector.Metadata;

public class PojoFromTableGenStarter {

	public static void main(String[] args) throws SQLException {
		try {
			Configs.getAllConfigs();
		} catch (IOException e) {
			System.out.println("Could not Read configuration file");
			e.printStackTrace();
		}
		// DB Connection
				
		ConnectionManager conManager = new ConnectionManager();
//		EsbServiceDetailsEventsDao dao=new EsbServiceDetailsEventsDao();
//		dao.findBy(11L, conManager.getSourceConnection());
		Connection conn=conManager.getSourceConnection();
		PreparedStatement stmt = conn.prepareCall("call DBMS_SNAPSHOT.REFRESH('ESB_SERVICE_EVENTS','c')");
		stmt.execute();
		// Collect Metadata
		Metadata metadata = conManager.getMetaData();
		// Convert Metadata to Pojo Model
		MetadataToPojoModel converter = new MetadataToPojoModel(metadata);
		for (PojoModel model : converter.convert()) {
			PojoGenerator gen = new PojoGenerator();
			// Generate Pojos
			gen.generatePojo(model);
			//gen.generateDaoInterface(model);
			//gen.genDaoImpl(model);
		}

	}

	/*
	 * 
	 * public static void test(Table table) { PojoModel model = new PojoModel();
	 * model.setClassName(table.getTableName()); List<Variables> variables = new
	 * ArrayList<Variables>(); for (Column column : table.getColumns()) { Variables
	 * variable = new Variables(); variable.setDataType(column.getDataType());
	 * variable.setVariableName(column.getColumnName()); variables.add(variable); }
	 * model.setVariables(variables); PojoGenerator gen = new PojoGenerator();
	 * gen.generatePojo(model);
	 * 
	 * }
	 */

}
