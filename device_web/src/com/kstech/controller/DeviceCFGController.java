package com.kstech.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kstech.dao.imp.conf.DeviceCFGDao;
import com.kstech.dao.imp.conf.DsItemDao;
import com.kstech.dao.imp.conf.MSGDao;
import com.kstech.dao.imp.conf.PGNDao;
import com.kstech.dao.imp.conf.QCItemDao;
import com.kstech.dao.imp.conf.RealTimeDao;
import com.kstech.dao.imp.conf.SPNDao;
import com.kstech.model.DSItem;
import com.kstech.model.DeviceCFG;
import com.kstech.model.Msg;
import com.kstech.model.PGN;
import com.kstech.model.QCItem;
import com.kstech.model.RealTime;
import com.kstech.model.SPN;
import com.kstech.session.Device;
import com.kstech.utils.JsonUtils;
/**
 * 
 * @author lijie
 *
 */
@Controller
@RequestMapping("/device")
public class DeviceCFGController {
	/**
	 * 机型配置信息数据库的获取 DEMO
	 * @return
	 */
	
	@ResponseBody
	@RequestMapping("/getDevice")
	public Device getDevice(){
		Device d = initDevice();
		return d;
	}
	

	@ResponseBody
	@RequestMapping("/dsitem")
	public List<DSItem> test(){
		DeviceCFGDao deviceCFGDao = new DeviceCFGDao();
		DsItemDao dsItemDao = new DsItemDao();
		DeviceCFG deviceCFG = deviceCFGDao.selectByDeviceNum("kstech");
		
		String dsIDs = deviceCFG.getDsitemIdGroup();
		List<Integer> DSlist = JsonUtils.fromArrayJson(dsIDs, Integer.class);
		List<DSItem> dsitems = dsItemDao.selectByIDs(DSlist);
	
		return dsitems;
	}
	
	@ResponseBody
	@RequestMapping("/pgns")
	public List<PGN> PGNSTest(){
		PGNDao pgnDao = new PGNDao();
		SPNDao spnDao = new SPNDao();
		List<PGN> list = pgnDao.selectByDevice("kstech");
		for (PGN pgn : list) {
			List<SPN> splist = spnDao.selectByPGN(pgn.getPgnNum());
			String s = JsonUtils.toJson(splist);
			pgn.setPgnGroupSp(s);
		}
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/qcitems")
	public List<QCItem> QCItemTest(){
		QCItemDao qcItemDao = new QCItemDao();
		List<QCItem> list = qcItemDao.selectByDevice("kstech");
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/msgs")
	public List<Msg> MSGTest(){
		MSGDao msgDao = new MSGDao();
		List<Msg> list = msgDao.getALL();
		return list;
	}
	
	
	
	
	public Device initDevice(){
		/**
		 * 封装device 用于传输
		 */
		Device result = new Device();
		DeviceCFGDao deviceCFGDao = new DeviceCFGDao();
		DsItemDao dsItemDao = new DsItemDao();
		PGNDao pgnDao = new PGNDao();
		SPNDao spnDao = new SPNDao();
		QCItemDao qcItemDao = new QCItemDao();
		RealTimeDao realTimeDao = new RealTimeDao();
		MSGDao msgDao = new MSGDao();
		
		result.setDeviceNum("kstech");
		
		DeviceCFG deviceCFG = deviceCFGDao.selectByDeviceNum("kstech");
		String dsIDs = deviceCFG.getDsitemIdGroup();
		List<Integer> DSlist = JsonUtils.fromArrayJson(dsIDs, Integer.class);
		List<DSItem> dsitems = dsItemDao.selectByIDs(DSlist);
		String strdsitem = JsonUtils.toJson(dsitems);
		result.setDsItems(strdsitem);
		
		List<PGN> pglist = pgnDao.selectByDevice("kstech");
		for (PGN pgn : pglist) {
			List<SPN> splist = spnDao.selectByPGN(pgn.getPgnNum());
			String s = JsonUtils.toJson(splist);
			pgn.setPgnGroupSp(s);
		}
		String strPG = JsonUtils.toJson(pglist);
		result.setPgns(strPG);
		
		List<QCItem> QClist = qcItemDao.selectByDevice("kstech");
		String strQC = JsonUtils.toJson(QClist);
		result.setQcItems(strQC);
		
		List<Msg> msglist = msgDao.getALL();
		String  strMSG = JsonUtils.toJson(msglist);
		result.setMsgs(strMSG);
		
		List<RealTime> reallist = realTimeDao.selectByDevice("kstech");
		String strReal = JsonUtils.toJson(reallist);
		result.setRealTimes(strReal);
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}
