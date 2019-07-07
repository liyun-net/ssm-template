package com.hao.controller;

import com.hao.mapper.FlowerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @Autowired
    FlowerMapper flowerMapper;

    @RequestMapping("/hello")
    String hello(){
        System.out.println(flowerMapper.selectById(8));
        return "hello";
    }
}
