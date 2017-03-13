package com.kstech.dao.imp.check;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kstech.dao.check.UserMapper;
import com.kstech.model.User;
import com.kstech.model.UserDetail;
import com.kstech.utils.MybatisUtils;

public class UserDao implements UserMapper {
	private static String UserMapper = "com.kstech.dao.UserMapper.";
	private SqlSessionFactory factory;
	private SqlSession session;

	public UserDao() {
		super();
		factory = MybatisUtils.getSqlSessionFactory();
		session = factory.openSession(true);
	}

	@Override
	public int deleteByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		String statement = UserMapper+"deleteByPrimaryKey";
		int i = session.delete(statement, userId);
		return i;
	}

	//user table insert 
	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		String statement = UserMapper+"insert";
		int i= session.insert(statement, record);
		//if user table insert successfully insert user detail table  
		if(i>0){
			//insert  table user detail
			UserDetailDao userDetailDao = new UserDetailDao();
			String usercode = record.getUserCode();
			UserDetail userDetail = new UserDetail(usercode, new Date(), "god");
			userDetailDao.insert(userDetail);
		}
		return i;
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		String statement = UserMapper+"insertSelective";
		int i= session.insert(statement, record);
		return i;
	}

	@Override
	public User selectByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		String statement = UserMapper+"selectByPrimaryKey";
		User user = session.selectOne(statement, userId);
		return user;
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		String statement = UserMapper+"updateByPrimaryKeySelective";
		int i = session.update(statement, record);
		return i;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		String statement = UserMapper+"updateByPrimaryKey";
		int i = session.update(statement, record);
		return i;
	}

	@Override
	public User checkUserByNameAndPass(com.kstech.session.User user) {
		// TODO Auto-generated method stub
		String statement = UserMapper+"selectByNandP";
		User result = session.selectOne(statement, user);
		return result;
	}

}
