package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.TSubCntDo;

public interface TSubCntDao {

	public void insert(TSubCntDo tSubCntDo, Connection conn);

	public TSubCntDo retrieveById(long id, Connection conn);

}
