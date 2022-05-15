package com.mooc.zhang.controller;

import com.mooc.zhang.domain.Test;
import com.mooc.zhang.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class test {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String hello() {
        System.out.println("zhang");
        return "hello 热部署 dd niaho dddd ";
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}
