package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.TSubDtlDo;

public interface TSubDtlDao {

	public void insert(TSubDtlDo tSubDtlDo, Connection conn);

	public TSubDtlDo retrieveById(long id, Connection conn);

}
