package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.TSubAtrDo;

public interface TSubAtrDao {

	public void insert(TSubAtrDo tSubAtrDo, Connection conn);

	public TSubAtrDo retrieveById(long id, Connection conn);

}
