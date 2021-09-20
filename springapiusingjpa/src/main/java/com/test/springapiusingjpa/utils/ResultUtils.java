package com.test.springapiusingjpa.utils;

import com.test.springapiusingjpa.domain.ResultOV;

public class ResultUtils {
    public static ResultOV success(Object object){
        ResultOV resultOV=new ResultOV();
        resultOV.setCode(200);
        resultOV.setMsg("ok");
        resultOV.setData(object);
        return resultOV;
    }
}
