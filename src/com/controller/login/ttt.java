package com.controller.login;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by shuwei.yu.
 * on 2018/5/2.
 */
public class ttt {
//    private static Logger logger = Logger.getLogger(ttt.class);
    private static Logger logger = LogManager.getLogger(ttt.class.getName());
    public static void main(String[] args) {

        logger.debug("这是debug");
        logger.info("这是info");
        logger.error("这是error");
        logger.fatal("这是fatal");
    }
}
