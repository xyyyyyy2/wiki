package com.imooc.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李华大魔王
 * @DATE 2024/11/22  21:36
 * 路漫漫其修远兮，吾将上下而求索
 * 我亦无他，唯手熟尔
 */

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
