package com.kstech.dao.check;

import com.kstech.model.CheckRecordDB;

public interface CheckRecordDBMapper {
    int deleteByPrimaryKey(Integer excId);

    int insert(CheckRecordDB record);

    int insertSelective(CheckRecordDB record);

    CheckRecordDB selectByPrimaryKey(Integer excId);

    int updateByPrimaryKeySelective(CheckRecordDB record);

    int updateByPrimaryKey(CheckRecordDB record);
}