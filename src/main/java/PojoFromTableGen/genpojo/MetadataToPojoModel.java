package PojoFromTableGen.genpojo;

import java.util.ArrayList;
import java.util.List;

import PojoFromTableGen.tabledatacollector.Column;
import PojoFromTableGen.tabledatacollector.ForeignKey;
import PojoFromTableGen.tabledatacollector.Metadata;
import PojoFromTableGen.tabledatacollector.PrimaryKey;
import PojoFromTableGen.tabledatacollector.Table;

public class MetadataToPojoModel {
	private Metadata metadata;

	public MetadataToPojoModel(Metadata metadata) {
		this.metadata = metadata;
	}

	public List<PojoModel> convert() {
		List<PojoModel> models = new ArrayList<PojoModel>();
		for (Table table : metadata.getTables()) {
			PojoModel model = new PojoModel();
			model.setClassName(getClassName(table.getTableName()));
			model.setTableName(table.getTableName());
			List<Variables> variables = new ArrayList<Variables>();

			for (Column column : table.getColumns()) {
				Variables var = new Variables();
				var.setVariableName(getVariableName(column.getColumnName()));
				var.setDataType(getJavaDataType(column.getDataType()));
				var.setColumnName(column.getColumnName());
				variables.add(var);
			}
			model.setVariables(variables);

			if (table.getForeignKeys() != null) {
				List<PojoFromTableGen.genpojo.ForeignKey> foreignKeys = new ArrayList<PojoFromTableGen.genpojo.ForeignKey>();
				for (ForeignKey foreignKey : table.getForeignKeys()) {

					PojoFromTableGen.genpojo.ForeignKey modelFKey = new PojoFromTableGen.genpojo.ForeignKey();

					modelFKey.setColumnName(foreignKey.getRefferingColumnName());
					modelFKey.setForeignTableEntityClassName(getClassName(foreignKey.getForeignTableName()));
					foreignKeys.add(modelFKey);

				}
				model.setForeignKeys(foreignKeys);
			}
			if (table.getPrimaryKeys() != null) {
				PrimaryKey pKey = table.getPrimaryKeys().get(0);
				PojoFromTableGen.genpojo.PrimaryKey primaryKey = new PojoFromTableGen.genpojo.PrimaryKey();
				primaryKey.setColumnName(pKey.getPrimaryKey());
				primaryKey.setVarName(getVariableName(pKey.getPrimaryKey()));
				for (Column column : table.getColumns()) {
					if (column.getColumnName().equals(pKey.getPrimaryKey())) {
						primaryKey.setDataType(getJavaDataType(column.getDataType()));
						break;
					}
				}

				model.setPrimaryKey(primaryKey);
			}
			models.add(model);
		}
		return models;
	}

	private String getJavaDataType(String dataType) {

		if (dataType.equals("VARCHAR2")) {
			return "String";
		} else if (dataType.equals("NUMBER")) {
			return "long";
		} else if (dataType.equals("DATE")) {
			return "Date";
		} else if (dataType.equals("TIMESTAMP")) {
			return "Timestamp";
		} else if (dataType.equals("FLOAT")) {
			return "float";
		} else {

			System.out.println("Unknwn : " + dataType);
		}
		return null;

	}

	private String getClassName(String tableName) {
		String className = "";
		String words[] = tableName.split("_");
		for (String word : words) {
			word = word.toLowerCase();
			word = word.substring(0, 1).toUpperCase() + word.substring(1);
			className += word;
		}
		return className;
	}

	private String getVariableName(String columnName) {
		String varName = "";
		int i = 0;
		String words[] = columnName.split("_");
		for (String word : words) {
			word = word.toLowerCase();
			if (i > 0) {
				word = word.substring(0, 1).toUpperCase() + word.substring(1);
			}
			varName += word;
			i++;
		}
		return varName;
	}

}
