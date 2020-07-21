package PojoFromTableGen.pojos.daos;

import java.sql.Connection;
import java.util.List;

import PojoFromTableGen.pojos.dos.SubDtlListDo;

public interface SubDtlListDao {

	public SubDtlListDo insert(SubDtlListDo subDtlListDo, Connection conn);

	public List<SubDtlListDo> insert(List<SubDtlListDo> subDtlListDos, Connection conn);

	public SubDtlListDo retrieveById(long id, Connection conn);

}
