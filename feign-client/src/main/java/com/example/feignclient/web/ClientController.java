package com.example.feignclient.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author langzf
 * @Date 2018/7/12 10:01
 * className：
 * description：
 */
@RestController
public class ClientController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello , this is clientController";
    }


}
