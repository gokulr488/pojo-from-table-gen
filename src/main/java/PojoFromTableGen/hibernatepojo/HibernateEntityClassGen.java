package PojoFromTableGen.hibernatepojo;

import java.util.List;

import org.stringtemplate.v4.ST;

import PojoFromTableGen.GeneratorBase;
import PojoFromTableGen.genpojo.ForeignKey;
import PojoFromTableGen.genpojo.PojoModel;
import PojoFromTableGen.genpojo.PrimaryKey;
import PojoFromTableGen.utils.GenUtils;

public class HibernateEntityClassGen extends GeneratorBase {

	public void generateEntityClass(PojoModel model) {
		String gettersAndSeters = genGettersAndSetters(model.getVariables());
		String variables = genVariables(model);
		String primaryKey = genPrimaryKey(model.getPrimaryKey());
		String foreignKeys = genForeignKey(model.getForeignKeys());
		ST classTemplate = GenUtils.getTemplate("resources\\template.stg", "hibernateEntity");
		classTemplate.add("tableName", model.getTableName());
		classTemplate.add("className", model.getClassName());
		classTemplate.add("variables", variables);
		classTemplate.add("primaryKey", primaryKey);
		classTemplate.add("foreignKeys", foreignKeys);
		classTemplate.add("gettersAndSetters", gettersAndSeters);

	}

	private String genForeignKey(List<ForeignKey> foreignKeys) {
		// TODO Auto-generated method stub
		return null;
	}

	private String genPrimaryKey(PrimaryKey primaryKey) {
		// TODO Auto-generated method stub
		return null;
	}

	private String genVariables(PojoModel model) {

		return null;
	}

}
