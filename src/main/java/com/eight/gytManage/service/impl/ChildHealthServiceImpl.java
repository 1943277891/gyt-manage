package com.eight.gytManage.service.impl;

import com.eight.gytManage.mapper.ChildHealthMapper;
import com.eight.gytManage.pojo.Tb_natmeha_doctor;
import com.eight.gytManage.pojo.Tb_natmeha_project;
import com.eight.gytManage.service.ChildHealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildHealthServiceImpl implements ChildHealthService {
    @Autowired
    private ChildHealthMapper childHealthMapper;

    //查询出所有有关儿童健康的信息
    @Override
    public List<Tb_natmeha_doctor> getAllList() {
        return childHealthMapper.getAllList();
    }
    //查看出版书的内容
    @Override
    public Tb_natmeha_project LookContentById(String itemID) {
        return childHealthMapper.LookContentById(itemID);
    }
    //删除数据
    @Override
    public void deleteById(String itemID) {
        childHealthMapper.deleteById(itemID);
    }
    //插入数据
    @Override
    public void insert(Tb_natmeha_doctor tb_natmeha_doctor) {
        childHealthMapper.insert(tb_natmeha_doctor);
    }

    @Override
    public Tb_natmeha_doctor selectById(String itemID) {
        return childHealthMapper.selectById(itemID);
    }

    //修改数据
    @Override
    public int updateById(Tb_natmeha_doctor tb_natmeha_doctor) {
        return childHealthMapper.updateById(tb_natmeha_doctor);
    }
}
