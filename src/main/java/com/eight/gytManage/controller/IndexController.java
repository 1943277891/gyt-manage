package com.eight.gytManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * @Author Kele-Bing
 * @Create 2021/8/14 11:51
 * @Version 1.0
 */
@Controller
@RequestMapping("/eight")
public class IndexController {

    @GetMapping("/index")
    public String login(@RequestParam("USERNAME") String USERNAME,
                        @RequestParam("PASSWORD") String PASSWORD,
                        Model model,
                        HttpSession session){
        if (!StringUtils.isEmpty(USERNAME) && "123456".equals(PASSWORD)){
            //满足条件时登入(重定向,当登入成功时，网页上不显示用户名以及密码)
            session.setAttribute("loginUser",USERNAME);
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","用户名或密码错误");
            return "/Login.html";
        }
    }

    @RequestMapping("/login")
    public String login(){
        return "/Login.html";
    }
    
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
