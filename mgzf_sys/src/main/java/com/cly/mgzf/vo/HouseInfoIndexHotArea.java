package com.cly.mgzf.vo;
/**
 * index页面租房和优选品牌单个房源所展示的房子信息
 * @author haoze_yu
 *
 */
public class HouseInfoIndexHotArea {
	private Integer id;
	private String name;
	private String info;
	private Integer price;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
