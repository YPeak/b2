package com.controller.login;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by shuwei.yu.
 * on 2018/5/2.
 */
public class ttt {

    public static void main(String[] args) {
        PropertyConfigurator.configure("src/log4j.properties");
        Logger logger = Logger.getLogger(ttt.class);
        logger.debug("这是debug");
        logger.info("这是info");
        logger.error("这是error");
        logger.fatal("这是fatal");
    }
}
