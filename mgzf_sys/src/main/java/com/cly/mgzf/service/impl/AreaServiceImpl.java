package com.cly.mgzf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cly.mgzf.dao.AreaMapper;
import com.cly.mgzf.enity.Area;
import com.cly.mgzf.service.AreaService;
import com.cly.mgzf.utils.JsonUtils;
import com.cly.mgzf.vo.ResultBean;

@Service
public class AreaServiceImpl implements AreaService{
	
	@Autowired
	private AreaMapper areaDao;

	@Override
	public ResultBean selectAreaByArCtid(Integer id) {
		ResultBean bean = null;
		
		List<Area> list;
		try {
			list = areaDao.selectByArCtId(id);
			bean = JsonUtils.instanceResultBean(1, "ok", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bean = JsonUtils.instanceResultBean(0, null , e.getMessage());
		}
		
		
		
		return bean;
	}
	
	

}
