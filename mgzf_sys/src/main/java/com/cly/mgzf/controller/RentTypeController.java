package com.cly.mgzf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cly.mgzf.service.RentTypeService;
import com.cly.mgzf.vo.ResultBean;

@RestController
@RequestMapping("/renttype")
public class RentTypeController {
	
	@Autowired
	private RentTypeService rentTypeService;
	
	/**
	 * 查看所有的出租方式
	 * @return
	 */
	@CrossOrigin
	@GetMapping("/list")
	public ResultBean findAll() {
		
		return rentTypeService.selectAll();
		
		
	}
	
}
