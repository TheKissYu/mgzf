package com.cly.mgzf.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cly.mgzf.dao.HouseImgMapper;
import com.cly.mgzf.dao.HouseMapper;
import com.cly.mgzf.dao.HouseTypeMapper;
import com.cly.mgzf.dao.RentTypeMapper;
import com.cly.mgzf.enity.RentType;
import com.cly.mgzf.service.HouseService;
import com.cly.mgzf.utils.JsonUtils;
import com.cly.mgzf.vo.HouseInfo;
import com.cly.mgzf.vo.HouseInfoIndexHotBrand;
import com.cly.mgzf.vo.HouseVoIndexHotBrandList;
import com.cly.mgzf.vo.ResultBean;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class HouseServiceImpl implements HouseService {

	private Map<String,Object> map = new HashMap();
	
	
	@Autowired
	private HouseMapper houseDao;
	@Autowired
	private HouseTypeMapper houseTypeDao;
	
	@Autowired
	private RentTypeMapper rtDao;
	@Autowired
	private HouseImgMapper hIDao;
	@Override
	/**
	 * 查询该ID下房源的基础信息 不包括img及房源配置
	 */
	public ResultBean getHouseInfo(Integer hId) {

		HouseInfo houseinfo = null;

		ResultBean resultBean = null;

		houseinfo = houseDao.selectInfoByPrimaryKey(hId);
		resultBean = JsonUtils.instanceResultBean(0, "OK", houseinfo);

		return resultBean;
	}

	@Override
	public ResultBean getInfoByAllTypeAndCity(int id) {
		List<HouseVoIndexHotBrandList> hList = new ArrayList<>();
		Map<String,Object> map = new HashMap<>();

		map.put("ctId", id);
		List<RentType> list = rtDao.selectAll();
		int i = 0;
		for (RentType rt : list) {
			HouseVoIndexHotBrandList hv= new HouseVoIndexHotBrandList();
			hv.setType(rt.gettType());
			if(i == 0) {
				hv.setIsFrist(true);
			}else {
				hv.setIsFrist(false);
			}
			i++;
			map.put("typeId",rt.getRtId());
			Page<HouseInfoIndexHotBrand> page = PageHelper.startPage(1, 4);
			List<HouseInfoIndexHotBrand> infoList = houseDao.selectInfoByTypeAndCity(map);
			hv.setList(new ArrayList<>());
			for (HouseInfoIndexHotBrand houseInfo : infoList) {
				List<String> imgList = hIDao.selectByHouseId(houseInfo.getId());
				if(imgList != null && imgList.size()>0) {
					houseInfo.setImgurl(imgList.get(0));
				}
				hv.getList().add(houseInfo);
			}
			hList.add(hv);
		}
		return JsonUtils.instanceResultBean(1, "OK", hList);
	}

	@Override
	public ResultBean getInfoByAllHotBrandAndCity(int id) {

		return null;
	}

	@Override
	public ResultBean getHotbrandHouseInfo(Integer ctId) {
		// TODO Auto-generated method stub
		ResultBean resultBean = null;
		List<HouseInfo> list = houseDao.selectHotbrandInfo(ctId);

		resultBean = JsonUtils.instanceResultBean(1, "OK", list);
		return resultBean;
	}

	@Override
	public ResultBean getInfoByAllType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultBean getHouseImgUrl(Integer hId) {
		// TODO Auto-generated method stub
		ResultBean resultBean = null;
		//List<HouseInfo> list = houseDao.selectImgurlByhId(hId);

		//resultBean = JsonUtils.instanceResultBean(1, "OK", list);
		return resultBean;
	}

	@Override
	public ResultBean getHouseAllByCtId(int id) {
		// TODO Auto-generated method stub
		map.put("ctId", id);
		map.put("arId", 0);
		map.put("hPrice", 0);
		map.put("rtId", 0);
		map.put("hspace", 0);
		map.put("htId", 0);
		map.put("sort", 0);
		List<HouseInfo> list = houseDao.sortByPrice(map);
		return JsonUtils.instanceResultBean(1, "OK", list);
	}

	/**
	 * 通过面积判断
	 */
	@Override
	public ResultBean sortBySpace(String hSpace) {
		// TODO Auto-generated method stub
		if(!hSpace.equals("0")) {
			String space = hSpace.substring(1);
			
			int sp = Integer.parseInt(space);
			
			if(hSpace.contains("<")) {
				map.put("hspace", 1);
			}else {
				map.put("hspace", 2);
			}
			map.put("space", sp);


		}else {
			map.put("hspace", 0);
		}


		List<HouseInfo> list = houseDao.sortByPrice(map);

		return JsonUtils.instanceResultBean(1, "Ok", list);
	}

	@Override
	public ResultBean sortByArId(Integer arId) {

		if(arId != 0) {
			map.put("arId", arId);
		}else {
			map.put("arId", 0);
		}
		List<HouseInfo> list = houseDao.sortByPrice(map);
		return JsonUtils.instanceResultBean(1, "Ok", list);
		
	}

	@Override
	public ResultBean sortByPrice(String hPrice) {
		
		if(!hPrice.equals("0")) {
			String price = hPrice.substring(1);
			
			int pr = Integer.parseInt(price);
			
			if(hPrice.contains("<")) {
				map.put("hPrice", 1);
			}else {
				map.put("hPrice", 2);
			}
			map.put("price", pr);


		}else {
			map.put("hPrice", 0);
		}
		
		
		List<HouseInfo> list = houseDao.sortByPrice(map);
		return JsonUtils.instanceResultBean(1, "Ok", list);
	}

	@Override
	public ResultBean sortByRtId(Integer rtId) {
		// TODO Auto-generated method stub
		
		map.put("rtId", rtId);
		
		List<HouseInfo> list = houseDao.sortByPrice(map);
		return JsonUtils.instanceResultBean(1, "Ok", list);
	}

	@Override
	public ResultBean sortByHtId(Integer htId) {
		// TODO Auto-generated method stub
		
		map.put("htId", htId);
		
		List<HouseInfo> list = houseDao.sortByPrice(map);
		return JsonUtils.instanceResultBean(1, "Ok", list);
	}
	
	public ResultBean sortord(Integer sort) {
		
		map.put("sort", sort);
		
		List<HouseInfo> list = houseDao.sortByPrice(map);
		return JsonUtils.instanceResultBean(1, "Ok", list);
	}

}
