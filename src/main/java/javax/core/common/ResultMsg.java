package javax.core.common;

import java.io.Serializable;

/**
 * һ����Ϊservice�㷵�ؽ��
 * @param <T>
 */

public class ResultMsg<T> implements Serializable {

	private static final long serialVersionUID = 2635002588308355785L;

	private int status; //״̬��  ÿ��ϵͳ�������Լ���״̬�볣��  ���� http״̬��   200 500 403 404 503
	private String msg;  // �Է��ؽ����һ��˵��
	private T data;     //�������Ƿ��ص�ʵ������  �����Է��κζ�����

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
