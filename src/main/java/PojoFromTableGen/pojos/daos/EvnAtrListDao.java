package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.EvnAtrListDo;

public interface EvnAtrListDao {

	public void insert(EvnAtrListDo evnAtrListDo, Connection conn);

	public EvnAtrListDo retrieveById(long id, Connection conn);

}
