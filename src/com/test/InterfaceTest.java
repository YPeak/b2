package com.test;

import com.entity.Address;
import com.interfaceMapper.AddressMapper;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by shuwei.yu.
 * on 2018/5/4.
 */
public class InterfaceTest {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionFactory.getSqlSession();
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
        Address address = new Address("321","213","231");
        addressMapper.save(address);
        sqlSession.commit();
        sqlSession.close();
    }
}
