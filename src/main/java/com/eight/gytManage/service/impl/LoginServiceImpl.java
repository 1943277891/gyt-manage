package com.eight.gytManage.service.impl;

import com.eight.gytManage.mapper.LoginMapper;
import com.eight.gytManage.pojo.User;
import com.eight.gytManage.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Override
    public User LoginByUser(String USERNAME, String PASSWORD) {
        return loginMapper.LoginByUser(USERNAME,PASSWORD);
    }
}
