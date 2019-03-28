package com.cly.mgzf.service;

import com.cly.mgzf.vo.ResultBean;

public interface HouseService {

	/**
	 * 根据ID获取单个房源对象的所有信息
	 * @return
	 * 返回一个包装后的json数据
	 * 1.code 0 异常  1无异常
	 * 2.status ok获得数据 error无数据
	 * 3.data list
	 */
	ResultBean getHouseInfo(Integer hId);
	
	/**
	 * 根据热门品牌名获取房源列表储存多个房源对象的信息
	 * @return
	 * 返回一个包装后的json数据
	 * 1.code 0 异常  1无异常
	 * 2.status ok获得数据 error无数据
	 * 3.data list
	 */
	ResultBean getHotbrandHouseInfo(Integer ctId);
	
	/**
	 * 根据房源id获取房源所属的img路径
	 * @return
	 * 返回一个包装后的json数据
	 * 1.code 0 异常  1无异常
	 * 2.status ok获得数据 error无数据
	 * 3.data list
	 */
	ResultBean getHouseImgUrl(Integer hId);
	

	
	ResultBean getInfoByAllType();

	ResultBean getInfoByAllTypeAndCity(int id);
	
	ResultBean getInfoByAllHotBrandAndCity(int id);
	
	/**
	 * 通过城市Id过去当前城市下的所有房源
	 * @param id
	 * @return
	 */
	ResultBean getHouseAllByCtId(int id);

	/**
	 * 根据价格查询房源
	 * @param hPrice
	 * @return
	 */
	ResultBean sortByPrice(String hPrice);
	/**
	 * 根据价格查询房源
	 * @param hPrice
	 * @return
	 */
	ResultBean sortBySpace(String hSpace);
	/**
	 * 	通过区域ID查询房源
	 * @param arId
	 * @return
	 */
	ResultBean sortByArId(Integer arId);
	
	
	
	
	/**
	 * 根据出租方式查询房源
	 * @param rtId
	 * @return
	 */
	ResultBean sortByRtId(Integer rtId);

	/**
	 * 根据户型Id查询房源
	 * @param htId
	 * @return
	 */
	ResultBean sortByHtId(Integer htId);
	
	/**
	 * 根据不同方式排序
	 * @param sort
	 * @return
	 */
	ResultBean sortord(Integer sort);
	




}
