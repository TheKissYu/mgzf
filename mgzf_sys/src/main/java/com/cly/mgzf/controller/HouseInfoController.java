package com.cly.mgzf.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cly.mgzf.service.HouseService;
import com.cly.mgzf.vo.ResultBean;

@RestController
@RequestMapping("/house")
public class HouseInfoController {
	
	@Autowired
	private HouseService houseService;
	
	@GetMapping("/info")
	@CrossOrigin
	public ResultBean getHouseInfo(Integer id) {
		if (id == null) {
			id = 1;
		}
		
		return houseService.getHouseInfo(id);
	}
	
	@GetMapping("/imgurl")
	@CrossOrigin
	public ResultBean getHouseImgUrl(Integer id) {
		if (id == null) {
			id = 1;
		}
		
		return houseService.getHouseImgUrl(id);
	}

	@GetMapping("/hotbrand")
	@CrossOrigin
	public ResultBean gethotbrandinfo(HttpSession session) {
		Integer ctId = (Integer) session.getAttribute("ctId");
		if (ctId == null) {
			ctId = 1;
		}
		return houseService.getHotbrandHouseInfo(ctId);
	}
	

	@GetMapping("/indexByType")
	@CrossOrigin
	public ResultBean getIndexInfoAllType(HttpSession session) {
		Object obj = session.getAttribute("ctId");
		Integer ctId =1;
		if(obj != null) {
			ctId = (Integer) obj;
		}
		
		return houseService.getInfoByAllTypeAndCity(ctId);
	}
	
	@GetMapping("/findHouse")
	public ResultBean findAllHouseByCtId(Integer ctId) {
		
		
		if(ctId == null) {
			
			ctId = 1;
		}
		ResultBean bean = houseService.getHouseAllByCtId(ctId);
		
		return bean;
		
	}
	//根据价格查房源
	@GetMapping("/sortByPrice")
	public ResultBean sortByPrice(String hPrice) {
		
		
		ResultBean bean  = houseService.sortByPrice(hPrice);
		
		return bean;
		
	}
	//根据区域Id查房源
	@GetMapping("/sortByArId")
	public ResultBean sortByArId(Integer arId) {
		
		return houseService.sortByArId(arId);
		
	}
	//根据面积差房源
	@GetMapping("/sortBySpace")
	public ResultBean sortByprice(String hSpace) {
		
		return houseService.sortBySpace(hSpace);
		
	}
	
	//根据出租方式id查房源
	@GetMapping("/sortByRtId")
	public ResultBean sortByRtId(Integer rtId) {
		
		
		return houseService.sortByRtId(rtId);
		
	}
	//根据户型查找房源
	@GetMapping("/sortByHtId")
	public ResultBean sortByHtId(Integer htId) {
		
		
		return houseService.sortByHtId(htId);
		
	}
	//跟不同方式对房源进行排序
	@GetMapping("/sortord")
	public ResultBean sortord(Integer sort) {
		
		
		return houseService.sortord(sort);
		
	}
	
	

}
