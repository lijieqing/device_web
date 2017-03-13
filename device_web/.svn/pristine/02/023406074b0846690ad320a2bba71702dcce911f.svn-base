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
		//加载mybatis的配置文件（它也加载关联的映射文件）
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//构建sqlSession的工厂
		SqlSessionFactory sessionFactory = null;
		if(reader != null){
			//构建sqlSession的工厂
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		}
		return sessionFactory;
	}
	
	public static SqlSession getSession(){
		String resource = "conf.xml"; 
		//加载mybatis的配置文件（它也加载关联的映射文件）
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//构建sqlSession的工厂
		SqlSessionFactory sessionFactory = null;
		if(reader != null){
			//构建sqlSession的工厂
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		}
		return sessionFactory.openSession(true);
	}
	
}
