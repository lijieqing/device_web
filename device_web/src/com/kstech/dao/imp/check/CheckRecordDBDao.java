package com.kstech.dao.imp.check;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kstech.dao.check.CheckRecordDBMapper;
import com.kstech.model.CheckRecordDB;
import com.kstech.utils.MybatisUtils;

public class CheckRecordDBDao implements CheckRecordDBMapper {
	private static String CheckRecordDBMapper = "com.kstech.dao.CheckRecordDBMapper.";
	
	private SqlSessionFactory factory;
	private SqlSession session;

	public CheckRecordDBDao() {
		super();
		factory = MybatisUtils.getSqlSessionFactory();
		session = factory.openSession(true);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer excId) {
		// TODO Auto-generated method stub
		String statement = CheckRecordDBMapper+"deleteByPrimaryKey";
		int i = session.delete(statement, excId);
		return i;
	}

	@Override
	public int insert(CheckRecordDB record) {
		// TODO Auto-generated method stub
		String statement = CheckRecordDBMapper + "insert";
		int i = session.insert(statement, record);
		return i;
	}

	@Override
	public int insertSelective(CheckRecordDB record) {
		// TODO Auto-generated method stub
		String statement = CheckRecordDBMapper + "insertSelective";
		int i = session.insert(statement, record);
		return i;
	}

	@Override
	public CheckRecordDB selectByPrimaryKey(Integer excId) {
		// TODO Auto-generated method stub
		String statement = CheckRecordDBMapper + "selectByPrimaryKey";
		CheckRecordDB result = session.selectOne(statement,excId);
		return result;
	}

	@Override
	public int updateByPrimaryKeySelective(CheckRecordDB record) {
		// TODO Auto-generated method stub
		String statement = CheckRecordDBMapper + "updateByPrimaryKeySelective";
		int i = session.update(statement, record);
		return i;
	}

	@Override
	public int updateByPrimaryKey(CheckRecordDB record) {
		// TODO Auto-generated method stub
		String statement = CheckRecordDBMapper + "updateByPrimaryKey";
		int i = session.update(statement, record);
		return i;
	}

}
