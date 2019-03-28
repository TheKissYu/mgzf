package com.cly.mgzf.dao;

import java.util.List;

import com.cly.mgzf.enity.Area;

public interface AreaMapper {
    int deleteByPrimaryKey(Integer arId);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer arId);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
    
    List<Area> selectByArCtId(Integer arCtId);
}