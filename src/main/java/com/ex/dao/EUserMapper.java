package com.ex.dao;

import com.ex.entity.EUser;

public interface EUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EUser record);

    int insertSelective(EUser record);

    EUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EUser record);

    int updateByPrimaryKey(EUser record);
}