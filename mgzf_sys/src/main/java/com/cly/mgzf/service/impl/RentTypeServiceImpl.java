package com.cly.mgzf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cly.mgzf.dao.RentTypeMapper;
import com.cly.mgzf.enity.RentType;
import com.cly.mgzf.service.RentTypeService;
import com.cly.mgzf.utils.JsonUtils;
import com.cly.mgzf.vo.ResultBean;

@Service
public class RentTypeServiceImpl implements RentTypeService{

	@Autowired
	private RentTypeMapper rentTypeDao;
		
	@Override
	public ResultBean selectAll() {
		
		ResultBean bean = null;
		
		try {
			List<RentType> list = rentTypeDao.selectAll();
			bean = JsonUtils.instanceResultBean(1, "ok", list);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean = JsonUtils.instanceResultBean(0, null , e.getMessage());
		}
		
		
		return bean;
	}

}
