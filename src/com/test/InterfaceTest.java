package com.test;

import com.entity.Address;
import com.mapper.AddressMapper;
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
        Address address = new Address();
//        address.setId(14);
//        address.setName("小111黑");
//        address.setAge("18");
//        address.setMm("23");
//        User user = new User("dang","66","77");
//        userMapper.save(user);
//        addressMapper.save(address);
//        userMapper.save(user);
//       int aaa =  addressMapper.saveAddress(address);
//        int aaa =  addressMapper.modifyAddress(address);
//        int aaa =  addressMapper.deleteAddress(7,8);
//        Address address =  addressMapper.selectAddress(7);
//        Map<String,Object> map = new HashMap<>();
//        map.put("name","55");
//        map.put("age","56");

//        Address address =  addressMapper.selectWithParam(map);
        Address list = addressMapper.login("55","55");
        System.out.println(list);
        sqlSession.commit();
        sqlSession.close();
    }
}
