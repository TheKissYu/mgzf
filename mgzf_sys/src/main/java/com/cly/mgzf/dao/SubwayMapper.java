package com.cly.mgzf.dao;

import com.cly.mgzf.enity.Subway;

public interface SubwayMapper {
    int deleteByPrimaryKey(Integer sbId);

    int insert(Subway record);

    int insertSelective(Subway record);

    Subway selectByPrimaryKey(Integer sbId);

    int updateByPrimaryKeySelective(Subway record);

    int updateByPrimaryKey(Subway record);
}