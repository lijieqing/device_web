package com.kstech.session;

import java.util.List;

import com.kstech.model.PGN;
import com.kstech.model.SPN;

public class Session_PGN {
    private Integer pgnId;

    private String deviceNum;

    private String pgnNum;

    private String pgnDir;

    private String pgnLen;

    private String pgnPrio;

    private String pgnRate;

    private String pgnReq;

    private String pgnReqcyc;

    private String pgnSa;

    private List<SPN> pgnGroupSp;

    private String pgnType;

    public Session_PGN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Session_PGN(PGN pgn,List<SPN> pgnGroupSp) {
		super();
		this.pgnId = null;
		this.deviceNum = pgn.getDeviceNum();
		this.pgnNum = pgn.getPgnNum();
		this.pgnDir = pgn.getPgnDir();
		this.pgnLen = pgn.getPgnLen();
		this.pgnPrio = pgn.getPgnPrio();
		this.pgnRate = pgn.getPgnRate();
		this.pgnReq = pgn.getPgnReq();
		this.pgnReqcyc = pgn.getPgnReqcyc();
		this.pgnSa = pgn.getPgnSa();
		this.pgnGroupSp = pgnGroupSp;
		this.pgnType = pgn.getPgnType();
	}

	public Integer getPgnId() {
        return pgnId;
    }

    public void setPgnId(Integer pgnId) {
        this.pgnId = pgnId;
    }

    public String getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum == null ? null : deviceNum.trim();
    }

    public String getPgnNum() {
        return pgnNum;
    }

    public void setPgnNum(String pgnNum) {
        this.pgnNum = pgnNum == null ? null : pgnNum.trim();
    }

    public String getPgnDir() {
        return pgnDir;
    }

    public void setPgnDir(String pgnDir) {
        this.pgnDir = pgnDir == null ? null : pgnDir.trim();
    }

    public String getPgnLen() {
        return pgnLen;
    }

    public void setPgnLen(String pgnLen) {
        this.pgnLen = pgnLen == null ? null : pgnLen.trim();
    }

    public String getPgnPrio() {
        return pgnPrio;
    }

    public void setPgnPrio(String pgnPrio) {
        this.pgnPrio = pgnPrio == null ? null : pgnPrio.trim();
    }

    public String getPgnRate() {
        return pgnRate;
    }

    public void setPgnRate(String pgnRate) {
        this.pgnRate = pgnRate == null ? null : pgnRate.trim();
    }

    public String getPgnReq() {
        return pgnReq;
    }

    public void setPgnReq(String pgnReq) {
        this.pgnReq = pgnReq == null ? null : pgnReq.trim();
    }

    public String getPgnReqcyc() {
        return pgnReqcyc;
    }

    public void setPgnReqcyc(String pgnReqcyc) {
        this.pgnReqcyc = pgnReqcyc == null ? null : pgnReqcyc.trim();
    }

    public String getPgnSa() {
        return pgnSa;
    }

    public void setPgnSa(String pgnSa) {
        this.pgnSa = pgnSa == null ? null : pgnSa.trim();
    }

    public List<SPN> getPgnGroupSp() {
        return pgnGroupSp;
    }

    public void setPgnGroupSp(List<SPN> pgnGroupSp) {
        this.pgnGroupSp = pgnGroupSp;
    }

    public String getPgnType() {
        return pgnType;
    }

    public void setPgnType(String pgnType) {
        this.pgnType = pgnType == null ? null : pgnType.trim();
    }
}