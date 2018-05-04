package com.test;

import com.entity.User;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by shuwei.yu.
 * on 2018/5/4.
 */
public class userFactory {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionFactory.getSqlSession();
        User user = new User("123","123","123");
        sqlSession.insert("com.mapper.UserMapper.save",user);
        sqlSession.commit();
        sqlSession.close();
    }
}
