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
//        System.out.println("登入页面");
        logger.debug("登入页面");
//        logger.error("登入页面");
//        logger.info("登入页面");
//        logger.fatal("登入页面");
       return "welcom";
   }
}
