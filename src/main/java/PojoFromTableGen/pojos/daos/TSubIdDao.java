package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.TSubIdDo;

public interface TSubIdDao {

	public void insert(TSubIdDo tSubIdDo, Connection conn);

	public TSubIdDo retrieveById(long id, Connection conn);

}
