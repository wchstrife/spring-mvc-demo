package com.ssh.controller;

import com.ssh.service.PersonService;
import com.ssh.service.TestService;
import com.ssh.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangchenghao on 2017/7/28.
 */
@Controller
public class MainController {

    @Autowired
    private TestService testService;

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){

        //这里实际返回的是views/test.jsp，因为在spring-mvc.xml中配置过视图解析器
        return "test";
    }

    @RequestMapping(value = "springtest", method = RequestMethod.GET)
    public String springTest(){

        return testService.test();
    }

    @RequestMapping(value = "savePerson", method = RequestMethod.GET)
    @ResponseBody//注解的用途是说明这个返回值不需要经过视图解析器解析，直接返回即可
    public String savePerson(){
        personService.savePerson();
        return "success!";
    }

}
