package com.eight.gytManage.mapper;

import com.eight.gytManage.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    //根据登入名与密码登入
    User LoginByUser(String USERNAME, String PASSWORD);
}
