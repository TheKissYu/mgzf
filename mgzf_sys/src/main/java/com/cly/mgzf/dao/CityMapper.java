package com.cly.mgzf.dao;

import java.util.List;

import com.cly.mgzf.enity.City;

public interface CityMapper {
    int deleteByPrimaryKey(Integer ctId);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer ctId);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
    /**
     * 获取所有的城市的属性
     * @return
     * 包含所有的city的List
     */
    List<City> selectAll();
    
    
}