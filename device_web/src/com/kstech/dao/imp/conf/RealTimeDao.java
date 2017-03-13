package com.kstech.dao.imp.conf;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kstech.dao.conf.RealTimeMapper;
import com.kstech.model.RealTime;
import com.kstech.utils.MybatisUtils;

public class RealTimeDao implements RealTimeMapper {
	private static String RealTimeMapper = "com.kstech.dao.RealTimeMapper.";
	private SqlSessionFactory factory;
	private SqlSession session;

	public RealTimeDao() {
		super();
		factory = MybatisUtils.getSqlSessionFactory();
		session = factory.openSession(true);
	}
	public int deleteByPrimaryKey(Integer realtimeId) {
		// TODO Auto-generated method stub
		String statement = RealTimeMapper+"deleteByPrimaryKey";
		int i = session.delete(statement, realtimeId);
		return i;
	}

	public int insert(RealTime record) {
		// TODO Auto-generated method stub
		String statement = RealTimeMapper+"insert";
		int i = session.insert(statement,record);
		return i;
	}

	public int insertSelective(RealTime record) {
		// TODO Auto-generated method stub
		String statement = RealTimeMapper+"insertSelective";
		int i = session.insert(statement,record);
		return i;
	}

	public RealTime selectByPrimaryKey(Integer realtimeId) {
		// TODO Auto-generated method stub
		String statement = RealTimeMapper+"selectByPrimaryKey";
		return session.selectOne(statement, realtimeId);		
	}

	public int updateByPrimaryKeySelective(RealTime record) {
		// TODO Auto-generated method stub
		String statement = RealTimeMapper+"updateByPrimaryKeySelective";
		int i = session.update(statement,record);
		return i;
	}

	public int updateByPrimaryKey(RealTime record) {
		// TODO Auto-generated method stub
		String statement = RealTimeMapper+"updateByPrimaryKey";
		int i = session.update(statement,record);
		return i;
	}
	
	public List<RealTime> selectByDevice(String values) {
		// TODO Auto-generated method stub
		String statement = RealTimeMapper+"selectByDevice";
		session.selectList(statement, values);
		return session.selectList(statement, values);
	}

}
