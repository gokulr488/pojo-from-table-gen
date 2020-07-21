package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.TSubSrvDo;

public interface TSubSrvDao {

	public void insert(TSubSrvDo tSubSrvDo, Connection conn);

	public TSubSrvDo retrieveById(long id, Connection conn);

}
