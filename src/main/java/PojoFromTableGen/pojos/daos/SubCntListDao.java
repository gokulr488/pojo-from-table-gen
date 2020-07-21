package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.SubCntListDo;

public interface SubCntListDao {

	public void insert(SubCntListDo subCntListDo, Connection conn);

	public SubCntListDo retrieveById(long id, Connection conn);

}
