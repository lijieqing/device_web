package com.kstech.dao.conf;

import java.util.List;

import com.kstech.model.SPN;

public interface SPNMapper {
    int deleteByPrimaryKey(Integer spId);

    int insert(SPN record);

    int insertSelective(SPN record);

    SPN selectByPrimaryKey(Integer spId);

    int updateByPrimaryKeySelective(SPN record);

    int updateByPrimaryKey(SPN record);
    
    List<SPN> selectByPGN(String pgNum);
}