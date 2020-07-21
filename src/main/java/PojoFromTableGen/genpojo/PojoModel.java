package PojoFromTableGen.genpojo;

import java.util.List;

public class PojoModel {

	private String className;
	private String tableName;
	private List<Variables> variables;
	private List<String> imports;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Variables> getVariables() {
		return variables;
	}

	public void setVariables(List<Variables> variables) {
		this.variables = variables;
	}

	public List<String> getImports() {
		return imports;
	}

	public void setImports(List<String> imports) {
		this.imports = imports;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}
