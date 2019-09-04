package com.corny.ssm.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corny.ssm.demo.service.IInfoService;

@RestController
@RequestMapping(value = "/", produces = "application/json;charset=UTF-8")
public class IndexController {

    @Autowired
    private IInfoService infoService;

    @RequestMapping(value = "/")
    public String index() {
        System.out.println(infoService.getInfoList());
        return "{\"msg\": \"666\"}";
    }

}
