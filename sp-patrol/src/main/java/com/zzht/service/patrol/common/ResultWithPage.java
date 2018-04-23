package com.zzht.service.patrol.common;

/**
 * @Description: java类作用描述
 * @Author: kunhour
 * @CreateDate: 2018/4/20 11:25
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class ResultWithPage<T> extends Result<T> {
    private int total = 0;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
