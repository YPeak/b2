package com.controller.login;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shuwei.yu.
 * on 2018/5/2.
 */
@Controller
public class Login {
    private static Logger logger = Logger.getLogger(Login.class);
    @RequestMapping("/login")
   public String test(){
        System.out.println("登入页面");
        logger.debug("asdfasdfadsf");
        logger.error("111222222222222");
        logger.info("This is info message.");
        logger.fatal("这是fatal");
       return "welcom";
   }
}