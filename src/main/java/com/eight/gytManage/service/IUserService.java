package com.eight.gytManage.service;

import com.eight.gytManage.pojo.User;

/**
 * @Author Kele-Bing
 * @Create 2021/8/14 11:40
 * @Version 1.0
 */
public interface IUserService {
    User queryUserByUsername(String username);
}
