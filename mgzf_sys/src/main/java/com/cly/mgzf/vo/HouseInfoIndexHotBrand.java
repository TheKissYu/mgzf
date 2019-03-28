package com.cly.mgzf.vo;
/**
 * index页面租房和优选品牌单个房源所展示的房子信息
 * @author haoze_yu
 *
 */
public class HouseInfoIndexHotBrand {
	private Integer id;
	private String name;
	private String imgurl;
	private Integer space;
	private Integer dringRoom;
	private Integer toilet;
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
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
	public Integer getSpace() {
		return space;
	}
	public void setSpace(Integer space) {
		this.space = space;
	}
	public Integer getDringRoom() {
		return dringRoom;
	}
	public void setDringRoom(Integer dringRoom) {
		this.dringRoom = dringRoom;
	}
	public Integer getToilet() {
		return toilet;
	}
	public void setToilet(Integer toilet) {
		this.toilet = toilet;
	}
	@Override
	public String toString() {
		return "HouseInfoIndexHotBrand [id=" + id + ", name=" + name + ", imgurl=" + imgurl + ", space=" + space
				+ ", dringRoom=" + dringRoom + ", toilet=" + toilet + "]";
	}
	
}
