package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.SubCtgListDo;

public interface SubCtgListDao {

	public void insert(SubCtgListDo subCtgListDo, Connection conn);

	public SubCtgListDo retrieveById(long id, Connection conn);

}
