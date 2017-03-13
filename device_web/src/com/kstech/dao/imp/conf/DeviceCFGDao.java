package com.kstech.dao.imp.conf;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kstech.dao.conf.DeviceCFGMapper;
import com.kstech.model.DeviceCFG;
import com.kstech.utils.MybatisUtils;

public class DeviceCFGDao implements DeviceCFGMapper {
	private static String DeviceCFGMapper = "com.kstech.dao.DeviceCFGMapper.";
	private SqlSessionFactory factory;
	private SqlSession session;

	public DeviceCFGDao() {
		super();
		factory = MybatisUtils.getSqlSessionFactory();
		session = factory.openSession(true);
	}

	public int deleteByPrimaryKey(Integer deviceId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(DeviceCFG record) {
		// TODO Auto-generated method stub
		String statement = DeviceCFGMapper+"insert";
		int i = session.insert(statement,record);
		return i;
	}

	public int insertSelective(DeviceCFG record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<DeviceCFG> getAllDevices() {
		// TODO Auto-generated method stub
		String statement = DeviceCFGMapper+"selectAll";
		List<DeviceCFG> list = session.selectList(statement);
		return list;
	}
	public DeviceCFG selectByDeviceNum(String deviceNum) {
		// TODO Auto-generated method stub
		String statement = DeviceCFGMapper+"selectByDeviceNum";
		DeviceCFG resu = session.selectOne(statement, deviceNum);
		return resu;
	}

	public int updateByPrimaryKeySelective(DeviceCFG record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(DeviceCFG record) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int updateByDevice(DeviceCFG record){
		String statement = DeviceCFGMapper+"updateByDeviceNum";
		int i = session.update(statement,record);
		return i;
	}

	public DeviceCFG selectByPrimaryKey(Integer deviceId) {
		// TODO Auto-generated method stub
		return null;
	}

}
