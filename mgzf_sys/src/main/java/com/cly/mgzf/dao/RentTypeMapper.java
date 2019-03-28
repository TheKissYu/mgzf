package com.cly.mgzf.dao;

import java.util.List;

import com.cly.mgzf.enity.RentType;

public interface RentTypeMapper {
    int deleteByPrimaryKey(Integer rtId);

    int insert(RentType record);

    int insertSelective(RentType record);

    RentType selectByPrimaryKey(Integer rtId);

    int updateByPrimaryKeySelective(RentType record);

    int updateByPrimaryKey(RentType record);
    
    List<RentType> selectAll();
}