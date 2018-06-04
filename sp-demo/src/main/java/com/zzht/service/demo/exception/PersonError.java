package com.zzht.service.demo.exception;

import com.zzht.cole.flower.common.response.IResponseMessage;
/**
 * 类的描述
 * @author : kunhour
 * @version :1.0
 * @since : 2018/6/4 10:14
*/
public enum  PersonError implements IResponseMessage {
    /**错误*/
    PARAM_ERROR(1101,"参数【{0}】不能为空");

    PersonError(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;
    private String msg;


    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
