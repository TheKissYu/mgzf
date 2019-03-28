package com.cly.mgzf.service;

import com.cly.mgzf.enity.LinkMan;
import com.cly.mgzf.vo.ResultBean;

public interface UserService {

	/**
	 * 完成用户注册
	 * @return
	 * 返回一个包装后的json数据
	 * 1.code 0 异常  1无异常
	 * 2.status OK成功注册 ERROR返回错误信息
	 * 3.data OK——注册成功 ERROR——返回错误信息
	 */
	ResultBean register(LinkMan user);
	
	ResultBean login();
}
