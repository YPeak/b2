package com.controller.login;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by shuwei.yu.
 * on 2018/5/2.
 */
public class tttest {
//    private static Logger logger = Logger.getLogger(ttt.class);
    private static Logger logger = LogManager.getLogger(tttest.class.getName());
    public static void main(String[] args) {

        logger.debug("这是debug1111111");
        logger.info("这是info111111111");
        logger.error("这是error111111111111");
        logger.fatal("这是fatal111111111");
    }
}
