package com.cly.mgzf.dao;

import com.cly.mgzf.enity.HotBrand;

public interface HotBrandMapper {
    int deleteByPrimaryKey(Integer hbId);

    int insert(HotBrand record);

    int insertSelective(HotBrand record);

    HotBrand selectByPrimaryKey(Integer hbId);

    int updateByPrimaryKeySelective(HotBrand record);

    int updateByPrimaryKey(HotBrand record);
}