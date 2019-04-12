package com.traindo.common;

public class Json implements java.io.Serializable {

	private static final long serialVersionUID = 8722126593920041253L;

	private boolean success = false;

	private String msg = "";

	private Object obj = null;
	
	private Integer status= 200;

//	private String code = "0";// 

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
