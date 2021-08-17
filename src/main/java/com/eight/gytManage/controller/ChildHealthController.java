package com.eight.gytManage.controller;

import com.eight.gytManage.pojo.Tb_natmeha_doctor;
import com.eight.gytManage.service.ChildHealthService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("eight/child/health")
public class ChildHealthController {
    @Autowired
    private ChildHealthService childHealthService;
    @GetMapping("getAll")
    private String getAll(Model model){
        model.addAttribute("All",childHealthService.getAllList());
        return "ChildHealthList";
    }

    @GetMapping("look")
    private String Look(Model model,String itemID){
        model.addAttribute("Look",childHealthService.LookContentById(itemID));
        return "LookContent";
    }


    //删除数据返回到显示所有的数据时需要用到forward，与插入数据不同
    @GetMapping("delete")
    private String Delete(String itemID){
        childHealthService.deleteById(itemID);
        return "forward:getAll";
    }

    @GetMapping("aaa")
    private String bbb(){
        return "insert";
    }
    //post操作(一般用于插入数据时，返回页面时需要用到redirect)
    @PostMapping("insert")
    private String insert(Tb_natmeha_doctor tb_natmeha_doctor){
        childHealthService.insert(tb_natmeha_doctor);
        return "redirect:getAll";
    }
    @GetMapping("ccc")
    private String asd(Model model,String itemID){
        model.addAttribute("tnd",childHealthService.selectById(itemID));
        return "update";
    }
    //更新数据
    @PostMapping("update")
    private String update(Tb_natmeha_doctor tb_natmeha_doctor){
        System.out.println("asd发的");
        System.out.println(tb_natmeha_doctor);
        childHealthService.updateById(tb_natmeha_doctor);
        return "redirect:getAll";
    }
}
