package com.cly.mgzf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cly.mgzf.service.HouseTypeService;
import com.cly.mgzf.vo.ResultBean;

@RestController
@RequestMapping("/housetype")
public class HouseTypeController {
	@Autowired
	private HouseTypeService houseTypeService;
	
	/**
	 *  获取所有的户型(室)
	 * @return
	 */
	@CrossOrigin
	@GetMapping("/list")
	public ResultBean seleceAll() {
		
		return houseTypeService.selectAll();
	}

}
