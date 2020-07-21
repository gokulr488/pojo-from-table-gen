package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.TSubCtgDo;

public interface TSubCtgDao {

	public void insert(TSubCtgDo tSubCtgDo, Connection conn);

	public TSubCtgDo retrieveById(long id, Connection conn);

}
