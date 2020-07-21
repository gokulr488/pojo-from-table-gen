package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.SubSrvAtrListDo;

public interface SubSrvAtrListDao {

	public void insert(SubSrvAtrListDo subSrvAtrListDo, Connection conn);

	public SubSrvAtrListDo retrieveById(long id, Connection conn);

}
