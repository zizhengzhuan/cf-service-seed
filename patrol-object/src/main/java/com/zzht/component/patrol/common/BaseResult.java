package com.zzht.component.patrol.common;

/**
 * 基本返回类型
 * @author kunhour
 * @date 2018/04/16
 */
public class BaseResult {

    private static final int SUCCESS= 0;
    private static final int FAIL= 1;

    private int code;

    private String message;

    private Object value;

    public BaseResult() {}

    private BaseResult(int code,String message,Object value) {
        this.code = code;
        this.message = message;
        this.value = value;
    }

    public static BaseResult success(){
        return new BaseResult(BaseResult.SUCCESS,"SUCCESS",null);
    }

    public static BaseResult fail(){
        return new BaseResult(BaseResult.FAIL,"FAIL",null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
