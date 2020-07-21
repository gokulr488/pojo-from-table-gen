package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.TSrvIdDo;

public interface TSrvIdDao {

	public void insert(TSrvIdDo tSrvIdDo, Connection conn);

	public TSrvIdDo retrieveById(long id, Connection conn);

}
