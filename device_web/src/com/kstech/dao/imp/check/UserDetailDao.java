package com.kstech.dao.imp.check;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kstech.dao.check.UserDetailMapper;
import com.kstech.model.UserDetail;
import com.kstech.utils.MybatisUtils;

public class UserDetailDao implements UserDetailMapper {
	private static String UserDetailMapper = "com.kstech.dao.UserDetailMapper.";
	
	private SqlSessionFactory factory;
	private SqlSession session;

	public UserDetailDao() {
		super();
		factory = MybatisUtils.getSqlSessionFactory();
		session = factory.openSession(true);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer userdetailId) {
		// TODO Auto-generated method stub
		String statement = UserDetailMapper + "deleteByPrimaryKey";
		int i = session.delete(statement, userdetailId);
		return i;
	}

	@Override
	public int insert(UserDetail record) {
		// TODO Auto-generated method stub
		String statement = UserDetailMapper+"insert";
		int i = session.insert(statement, record);
		return i;
	}

	@Override
	public int insertSelective(UserDetail record) {
		// TODO Auto-generated method stub
		String statement = UserDetailMapper+"insertSelective";
		int i = session.insert(statement, record);
		return i;
	}

	@Override
	public UserDetail selectByPrimaryKey(Integer userdetailId) {
		// TODO Auto-generated method stub
		String statement = UserDetailMapper+"selectByPrimaryKey";
		UserDetail result = session.selectOne(statement, userdetailId);
		return result;
	}

	@Override
	public int updateByPrimaryKeySelective(UserDetail record) {
		// TODO Auto-generated method stub
		String statement = UserDetailMapper+"updateByPrimaryKeySelective";
		int i = session.update(statement, record);
		return i;
	}

	@Override
	public int updateByPrimaryKey(UserDetail record) {
		// TODO Auto-generated method stub
		String statement = UserDetailMapper+"updateByPrimaryKey";
		int i = session.update(statement, record);
		return i;
	}

}
