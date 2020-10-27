package com.jenkins.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Random;


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
                "配置了花生壳内网穿透" +
                "修复webhook添加错误";
    }
    @RequestMapping("/hi")
    @ResponseBody
    public String hi() {
        return "Hi jenkins，" + new Date().toString()+
                "配置了花生壳内网穿透" +
                "修复webhook添加错误";
    }
    @RequestMapping("/miss")
    @ResponseBody
    public String miss() {
        String str[]=("十年生死两bai茫茫，不思量，自难忘。#玲珑骰子安红豆，入骨相思知不知。#" +
                "兽炉沈水bai烟，翠沼残花片，一行行写入相du思传。#天长路远魂飞苦，梦魂不到关山难，长相思，摧心肝。#" +
                "似此星辰非昨夜，为谁风露立中宵。#人生自是有情痴，此恨不关风与月。#" +
                "有美人兮，见之不忘，一日不见兮，思之如狂。").split("#");
        Random random = new Random(20);
        int index = random.nextInt(str.length);
        return str[index];
    }
}
