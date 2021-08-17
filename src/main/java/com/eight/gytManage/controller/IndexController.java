package com.eight.gytManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Kele-Bing
 * @Create 2021/8/14 11:51
 * @Version 1.0
 */
@Controller
@RequestMapping("/eight")
public class IndexController {
    
    @RequestMapping("/")
    public String toLoginPage(){
        return "index";
    }

    @RequestMapping("/index")
    public String toIndexPage(){
        return "index";
    }

    @RequestMapping("/sourceManage")
    public String toSourceManagePage(){
        return "/infoManage/sourceManage";
    }
}
