package com.ssh.service.impl;

import com.ssh.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by wangchenghao on 2017/7/28.
 */
@Service
public class TestServiceImpl implements TestService {
    public String test(){

        return "test";
    }
}
