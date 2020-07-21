package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.TSubRolDo;

public interface TSubRolDao {

	public void insert(TSubRolDo tSubRolDo, Connection conn);

	public TSubRolDo retrieveById(long id, Connection conn);

}
