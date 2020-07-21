package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.SubIdListDo;

public interface SubIdListDao {

	public void insert(SubIdListDo subIdListDo, Connection conn);

	public SubIdListDo retrieveById(long id, Connection conn);

}
