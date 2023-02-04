package com.example.springbootmybatis.dao;

import com.example.springbootmybatis.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


//@Mapper作用是告诉Mybatis框架这是Dao接口，创建此接口的代理对象，位置：在类的上面
@Mapper
public interface StudentDao {
    Student selectById(@Param("stuId") Integer id);
}
