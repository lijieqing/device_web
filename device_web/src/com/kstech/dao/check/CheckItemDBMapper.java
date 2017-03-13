package com.kstech.dao.check;

import com.kstech.model.CheckItemDB;

public interface CheckItemDBMapper {
    int deleteByPrimaryKey(Integer itemId);

    int insert(CheckItemDB record);

    int insertSelective(CheckItemDB record);

    CheckItemDB selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(CheckItemDB record);

    int updateByPrimaryKey(CheckItemDB record);
}