package com.it.pcsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RequestMapping("/demo")
@RestController
public class DemoController {

    // @Autowired
    // DataSource dataSource;

    @GetMapping("test")
    String testDemo(){
        return "test demo sucessful!!!";
    }
}
