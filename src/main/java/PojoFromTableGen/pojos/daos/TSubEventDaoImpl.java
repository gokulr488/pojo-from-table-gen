package PojoFromTableGen.pojos.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import PojoFromTableGen.pojos.dos.EvnAtrListDo;
import PojoFromTableGen.pojos.dos.SubAtrListDo;
import PojoFromTableGen.pojos.dos.SubCllListDo;
import PojoFromTableGen.pojos.dos.SubCtgListDo;
import PojoFromTableGen.pojos.dos.SubSrvListDo;
import PojoFromTableGen.pojos.dos.TSubEventDo;

public class TSubEventDaoImpl implements TSubEventDao {

	static final String sql = "INSERT INTO T_SUB_EVENT(EVENT_TYPE,BUS_EVENT_TYPE,EVENT_SEQ,REQUEST_SEQ,EVENT_DATE,ICAP_ID,CUSTOMER_ID,ICAP_EVENT_SEQ,REF_NO) "
			+ "VALUES(?,?,?,?,?,?,?,?,?)";

	@Override
	public void insert(TSubEventDo tSubEventDo, Connection conn) throws Exception {

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			System.out.println("Executing Query " + sql);
			setStatement(stmt, tSubEventDo);

			stmt.addBatch();
			// conn.commit();
		} catch (Exception e) {
			throw (e);
		}

	}

	public void persist() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		SubDtlListDao subDtlListDao = new SubDtlListDaoImpl();
		subDtlListDao.insert(tSubEventDo.getSubDtlListDos(),conn);

	}

	private void setStatement(PreparedStatement stmt, TSubEventDo tSubEventDo) throws SQLException {
		stmt.setString(1, tSubEventDo.getEventType());
		stmt.setString(2, tSubEventDo.getBusEventType());
		stmt.setLong(3, tSubEventDo.getEventSeq());
		stmt.setLong(4, tSubEventDo.getRequestSeq());
		stmt.setDate(5, tSubEventDo.getEventDate());
		stmt.setLong(6, tSubEventDo.getIcapId());
		stmt.setString(7, tSubEventDo.getCustomerId());
		stmt.setLong(8, tSubEventDo.getIcapEventSeq());
		stmt.setString(9, tSubEventDo.getRefNo());
		System.out.println("Persisting " + stmt.toString());
		stmt.execute();
	}

	@Override
	public TSubEventDo retrieveById(long id, Connection conn) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EvnAtrListDo> getEvnAtrListDos() {
		return evnAtrListDos;
	}

	public void setEvnAtrListDos(List<EvnAtrListDo> evnAtrListDos) {
		this.evnAtrListDos = evnAtrListDos;
	}

	public List<SubAtrListDo> getSubAtrListDos() {
		return subAtrListDos;
	}

	public void setSubAtrListDos(List<SubAtrListDo> subAtrListDos) {
		this.subAtrListDos = subAtrListDos;
	}

	public List<SubCtgListDo> getSubCtgListDos() {
		return subCtgListDos;
	}

	public void setSubCtgListDos(List<SubCtgListDo> subCtgListDos) {
		this.subCtgListDos = subCtgListDos;
	}

	public List<SubSrvListDo> getSubSrvListDos() {
		return subSrvListDos;
	}

	public void setSubSrvListDos(List<SubSrvListDo> subSrvListDos) {
		this.subSrvListDos = subSrvListDos;
	}

	public List<SubCllListDo> getSubCllListDos() {
		return subCllListDos;
	}

	public void setSubCllListDos(List<SubCllListDo> subCllListDos) {
		this.subCllListDos = subCllListDos;
	}

	@Override
	public void insert(List<TSubEventDo> tSubEventDos, Connection conn) {
		// TODO Auto-generated method stub

	}

}
