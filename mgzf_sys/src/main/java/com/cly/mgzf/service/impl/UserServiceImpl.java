package com.cly.mgzf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cly.mgzf.dao.LinkManMapper;
import com.cly.mgzf.enity.LinkMan;
import com.cly.mgzf.service.UserService;
import com.cly.mgzf.utils.JsonUtils;
import com.cly.mgzf.vo.ResultBean;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private LinkManMapper linkManMapper;
	
	@SuppressWarnings("null")
	@Override
	public ResultBean register(LinkMan user) {
		// TODO Auto-generated method stub
		ResultBean bean = null;
		
		bean.setData("请您输入正确的手机号码！");
		
		if (user.getLkTel().length() == 11) {
			try {
				linkManMapper.insertSelective(user);
				bean = JsonUtils.instanceResultBean(1, "OK", "恭喜您，注册成功！！！");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				bean = JsonUtils.instanceResultBean(0, "ERROR", "当前用户名已存在，请您更换用户名重试");
				throw new RuntimeException(e.getMessage());
			}
		}
		
		
		return bean;
	}

	@Override
	public ResultBean login() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
