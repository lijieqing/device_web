package com.kstech.dao.imp.conf;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.kstech.model.PGN;
import com.kstech.utils.MybatisUtils;

public class PGNDao implements com.kstech.dao.conf.PGNMapper{
	private static String PGNMapper = "com.kstech.dao.PGNMapper.";
	private SqlSessionFactory factory;
	private SqlSession session;
	public PGNDao() {
		factory = MybatisUtils.getSqlSessionFactory();
		session = factory.openSession(true);
	}
	
	public List<PGN> selectByIDs(List<Integer> list){
		String statement = PGNMapper+"findByIdsMap";
		List<PGN> res = session.selectList(statement, list);
		return res;
	}
	
	public int deleteByPrimaryKey(Integer pgnId) {
		// TODO Auto-generated method stub
		String statement = PGNMapper+"deleteByPrimaryKey";
		return session.delete(statement, pgnId);
	}
	public int insert(PGN record) {
		// TODO Auto-generated method stub
		String statement = PGNMapper+"insert";
		int i = session.insert(statement,record);
		return i;
	}
	public int insertSelective(PGN record) {
		// TODO Auto-generated method stub
		String statement = PGNMapper+"insertSelective";
		int i = session.insert(statement,record);
		return i;
	}
	public PGN selectByPrimaryKey(Integer pgnId) {
		// TODO Auto-generated method stub
		String statement = PGNMapper+"selectByPrimaryKey";
		return session.selectOne(statement, pgnId);	
	}
	public int updateByPrimaryKeySelective(PGN record) {
		// TODO Auto-generated method stub
		String statement = PGNMapper+"updateByPrimaryKeySelective";
		return session.update(statement, record);	
	}
	public int updateByPrimaryKey(PGN record) {
		// TODO Auto-generated method stub
		String statement = PGNMapper+"updateByPrimaryKey";
		return session.update(statement, record);
	}
	public List<PGN> selectByDevice(String values) {
		// TODO Auto-generated method stub
		String statement = PGNMapper+"selectByDevice";
		session.selectList(statement, values);
		return session.selectList(statement, values);
	}
}
