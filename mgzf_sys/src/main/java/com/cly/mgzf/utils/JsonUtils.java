package com.cly.mgzf.utils;

import com.cly.mgzf.vo.PageBean;
import com.cly.mgzf.vo.ResultBean;
/**
 * 返回json数据的封装工具
 * 
 * @author haoze_yu
 *
 */
public class JsonUtils {
	public static final String STUTSTOK = "OK";
	public static final String STUTSTERROR = "ERROR";
	private static ResultBean resultBean = new ResultBean();
	
	public static ResultBean instanceResultBean(int code, String status, Object data) {
		resultBean.setCode(code);
		resultBean.setData(data);
		resultBean.setStatus(status);
		return resultBean;
	}

	public static <T> PageBean<T> instancePageBean(int code, String msg, Integer count, T list) {
		PageBean<T> pageBean = new PageBean<>();
		pageBean.setCode(code);
		pageBean.setData(list);
		pageBean.setMsg(msg);
		pageBean.setCount(count);
		return pageBean;
	}
}
