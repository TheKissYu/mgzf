package com.cly.mgzf.vo;

import java.util.List;

public class HouseVoIndexHotBrandList {
	private String type;
	private Boolean isFrist;
	private List<HouseInfoIndexHotBrand> list;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getIsFrist() {
		return isFrist;
	}
	public void setIsFrist(Boolean isFrist) {
		this.isFrist = isFrist;
	}
	public List<HouseInfoIndexHotBrand> getList() {
		return list;
	}
	public void setList(List<HouseInfoIndexHotBrand> list) {
		this.list = list;
	} 
}
