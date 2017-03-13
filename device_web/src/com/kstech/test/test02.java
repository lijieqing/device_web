package com.kstech.test;

import java.util.Date;
import java.util.List;

import javafx.scene.layout.Priority;

import org.junit.Test;

import com.kstech.dao.imp.check.UserDao;
import com.kstech.dao.imp.check.UserDetailDao;
import com.kstech.dao.imp.conf.DeviceCFGDao;
import com.kstech.dao.imp.conf.DsItemDao;
import com.kstech.model.DSItem;
import com.kstech.model.DeviceCFG;
import com.kstech.model.USERROLE;
import com.kstech.model.User;
import com.kstech.model.UserDetail;
import com.kstech.utils.JsonUtils;

public class test02 {
	
	@Test
	public void getDevice_CFG_Detail(){
		DeviceCFGDao deviceCFGDao = new DeviceCFGDao();
		DeviceCFG deviceCFG = deviceCFGDao.selectByDeviceNum("kstech");
		System.out.println(deviceCFG.getDeviceRealtime());
	}
	@Test
	public void ToJsonTest(){
		DeviceCFGDao deviceCFGDao = new DeviceCFGDao();
		DsItemDao dsItemDao = new DsItemDao();
		DeviceCFG deviceCFG = deviceCFGDao.selectByDeviceNum("kstech");
		
		String dsIDs = deviceCFG.getDsitemIdGroup();
		List<Integer> DSlist = JsonUtils.fromArrayJson(dsIDs, Integer.class);
		List<DSItem> dsitems = dsItemDao.selectByIDs(DSlist);
		String s = JsonUtils.toJson(dsitems);
		System.out.println(s);
	}
	@Test
	public void TestAddUser(){
		UserDao userDao = new UserDao();
		User user = new User("checker02","000002","111111",USERROLE.CHECKER.getCode());
		userDao.insert(user);
	}
	
	@Test
	public void TestUserDetailInsert(){
		UserDetailDao userDetailDao = new UserDetailDao();
		UserDetail userDetail = new UserDetail("000000", new Date(), "god");
		userDetailDao.insert(userDetail);
	}
	@Test
	public void TestLogin(){
		UserDao userDao = new UserDao();
		com.kstech.session.User user = new com.kstech.session.User();
		user.setUserName("admin");
		user.setPass("admin");
		User res = userDao.checkUserByNameAndPass(user);
		System.out.println(res);
	}
}
