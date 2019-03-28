package com.cly.mgzf.dao;

import com.cly.mgzf.enity.LinkMan;

public interface LinkManMapper {
    int deleteByPrimaryKey(Integer lkId);

    int insert(LinkMan record);

    int insertSelective(LinkMan record);

    LinkMan selectByPrimaryKey(Integer lkId);

    int updateByPrimaryKeySelective(LinkMan record);

    int updateByPrimaryKey(LinkMan record);
}