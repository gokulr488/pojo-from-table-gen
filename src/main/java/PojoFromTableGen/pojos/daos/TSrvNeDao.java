package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.TSrvNeDo;

public interface TSrvNeDao {

	public void insert(TSrvNeDo tSrvNeDo, Connection conn);

	public TSrvNeDo retrieveById(long id, Connection conn);

}
