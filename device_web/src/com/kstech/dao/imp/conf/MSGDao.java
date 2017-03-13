package com.kstech.dao.imp.conf;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kstech.dao.conf.msgMapper;
import com.kstech.model.Msg;
import com.kstech.utils.MybatisUtils;

public class MSGDao implements msgMapper{
	
	private static String STRMapper = "com.kstech.dao.msgMapper.";
	private SqlSessionFactory factory;
	private SqlSession session;

	public MSGDao() {
		factory = MybatisUtils.getSqlSessionFactory();
		session = factory.openSession(true);
	}

	public int deleteByPrimaryKey(Integer msgId) {
		// TODO Auto-generated method stub
		String statement = STRMapper+"deleteByPrimaryKey";
		int i = session.insert(statement,msgId);
		return i;
	}

	public int insert(Msg record) {
		// TODO Auto-generated method stub
		String statement = STRMapper+"insert";
		int i = session.insert(statement,record);
		return i;
	}

	public int insertSelective(Msg record) {
		// TODO Auto-generated method stub
		String statement = STRMapper+"insertSelective";
		int i = session.insert(statement,record);
		return i;
	}

	public Msg selectByPrimaryKey(Integer msgId) {
		// TODO Auto-generated method stub
		String statement = STRMapper+"selectByPrimaryKey";
		Msg m = session.selectOne(statement,msgId);
		return m;
	}

	public int updateByPrimaryKeySelective(Msg record) {
		// TODO Auto-generated method stub
		String statement = STRMapper+"updateByPrimaryKeySelective";
		return session.update(statement, record);
	}

	public int updateByPrimaryKey(Msg record) {
		// TODO Auto-generated method stub
		String statement = STRMapper+"updateByPrimaryKey";
		return session.update(statement, record);
	}

	@Override
	public List<Msg> getALL() {
		// TODO Auto-generated method stub
		String statement = STRMapper+"selectALL";
		List<Msg> list = session.selectList(statement);
		return list;
	} 

}
