package com.eight.gytManage.utils;


import java.util.HashMap;

/**
 * @Author Kele-Bing
 * @Create 2021/8/12 18:02
 * @Version 1.0
 * 
 * 处理异常的工具类，根据异常，解析为优雅的文字显示
 */
public class ResultException extends RuntimeException {

    public ResultException() {
    }

    public ResultException(String message) {
        super(message);
    }

    /**
     * 异常数据统一处理
     */
    public HashMap<String,Object> customException(EnMsgType enMsgType){
        HashMap<String,Object> resultMap = new HashMap<>();
        resultMap.put("code",enMsgType.getCode());
        resultMap.put("msg",enMsgType.getMsg());
        resultMap.put("icon", 2);
        return resultMap;
    }

    /**
     * 修改状态码的信息
     */
    public EnMsgType setEnMsgTypeMsg(EnMsgType enMsgType,String msg){
        enMsgType.setMsg(msg);
        return enMsgType;
    }
   
}
