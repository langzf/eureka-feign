package com.example.feingconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author langzf
 * @Date 2018/7/12 10:19
 * className：
 * description：
 */
@FeignClient("feign-client")
public interface DcClient {

    @GetMapping("/hello")
    String consumer();
}
