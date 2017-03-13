package com.kstech.dao.imp.conf;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kstech.dao.conf.DSItemMapper;
import com.kstech.model.DSItem;
import com.kstech.utils.MybatisUtils;

public class DsItemDao implements DSItemMapper {
	private static String DSIMapper = "com.kstech.dao.DSItemMapper.";
	private SqlSessionFactory factory;
	private SqlSession session;
	public DsItemDao() {
		factory = MybatisUtils.getSqlSessionFactory();
		session = factory.openSession(true);
	}
	public int deleteByPrimaryKey(Integer dsitemId) {
		// TODO Auto-generated method stub
		String statement = DSIMapper+"deleteByPrimaryKey";
		int i = session.delete(statement, dsitemId);
		return i;
	}
	public int insert(DSItem record) {
		String statement = DSIMapper+"insert";
		int i = session.insert(statement, record);
		return i;
	}
	public int insertSelective(DSItem record) {
		// TODO Auto-generated method stub
		String statement = DSIMapper+"insertSelective";
		int i = session.insert(statement, record);
		return i;
	}
	public DSItem selectByPrimaryKey(Integer dsitemId) {
		// TODO Auto-generated method stub
		String statement = DSIMapper+"selectByPrimaryKey";
		return session.selectOne(statement, dsitemId);
	}
	public int updateByPrimaryKeySelective(DSItem record) {
		// TODO Auto-generated method stub
		String statement = DSIMapper+"updateByPrimaryKeySelective";
		int i = session.update(statement, record);
		return i;
	}
	public int updateByPrimaryKey(DSItem record) {
		// TODO Auto-generated method stub
		String statement = DSIMapper+"updateByPrimaryKey";
		int i = session.update(statement, record);
		return i;
	}
	public List<DSItem> selectByIDs(List<Integer> values) {
		// TODO Auto-generated method stub
		String statement = DSIMapper+"findByIdsMap";
		session.selectList(statement, values);
		return session.selectList(statement, values);
	}
	
	public List<DSItem> selectByDevice(String values) {
		// TODO Auto-generated method stub
		String statement = DSIMapper+"selectByDevice";
		session.selectList(statement, values);
		return session.selectList(statement, values);
	}
}
