package com.test;


import com.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by shuwei.yu.
 * on 2018/5/4.
 */
public class connect {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        User user = new User("34","22","34");
        session.insert("com.entity.UserMapper.save",user);
//        session.update("com.entity.UserMapper.update",user);
//        session.delete("com.entity.UserMapper.delete",user);
        Map<String,Object> map = new HashMap<>();
        map.put("id",1);
        session.commit();
        session.close();


    }
}
