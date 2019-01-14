package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.service.TestService;


/**
 * Created by chenqimiao on 17/3/24.
 */
@Controller
public class TestController {

	@Reference(version = "1.0.0")
    private TestService testService;
    
    @RequestMapping(value = "/sayHello" ,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String test(){
        return testService.sayHello("Chenqimiao");
    }
    
}