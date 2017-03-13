package com.kstech.dao.conf;

import java.util.List;

import com.kstech.model.Msg;

public interface msgMapper {
    int deleteByPrimaryKey(Integer msgId);

    int insert(Msg record);

    int insertSelective(Msg record);

    Msg selectByPrimaryKey(Integer msgId);

    int updateByPrimaryKeySelective(Msg record);

    int updateByPrimaryKey(Msg record);
    List<Msg> getALL();
}