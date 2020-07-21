package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.SubSrvNeListDo;

public interface SubSrvNeListDao {

	public void insert(SubSrvNeListDo subSrvNeListDo, Connection conn);

	public SubSrvNeListDo retrieveById(long id, Connection conn);

}
