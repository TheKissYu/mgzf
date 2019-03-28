package com.cly.mgzf.dao;

import com.cly.mgzf.enity.PayWay;

public interface PayWayMapper {
    int deleteByPrimaryKey(Integer pwId);

    int insert(PayWay record);

    int insertSelective(PayWay record);

    PayWay selectByPrimaryKey(Integer pwId);

    int updateByPrimaryKeySelective(PayWay record);

    int updateByPrimaryKey(PayWay record);
}