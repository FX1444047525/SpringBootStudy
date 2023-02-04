package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.dao.StudentDao;
import com.example.springbootmybatis.model.Student;
import com.example.springbootmybatis.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;
    @Override
    public Student queryStudent(Integer id) {
        Student student = studentDao.selectById(id);
        return student;
    }
}
