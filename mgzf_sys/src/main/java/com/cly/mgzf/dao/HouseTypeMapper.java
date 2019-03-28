package com.cly.mgzf.dao;

import java.util.List;

import com.cly.mgzf.enity.HouseType;

public interface HouseTypeMapper {
    int deleteByPrimaryKey(Integer htId);

    int insert(HouseType record);

    int insertSelective(HouseType record);

    HouseType selectByPrimaryKey(Integer htId);

    int updateByPrimaryKeySelective(HouseType record);

    int updateByPrimaryKey(HouseType record);
    
    List<HouseType> selectAll();
}