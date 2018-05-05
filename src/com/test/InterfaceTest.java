package com.test;

import com.entity.Address;
import com.interfaceMapper.AddressMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by shuwei.yu.
 * on 2018/5/4.
 */
public class InterfaceTest {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionFactory.getSqlSession();
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
        Address address = new Address();
//        address.setId(4);
        address.setName("小黑");
//        address.setAge("18");
//        User user = new User("55","66","77");
//        addressMapper.save(address);
//        userMapper.save(user);
//       int aaa =  addressMapper.saveAddress(address);
//        int aaa =  addressMapper.modifyAddress(address);
//        int aaa =  addressMapper.deleteAddress(7,8);
//        Address address =  addressMapper.selectAddress(7);
        Map<String,Object> map = new HashMap<>();
        map.put("name","55");
        map.put("age","56");

//        Address address =  addressMapper.selectWithParam(map);
        int aa =addressMapper.deleteWithParam(map);

        System.out.println(aa);
        sqlSession.commit();
        sqlSession.close();
    }
}
