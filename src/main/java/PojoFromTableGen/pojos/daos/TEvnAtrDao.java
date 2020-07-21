package PojoFromTableGen.pojos.daos;

import java.sql.Connection;

import PojoFromTableGen.pojos.dos.TEvnAtrDo;

public interface TEvnAtrDao {

	public void insert(TEvnAtrDo tEvnAtrDo, Connection conn);

	public TEvnAtrDo retrieveById(long id, Connection conn);

}
