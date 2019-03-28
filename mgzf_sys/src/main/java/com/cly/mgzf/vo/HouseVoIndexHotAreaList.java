package com.cly.mgzf.vo;

import java.util.List;

public class HouseVoIndexHotAreaList {
	private String type;
	private Boolean isFrist;
	private HouseInfoIndexHotArea left;
	private List<HouseInfoIndexHotArea> list;
	public List<HouseInfoIndexHotArea> getList() {
		return list;
	}
	public void setList(List<HouseInfoIndexHotArea> list) {
		this.list = list;
	}
	public HouseInfoIndexHotArea getLeft() {
		return left;
	}
	public void setLeft(HouseInfoIndexHotArea left) {
		this.left = left;
	}
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
}
