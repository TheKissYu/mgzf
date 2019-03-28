package com.cly.mgzf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cly.mgzf.enity.LinkMan;
import com.cly.mgzf.service.UserService;
import com.cly.mgzf.vo.ResultBean;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/reg")
	@ResponseBody
	public ResultBean register(LinkMan user) {
		ResultBean bean = null;
		
		bean = userService.register(user);
		
		return bean ;
		
	}
	
}
