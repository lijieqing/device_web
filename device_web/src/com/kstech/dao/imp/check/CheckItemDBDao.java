package com.kstech.dao.imp.check;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kstech.dao.check.CheckItemDBMapper;
import com.kstech.model.CheckItemDB;
import com.kstech.utils.MybatisUtils;

public class CheckItemDBDao implements CheckItemDBMapper {
	private static String CheckItemDBMapper = "com.kstech.dao.CheckItemDBMapper.";
	
	private SqlSessionFactory factory;
	private SqlSession session;

	public CheckItemDBDao() {
		super();
		factory = MybatisUtils.getSqlSessionFactory();
		session = factory.openSession(true);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer itemId) {
		// TODO Auto-generated method stub
		String statement = CheckItemDBMapper+"deleteByPrimaryKey";
		int i = session.delete(statement, itemId);
		return i;
	}

	@Override
	public int insert(CheckItemDB record) {
		// TODO Auto-generated method stub
		String statement = CheckItemDBMapper + "insert";
		int i = session.insert(statement, record);
		return i;
	}

	@Override
	public int insertSelective(CheckItemDB record) {
		// TODO Auto-generated method stub
		String statement = CheckItemDBMapper + "insertSelective";
		int i = session.insert(statement, record);
		return i;
	}

	@Override
	public CheckItemDB selectByPrimaryKey(Integer itemId) {
		// TODO Auto-generated method stub
		String statement = CheckItemDBMapper + "selectByPrimaryKey";
		CheckItemDB result = session.selectOne(statement, itemId);
		return result;
	}

	@Override
	public int updateByPrimaryKeySelective(CheckItemDB record) {
		// TODO Auto-generated method stub
		String statement = CheckItemDBMapper + "updateByPrimaryKeySelective";
		int i = session.update(statement,record);
		return i;
	}

	@Override
	public int updateByPrimaryKey(CheckItemDB record) {
		// TODO Auto-generated method stub
		String statement = CheckItemDBMapper + "updateByPrimaryKey";
		int i = session.update(statement, record);
		return i;
	}

}
