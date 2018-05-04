package com.test;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by shuwei.yu.
 * on 2018/5/4.
 */
public class SqlSessionFactory {
    private static Logger logger = LogManager.getLogger(SqlSessionFactory.class.getName());

    private static org.apache.ibatis.session.SqlSessionFactory sqlSessionFactory = null;
    static {
//        读取配置文件
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("创建sqlSessionFactory异常");
        }
    }

//    获取sqlSession的静态方法
    public static SqlSession getSqlSession(){
        return  sqlSessionFactory.openSession();
    }

    public static org.apache.ibatis.session.SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }
}
