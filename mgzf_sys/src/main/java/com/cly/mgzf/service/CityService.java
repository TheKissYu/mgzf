package com.cly.mgzf.service;

import com.cly.mgzf.vo.ResultBean;

public interface CityService {
	/**
	 * 获取所有的城市
	 * @return
	 * 返回一个包装后的json数据
	 * 1.code 0 异常  1无异常
	 * 2.status ok获得数据 error无数据
	 * 3.data list 
	 */
	public ResultBean getList();
	
	public ResultBean findById(int id);
}
