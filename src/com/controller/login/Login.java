package com.controller.login;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shuwei.yu.
 * on 2018/5/2.
 */
@Controller
public class Login {
    private static Logger logger = LogManager.getLogger(Login.class.getName());
    @RequestMapping("/login")
   public String test(){
        logger.info("登入页面");
       return "welcom";
   }
}
