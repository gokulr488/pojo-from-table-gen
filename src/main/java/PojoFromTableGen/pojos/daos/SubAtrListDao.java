package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.SubAtrListDo;

public interface SubAtrListDao {

	public void insert(SubAtrListDo subAtrListDo, Connection conn);

	public SubAtrListDo retrieveById(long id, Connection conn);

}
