package com.kstech.dao.conf;

import com.kstech.model.QCItem;

public interface QCItemMapper {
    int deleteByPrimaryKey(Integer qcId);

    int insert(QCItem record);

    int insertSelective(QCItem record);

    QCItem selectByPrimaryKey(Integer qcId);

    int updateByPrimaryKeySelective(QCItem record);

    int updateByPrimaryKey(QCItem record);
}