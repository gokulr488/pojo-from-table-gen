package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.SubSrvIdListDo;

public interface SubSrvIdListDao {

	public void insert(SubSrvIdListDo subSrvIdListDo, Connection conn);

	public SubSrvIdListDo retrieveById(long id, Connection conn);

}
