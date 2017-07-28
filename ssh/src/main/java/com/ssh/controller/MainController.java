package com.ssh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wangchenghao on 2017/7/28.
 */
@Controller
public class MainController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){

        //这里实际返回的是views/test.jsp，因为在spring-mvc.xml中配置过视图解析器
        return "test";
    }

}
