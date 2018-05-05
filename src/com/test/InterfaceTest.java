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
        Address address = new Address("55","55","556");
//        User user = new User("55","66","77");
//        addressMapper.save(address);
//        userMapper.save(user);
       int aaa =  addressMapper.saveAddress(address);
        System.out.println(aaa);
        sqlSession.commit();
        sqlSession.close();
    }
}
