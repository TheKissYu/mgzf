package com.cly.mgzf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cly.mgzf.service.AreaService;
import com.cly.mgzf.vo.ResultBean;

@RestController
@RequestMapping("/area")
public class AreaController {
	
	@Autowired
	private AreaService areaService;
	
	/**
	 *  通过城市id查询城市下的所有区域表
	 * @param id
	 * 		所在城市的id
	 * @return
	 */
	@GetMapping("/list")
	@CrossOrigin
	public ResultBean findAreaByArCtId(Integer id) {
		
	
		return areaService.selectAreaByArCtid(id);
	}
	

}
