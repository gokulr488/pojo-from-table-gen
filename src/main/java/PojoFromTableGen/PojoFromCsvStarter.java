package PojoFromTableGen;

import java.util.ArrayList;
import java.util.List;

import PojoFromTableGen.genpojo.MetadataToPojoModel;
import PojoFromTableGen.genpojo.PojoGenerator;
import PojoFromTableGen.genpojo.PojoModel;
import PojoFromTableGen.tabledatacollector.Column;
import PojoFromTableGen.tabledatacollector.Metadata;
import PojoFromTableGen.tabledatacollector.Table;
import PojoFromTableGen.utils.FileReadUtils;

public class PojoFromCsvStarter {

	public static void main(String[] args) {
		String inputFile = "resources\\metaData.txt";
		String tableName = "ESB_SERVICE_DETAILS_EVENTS";
		Metadata metadata = fillMetadata(inputFile, tableName);

		MetadataToPojoModel converter = new MetadataToPojoModel(metadata);
		for (PojoModel model : converter.convert()) {
			PojoGenerator gen = new PojoGenerator();
			// Generate Pojos
			
			gen.generateDaoImpl(model);
			
			gen.generatePojo(model);
			// gen.generateDaoInterface(model);
			// gen.genDaoImpl(model);
		}
	}

	private static Metadata fillMetadata(String inputFile, String tableName) {
		FileReadUtils reader = new FileReadUtils();
		reader.openFile(inputFile);
		List<String> columnRaw = reader.readAllLines();
		Table table = populateColumnInfo(columnRaw);
		table.setTableName(tableName);
		Metadata metadata = new Metadata();
		List<Table> tables = new ArrayList<Table>();
		tables.add(table);
		metadata.setTables(tables);

		return metadata;
	}

	private static Table populateColumnInfo(List<String> columnRaw) {
		Table table = new Table();
		List<Column> columns = new ArrayList<Column>();
		for (String col : columnRaw) {
			String[] colInfo = col.split(",");
			Column column = new Column();
			column.setColumnName(colInfo[0]);
			column.setDataType(colInfo[1]);
			columns.add(column);
		}

		table.setColumns(columns);
		return table;
	}

}
