package com.catt.demo.service.hystrix;

import com.catt.demo.service.HelloRemote;
import org.springframework.stereotype.Service;

@Service
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "hello" + name + ", this messge send failed ";
    }
}
