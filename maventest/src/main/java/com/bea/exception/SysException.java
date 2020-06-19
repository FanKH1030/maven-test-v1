package com.bea.exception;

/**
 * Created by fandi on 2020/4/5 0005.
 */
public class SysException  extends Exception{
    private String msg;
	private String code;

    public SysException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
