package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.SubSrvListDo;

public interface SubSrvListDao {

	public void insert(SubSrvListDo subSrvListDo, Connection conn);

	public SubSrvListDo retrieveById(long id, Connection conn);

}
