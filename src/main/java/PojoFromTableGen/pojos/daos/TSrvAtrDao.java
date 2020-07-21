package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.TSrvAtrDo;

public interface TSrvAtrDao {

	public void insert(TSrvAtrDo tSrvAtrDo, Connection conn);

	public TSrvAtrDo retrieveById(long id, Connection conn);

}
