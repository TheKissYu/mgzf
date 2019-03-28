package com.cly.mgzf.vo;
/**
 * 除分页外其他的json格式返回的数据格式
 * 1. code 1为正常   0为异常数据
 * 2. status ok为获得数据 error为没有获得数据(具体识情况而定)
 * 3. data 获取数据
 * @author haoze_yu
 *
 */
public class ResultBean {
	public int code ;
	public String status;
	public Object data;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
