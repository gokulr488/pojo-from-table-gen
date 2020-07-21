package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.SubCllListDo;

public interface SubCllListDao {

	public void insert(SubCllListDo subCllListDo, Connection conn);

	public SubCllListDo retrieveById(long id, Connection conn);

}
