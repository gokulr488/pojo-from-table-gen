package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.TSubAdrDo;

public interface TSubAdrDao {

	public void insert(TSubAdrDo tSubAdrDo, Connection conn);

	public TSubAdrDo retrieveById(long id, Connection conn);

}
