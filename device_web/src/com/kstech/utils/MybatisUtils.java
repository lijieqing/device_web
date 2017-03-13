package com.kstech.utils;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSession;

public class MybatisUtils {

	public static SqlSessionFactory getSqlSessionFactory(){
		String resource = "conf.xml"; 
		//����mybatis�������ļ�����Ҳ���ع�����ӳ���ļ���
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//����sqlSession�Ĺ���
		SqlSessionFactory sessionFactory = null;
		if(reader != null){
			//����sqlSession�Ĺ���
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		}
		return sessionFactory;
	}
	
	public static SqlSession getSession(){
		String resource = "conf.xml"; 
		//����mybatis�������ļ�����Ҳ���ع�����ӳ���ļ���
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//����sqlSession�Ĺ���
		SqlSessionFactory sessionFactory = null;
		if(reader != null){
			//����sqlSession�Ĺ���
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		}
		return sessionFactory.openSession(true);
	}
	
}
