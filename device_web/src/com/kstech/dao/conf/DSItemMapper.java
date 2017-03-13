package com.kstech.dao.conf;

import com.kstech.model.DSItem;

public interface DSItemMapper {
    int deleteByPrimaryKey(Integer dsitemId);

    int insert(DSItem record);

    int insertSelective(DSItem record);

    DSItem selectByPrimaryKey(Integer dsitemId);

    int updateByPrimaryKeySelective(DSItem record);

    int updateByPrimaryKey(DSItem record);
}