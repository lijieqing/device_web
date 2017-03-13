package com.kstech.dao.check;

import com.kstech.model.User;
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    User checkUserByNameAndPass(com.kstech.session.User user);
}