package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.SubAdrListDo;

public interface SubAdrListDao {

	public void insert(SubAdrListDo subAdrListDo, Connection conn);

	public SubAdrListDo retrieveById(long id, Connection conn);

}
