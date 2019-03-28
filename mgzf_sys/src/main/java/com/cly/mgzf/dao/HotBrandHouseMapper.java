package com.cly.mgzf.dao;

import com.cly.mgzf.enity.HotBrandHouse;

public interface HotBrandHouseMapper {
    int deleteByPrimaryKey(Integer hhId);

    int insert(HotBrandHouse record);

    int insertSelective(HotBrandHouse record);

    HotBrandHouse selectByPrimaryKey(Integer hhId);

    int updateByPrimaryKeySelective(HotBrandHouse record);

    int updateByPrimaryKey(HotBrandHouse record);
}