package com.cly.mgzf.dao;

import com.cly.mgzf.enity.HotArea;

public interface HotAreaMapper {
    int deleteByPrimaryKey(Integer haId);

    int insert(HotArea record);

    int insertSelective(HotArea record);

    HotArea selectByPrimaryKey(Integer haId);

    int updateByPrimaryKeySelective(HotArea record);

    int updateByPrimaryKey(HotArea record);
}