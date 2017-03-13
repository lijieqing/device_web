package com.kstech.dao.imp.conf;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kstech.dao.conf.QCItemMapper;
import com.kstech.model.QCItem;
import com.kstech.utils.MybatisUtils;

public class QCItemDao implements QCItemMapper {
	private static String QCIMapper = "com.kstech.dao.QCItemMapper.";
	private SqlSessionFactory factory;
	private SqlSession session;
	
	public QCItemDao() {
		factory = MybatisUtils.getSqlSessionFactory();
		session = factory.openSession(true);
	}

	public int deleteByPrimaryKey(Integer qcId) {
		// TODO Auto-generated method stub
		String statement = QCIMapper+"deleteByPrimaryKey";
		int i = session.delete(statement, qcId);
		return i;
	}

	public int insert(QCItem record) {
		// TODO Auto-generated method stub
		String statement = QCIMapper+"insert";
		int i = session.insert(statement,record);
		return i;
	}

	public int insertSelective(QCItem record) {
		// TODO Auto-generated method stub
		String statement = QCIMapper+"insertSelective";
		int i = session.insert(statement,record);
		return i;
	}

	public QCItem selectByPrimaryKey(Integer qcId) {
		// TODO Auto-generated method stub
		String statement = QCIMapper+"selectByPrimaryKey";
		return session.selectOne(statement, qcId);
	}

	public int updateByPrimaryKeySelective(QCItem record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(QCItem record) {
		// TODO Auto-generated method stub
		return 0;
	}
	public List<QCItem> selectByDevice(String values) {
		// TODO Auto-generated method stub
		String statement = QCIMapper+"selectByDevice";
		session.selectList(statement, values);
		return session.selectList(statement, values);
	}

}
