package com.kstech.dao.conf;

import java.util.List;

import com.kstech.model.PGN;

public interface PGNMapper {
    int deleteByPrimaryKey(Integer pgnId);

    int insert(PGN record);

    int insertSelective(PGN record);

    PGN selectByPrimaryKey(Integer pgnId);

    int updateByPrimaryKeySelective(PGN record);

    int updateByPrimaryKey(PGN record);
    
    List<PGN> selectByDevice(String deviceNum);
}