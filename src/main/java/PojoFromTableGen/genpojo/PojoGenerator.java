package PojoFromTableGen.genpojo;

import java.util.List;

import org.stringtemplate.v4.ST;

import PojoFromTableGen.GeneratorBase;
import PojoFromTableGen.utils.FileWriteUtils;
import PojoFromTableGen.utils.GenUtils;

public class PojoGenerator extends GeneratorBase {

	public void generateDaoInterface(PojoModel model) {
		ST pojoTemplate = GenUtils.getTemplate("resources\\template.stg", "daoInterface");
		pojoTemplate.add("interfaceName", model.getClassName());
		pojoTemplate.add("varName", getSmallStartLetter(model.getClassName()));

		FileWriteUtils writer = new FileWriteUtils();
		writer.openFile("Daos\\" + model.getClassName() + "Dao.java");
		writer.write(pojoTemplate.render());
		System.out.println("Generated Dao interface for " + model.getClassName());
		writer.close();
	}

	public void generateDaoImpl(PojoModel model) {
		ST selectQuery = new ST("SELECT <columns> FROM <tableName>");
		selectQuery.add("columns", getColumns(model.getVariables()));
		selectQuery.add("tableName", model.getTableName());
		ST daoImplTemp = GenUtils.getTemplate("resources\\template.stg", "daoTemplate");
		daoImplTemp.add("selectQuery", selectQuery.render());
		daoImplTemp.add("className", model.getClassName());
		daoImplTemp.add("gettersFromResultSet", genGettersFromResSet(model));

		FileWriteUtils writer = new FileWriteUtils();
		writer.openFile("Daos\\" + model.getClassName() + "Dao.java");
		writer.write(daoImplTemp.render());
		System.out.println("Generated Dao IMPL for " + model.getClassName());
		writer.close();

	}

	private String genGettersFromResSet(PojoModel model) {
		String gettersFromResultSet = "";
		for (Variables var : model.getVariables()) {
			ST temp = new ST("eventsDo.set<setter>(res.get<dataType>(\"<columnName>\"));");
			temp.add("setter", getCapStartLetter(var.getVariableName()));
			temp.add("dataType", getCapStartLetter(var.getDataType()));
			temp.add("columnName", var.getColumnName());
			gettersFromResultSet += temp.render() + "\n";
		}

		return gettersFromResultSet;
	}

	private String getColumns(List<Variables> variables) {
		String columns = "";
		for (Variables var : variables) {
			columns += var.getColumnName() + ",";
		}
		columns = columns.substring(0, columns.length() - 1);
		return columns;
	}

	public void generatePojo(PojoModel model) {

		String variables = generateVariables(model.getVariables());
		String gettersAndSeters = genGettersAndSetters(model.getVariables());

		ST pojoTemplate = GenUtils.getTemplate("resources\\template.stg", "pojoTemplate");
		pojoTemplate.add("className", model.getClassName());
		pojoTemplate.add("variables", variables);
		pojoTemplate.add("gettersAndSetters", gettersAndSeters);

		FileWriteUtils writer = new FileWriteUtils();
		writer.openFile("Dos\\" + model.getClassName() + "Do.java");
		writer.write(pojoTemplate.render());
		System.out.println("Generated Pojo for " + model.getClassName());
		writer.close();

	}

	private String genInsertStmt(List<Variables> variables, String className) {
		String statements = "";
		int index = 1;
		className = getSmallStartLetter(className);
		for (Variables var : variables) {
			ST temp = new ST("stmt.set<dataType>(<index>, <varName>.get<getter>());\n");
			temp.add("dataType", var.getDataType());
			temp.add("index", index);
			temp.add("varName", className + "Do");
			temp.add("getter", getCapStartLetter(var.getVariableName()));

			statements += temp.render();
			index++;
		}

		return statements;
	}

	private String generateVariables(List<Variables> variables) {
		String genVariables = "";

		for (Variables var : variables) {
			ST template = new ST("private <dataType> <variableName>;");
			template.add("dataType", var.getDataType());
			template.add("variableName", var.getVariableName());

			genVariables += template.render() + "\n";
		}
		return genVariables;
	}

}
