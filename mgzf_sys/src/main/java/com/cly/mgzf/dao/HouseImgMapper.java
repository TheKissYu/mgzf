package com.cly.mgzf.dao;

import java.util.List;

import com.cly.mgzf.enity.HouseImg;

public interface HouseImgMapper {
    int deleteByPrimaryKey(Integer hiId);

    int insert(HouseImg record);

    int insertSelective(HouseImg record);

    HouseImg selectByPrimaryKey(Integer hiId);

    int updateByPrimaryKeySelective(HouseImg record);

    int updateByPrimaryKey(HouseImg record);
     
    List<String> selectByHouseId(int id);
}