package com.cly.mgzf.dao;

import com.cly.mgzf.enity.HouseConfig;

public interface HouseConfigMapper {
    int deleteByPrimaryKey(Integer hcId);

    int insert(HouseConfig record);

    int insertSelective(HouseConfig record);

    HouseConfig selectByPrimaryKey(Integer hcId);

    int updateByPrimaryKeySelective(HouseConfig record);

    int updateByPrimaryKey(HouseConfig record);
}