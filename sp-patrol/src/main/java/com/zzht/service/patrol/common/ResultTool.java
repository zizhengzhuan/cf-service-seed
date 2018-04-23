package com.zzht.service.patrol.common;

import com.alibaba.fastjson.JSON;

/**
 * @Description: java类作用描述
 * @Author: kunhour
 * @CreateDate: 2018/4/20 13:41
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class ResultTool {
    public  static javax.ws.rs.core.Response toResponse(Result response){
        return javax.ws.rs.core.Response.ok(JSON.toJSONString(response,true)).build();
    };
}
