package com.cly.mgzf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cly.mgzf.dao.CityMapper;
import com.cly.mgzf.enity.City;
import com.cly.mgzf.service.CityService;
import com.cly.mgzf.utils.JsonUtils;
import com.cly.mgzf.vo.ResultBean;

@Service
public class CityServiceImpl implements CityService{
	@Autowired
	private CityMapper cityMapper;

	@Override
	public ResultBean getList() {
		ResultBean resultBean = null;
		List<City> list = cityMapper.selectAll();
		resultBean=JsonUtils.instanceResultBean(1, "OK", list);
		return resultBean;
	}

	@Override
	public ResultBean findById(int id) {
		ResultBean resultBean = null;
		City city = cityMapper.selectByPrimaryKey(id);
		resultBean=JsonUtils.instanceResultBean(1, "OK", city);
		return resultBean;
	}
	
}
