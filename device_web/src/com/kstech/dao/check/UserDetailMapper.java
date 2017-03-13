package com.kstech.dao.check;

import com.kstech.model.UserDetail;

public interface UserDetailMapper {
    int deleteByPrimaryKey(Integer userdetailId);

    int insert(UserDetail record);

    int insertSelective(UserDetail record);

    UserDetail selectByPrimaryKey(Integer userdetailId);

    int updateByPrimaryKeySelective(UserDetail record);

    int updateByPrimaryKey(UserDetail record);
}