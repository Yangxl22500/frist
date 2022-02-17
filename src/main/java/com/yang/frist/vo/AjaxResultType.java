package com.yang.frist.vo;

/**
 * ajax操作结果的枚举
 * @author:      xlyang
 * @date:        2019年5月15日 下午1:49:38
 */
public enum AjaxResultType {
	
	Info(203, "消息结果"),
	Warning(204, "警告结果"),
	Success(200, "成功结果"),
	Error(500, "异常结果"),
	UnAuth(401, "用户未登录"),
	Forbidden(403, "已登录，但权限不足"),
	NoFound(404, "资源未找到"),
	Locked(423, "资源被锁定");

	private Integer code;
	private String text;
	
	AjaxResultType(Integer code, String text) {
		this.code = code;
		this.text = text;
	}
	public Integer getCode() {
		return code;
	}
	public String getText() {
		return text;
	}
}
