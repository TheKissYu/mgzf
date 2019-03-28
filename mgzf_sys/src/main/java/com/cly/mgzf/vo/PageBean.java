package com.cly.mgzf.vo;
/**
 * layui所需的分页格式的数据格式
 * 
 * 1. code 为0是为正常数据 为1时 为异常数据
 * 2. msg 可以为任何数据 一般设为空字符串
 * 3. count 为数据总数
 * 4. data 为所查分页数据一般为  List<实体类>
 * @author haoze_yu
 *
 * @param <T>
 * T一般情况为实体类 有时可以传其他 vo类
 */
public class PageBean<T> {
	
	private int code;
	private String msg;
	private int count;
	private T data;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
