package com.cly.mgzf.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cly.mgzf.service.CityService;
import com.cly.mgzf.utils.JsonUtils;
import com.cly.mgzf.vo.ResultBean;
/**
 * 城市控制层
 * @author haoze_yu
 *
 */
@RestController
@RequestMapping("/city")
public class CityController {
	@Autowired
	private CityService cityService;
	
	@CrossOrigin
	@GetMapping("/list")
	public ResultBean getList() {
		return cityService.getList();
	}
	
	@CrossOrigin
	@GetMapping("/cityById")
	public ResultBean getcityById(Integer id) {
		return cityService.findById(id);
	}
	@CrossOrigin
	@PostMapping("/setcity")
	public ResultBean setCtIdSession(String ctName,int ctId,HttpSession session) {
		session.setAttribute("ctName", ctName);
		session.setAttribute("ctId", ctId);
		return JsonUtils.instanceResultBean(1, "OK", null);
	}
	@CrossOrigin
	@GetMapping("/getname")
	public ResultBean getCtNameFromSession(HttpSession session) {
		Object ctName = session.getAttribute("ctName");
		return JsonUtils.instanceResultBean(1, "OK", ctName);
	}
	@CrossOrigin
	@GetMapping("/getid")
	public ResultBean getCtidFromSession(HttpSession session) {
		Object ctId = session.getAttribute("ctId");
		if(ctId==null) {
			ctId = 1;
		}
		return JsonUtils.instanceResultBean(1, "OK", ctId);
	}
}
