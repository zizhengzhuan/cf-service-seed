package com.zzht.service.patrol.common;

/**
 * @Description: java类作用描述
 * @Author: kunhour
 * @CreateDate: 2018/4/20 11:18
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class Result<T>{
    private boolean success = true;
    private String msg="SUCCESS";
    private String code="200";
    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setMassage(IResultMsg message){
        this.code = message.getCode();
        this.msg = message.getMessage();
    }
}
