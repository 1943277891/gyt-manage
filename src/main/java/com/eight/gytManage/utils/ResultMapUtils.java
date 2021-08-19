package com.eight.gytManage.utils;


import com.eight.gytManage.pojo.Page;
import com.eight.gytManage.pojo.UserLoginLog;

import java.util.HashMap;
import java.util.List;
/**
 * @Author Kele-Bing
 * @Create 2021-09-12 17:09:13
 * @Version 1.0
 * 
 * 结果封装工具，返回给前端前，经过这个处理
*/

public class ResultMapUtils {

    
    /**
     * 返回单个结果
     * 登录等需要
     * @return 登录结果
     */
    public static <T> HashMap<String,Object> singleResult(T data){
        HashMap<String,Object> resultMap = new HashMap<>();
        if(data != null  && !data.equals("")){
            resultMap.put("code", EnMsgType.SUCCESS.getCode());
            resultMap.put("msg", EnMsgType.SUCCESS.getMsg());
        }else {
            resultMap.put("code", EnMsgType.FAIL.getCode());
            resultMap.put("msg", EnMsgType.FAIL.getMsg());
        }
        resultMap.put("data", data);
        return resultMap;
    }


    /**
     * 分页查询结果
     * @param page
     */
    public static <T> HashMap<String,Object> pageResult(Page<UserLoginLog> page){
        HashMap<String,Object> resultMap = new HashMap<>();
        resultMap.put("code",EnMsgType.SUCCESS.getCode());
        resultMap.put("msg",EnMsgType.SUCCESS.getMsg());
        resultMap.put("count",page.getTotalPageCount());
        resultMap.put("data",page.getItem());
        return resultMap;
    }

    /**
     * 删除和保存成功的统一返回格式
     */
    public static HashMap<String,Object> operateResult(int i){
        HashMap<String,Object> resultMap = new HashMap<>();
        if(i == 0){
            resultMap.put("msg",EnMsgType.SUCCESS.getMsg());
            resultMap.put("code",EnMsgType.SUCCESS.getCode());
            resultMap.put("icon",2);
        }else {
            resultMap.put("msg",EnMsgType.FAIL.getMsg());
            resultMap.put("code",EnMsgType.FAIL.getCode());
            resultMap.put("icon",1);
        }
        return resultMap;
    }

    /**
     * List返回格式
     */
    public static HashMap<String,Object> listResult(List<?> data){
        HashMap<String,Object> resultMap = new HashMap<>();
        if(data != null && data.size() > 0){
            resultMap.put("code",EnMsgType.SUCCESS.getCode());
            resultMap.put("msg",EnMsgType.SUCCESS.getMsg());
        }else {
            resultMap.put("code",EnMsgType.FAIL.getCode());
            resultMap.put("msg","没有查询到数据！");
        }
        resultMap.put("data",data);
        return resultMap;
    }


}
