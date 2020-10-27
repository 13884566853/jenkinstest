package com.jenkins.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Auther: wwt
 * @Date: 2020/10/26 21:26
 * @Description:
 */
@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "你好 jenkins，2020-10-26 22:28:52" +
                "配置了花生壳内网穿透";
    }

}
