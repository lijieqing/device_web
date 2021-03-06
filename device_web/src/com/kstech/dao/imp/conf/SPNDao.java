package com.kstech.dao.imp.conf;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kstech.dao.conf.SPNMapper;
import com.kstech.model.SPN;
import com.kstech.utils.MybatisUtils;

public class SPNDao implements SPNMapper{
	
	private static String SPNMapper = "com.kstech.dao.SPNMapper.";
	private SqlSessionFactory factory;
	private SqlSession session;

	public SPNDao() {
		factory = MybatisUtils.getSqlSessionFactory();
		session = factory.openSession(true);
	}

	public int deleteByPrimaryKey(Integer spId) {
		// TODO Auto-generated method stub
		String statement = SPNMapper+"deleteByPrimaryKey";
		int i =session.insert(statement,spId);
		return i;
	}

	public int insert(SPN record) {
		// TODO Auto-generated method stub
		String statement = SPNMapper+"insert";
		int i =session.insert(statement,record);
		return i;
	}

	public int insertSelective(SPN record) {
		// TODO Auto-generated method stub
		String statement = SPNMapper+"insertSelective";
		int i =session.insert(statement,record);
		return i;
	}

	public SPN selectByPrimaryKey(Integer spId) {
		// TODO Auto-generated method stub
		String statement = SPNMapper+"selectByPrimaryKey";
		return session.selectOne(statement, spId);
	}
	public int updateByRefNameSelective(SPN record){
		String statement = SPNMapper+"updateByRefNameSelective";
		int i = session.update(statement,record);
		return i;
	}
	public int updateByPrimaryKeySelective(SPN record) {
		// TODO Auto-generated method stub
		String statement = SPNMapper+"updateByPrimaryKeySelective";
		int i = session.update(statement,record);
		return i;
	}

	public int updateByPrimaryKey(SPN record) {
		// TODO Auto-generated method stub
		String statement = SPNMapper+"updateByPrimaryKey";
		int i = session.update(statement,record);
		return i;
	}

	@Override
	public List<SPN> selectByPGN(String pgNum) {
		// TODO Auto-generated method stub
		String statement = SPNMapper+"selectByPGN";
		List<SPN> list = session.selectList(statement, pgNum);
		return list;
	}
	
}
