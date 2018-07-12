package com.example.feingconsumer.web;

import com.example.feingconsumer.feign.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author langzf
 * @Date 2018/7/12 10:21
 * className：
 * description：
 */
@RestController
public class ConsumerController {

    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String consumer(){
        return dcClient.consumer();
    }

}
