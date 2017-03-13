package com.kstech.dao.conf;

import com.kstech.model.RealTime;

public interface RealTimeMapper {
    int deleteByPrimaryKey(Integer realtimeId);

    int insert(RealTime record);

    int insertSelective(RealTime record);

    RealTime selectByPrimaryKey(Integer realtimeId);

    int updateByPrimaryKeySelective(RealTime record);

    int updateByPrimaryKey(RealTime record);
}