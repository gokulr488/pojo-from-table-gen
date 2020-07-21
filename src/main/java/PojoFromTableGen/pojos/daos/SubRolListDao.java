package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.SubRolListDo;

public interface SubRolListDao {

	public void insert(SubRolListDo subRolListDo, Connection conn);

	public SubRolListDo retrieveById(long id, Connection conn);

}
