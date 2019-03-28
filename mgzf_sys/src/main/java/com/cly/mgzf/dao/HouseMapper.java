package com.cly.mgzf.dao;

import java.util.List;
import java.util.Map;

import com.cly.mgzf.enity.House;
import com.cly.mgzf.vo.HouseInfo;
import com.cly.mgzf.vo.HouseInfoIndexHotBrand;

public interface HouseMapper {
    int deleteByPrimaryKey(Integer hId);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Integer hId);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
    
    HouseInfo selectInfoByPrimaryKey(Integer hId);

    List<HouseInfo> selectHotbrandInfo(Integer ctId);
    
    List<HouseInfoIndexHotBrand> selectInfoByTypeAndCity(Map<String,Object> map);
    
//    List<HouseInfo> selectImgurlByhId(Integer hId);
    
    List<HouseInfo> selectHouseByCtId(Integer ctId);
    
    
    List<HouseInfo> sortByPrice(Map<String, Object> map);
}