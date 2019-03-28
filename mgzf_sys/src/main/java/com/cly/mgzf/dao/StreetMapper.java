package com.cly.mgzf.dao;

import com.cly.mgzf.enity.Street;

public interface StreetMapper {
    int deleteByPrimaryKey(Integer stId);

    int insert(Street record);

    int insertSelective(Street record);

    Street selectByPrimaryKey(Integer stId);

    int updateByPrimaryKeySelective(Street record);

    int updateByPrimaryKey(Street record);
}