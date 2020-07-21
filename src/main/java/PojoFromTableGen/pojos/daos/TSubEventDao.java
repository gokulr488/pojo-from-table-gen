package PojoFromTableGen.pojos.daos;

import java.sql.Connection;
import java.util.List;

import PojoFromTableGen.pojos.dos.TSubEventDo;

public interface TSubEventDao {

	public void insert(TSubEventDo tSubEventDo, Connection conn) throws Exception;

	public void insert(List<TSubEventDo> tSubEventDos, Connection conn);

	public TSubEventDo retrieveById(long id, Connection conn);

}
