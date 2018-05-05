package com.interfaceMapper;

import com.entity.Address;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

/**
 * Created by shuwei.yu.
 * on 2018/5/4.
 */
public interface AddressMapper {

//    调用的mapper.xml中的sql
    void save(Address address);

//    采用注解方式
//    @Insert() 注解sql语句
//    @Options()中的 useGeneratedKeys=true 表示数据库主键自增
//    keyProperty表示将插入数据库生成的主键到id字段
    @Insert("insert into address(name ,age, mm) values(#{name},#{age},#{mm})")
    @Options(useGeneratedKeys = true ,keyProperty = "id")
    int saveAddress(Address address);


}
