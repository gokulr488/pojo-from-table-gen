package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.TSubCllDo;

public interface TSubCllDao {

	public void insert(TSubCllDo tSubCllDo, Connection conn);

	public TSubCllDo retrieveById(long id, Connection conn);

}
