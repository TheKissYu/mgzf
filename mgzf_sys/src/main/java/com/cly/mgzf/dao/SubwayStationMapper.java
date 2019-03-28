package com.cly.mgzf.dao;

import com.cly.mgzf.enity.SubwayStation;

public interface SubwayStationMapper {
    int deleteByPrimaryKey(Integer sbsId);

    int insert(SubwayStation record);

    int insertSelective(SubwayStation record);

    SubwayStation selectByPrimaryKey(Integer sbsId);

    int updateByPrimaryKeySelective(SubwayStation record);

    int updateByPrimaryKey(SubwayStation record);
}