package com.cly.mgzf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cly.mgzf.dao.HouseTypeMapper;
import com.cly.mgzf.enity.HouseType;
import com.cly.mgzf.service.HouseTypeService;
import com.cly.mgzf.utils.JsonUtils;
import com.cly.mgzf.vo.ResultBean;

@Service
public class HouseTypeServiceImpl implements HouseTypeService{
	
	@Autowired
	private HouseTypeMapper houseTypeDao;
	
	@Override
	public ResultBean selectAll() {

		ResultBean bean = new ResultBean();
		
		try {
			List<HouseType> list = houseTypeDao.selectAll();
			bean = JsonUtils.instanceResultBean(1, "Ok", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			bean = JsonUtils.instanceResultBean(0, null, e.getMessage());
		}
		
		
		return bean;
	}

}
