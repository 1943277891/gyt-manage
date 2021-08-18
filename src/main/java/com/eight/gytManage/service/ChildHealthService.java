package com.eight.gytManage.service;

import com.eight.gytManage.pojo.Tb_natmeha_doctor;
import com.eight.gytManage.pojo.Tb_natmeha_project;

import java.util.List;

public interface ChildHealthService {
     //查询出所有有关儿童健康的信息
     List<Tb_natmeha_doctor> getAllList();

     //分页查询
     List<Tb_natmeha_doctor> getAllByPage(Integer pageNum,Integer pageSize);

     //查看文章的内容
     Tb_natmeha_project LookContentById(String itemID);

     //删除文章
     void deleteById(String itemID);

     //添加数据
     void insert(Tb_natmeha_doctor tb_natmeha_doctor);

     //根据id找到信息
     Tb_natmeha_doctor selectById(String itemID);

     //更新数据
     int updateById(Tb_natmeha_doctor tb_natmeha_doctor);

}
