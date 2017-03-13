package com.kstech.dao.conf;

import com.kstech.model.DeviceCFG;

public interface DeviceCFGMapper {
    int deleteByPrimaryKey(Integer deviceId);

    int insert(DeviceCFG record);

    int insertSelective(DeviceCFG record);

    DeviceCFG selectByPrimaryKey(Integer deviceId);

    int updateByPrimaryKeySelective(DeviceCFG record);

    int updateByPrimaryKey(DeviceCFG record);
}