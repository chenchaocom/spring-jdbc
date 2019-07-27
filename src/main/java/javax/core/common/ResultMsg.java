package javax.core.common;

import java.io.Serializable;

/**
 * 一般作为service层返回结果
 * @param <T>
 */

public class ResultMsg<T> implements Serializable {

	private static final long serialVersionUID = 2635002588308355785L;

	private int status; //状态码  每个系统都会有自己的状态码常量  例如 http状态码   200 500 403 404 503
	private String msg;  // 对返回结果的一个说明
	private T data;     //放置我们返回的实际数据  （可以放任何东西）

	public ResultMsg() {
	}
	
	public ResultMsg(int status) {
		this.status = status;
	}

	public ResultMsg(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}
	
	public ResultMsg(int status, T data) {
		this.status = status;
		this.data = data;
	}

	public ResultMsg(int status, String msg, T data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
