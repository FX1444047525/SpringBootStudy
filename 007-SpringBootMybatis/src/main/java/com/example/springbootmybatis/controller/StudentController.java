package com.example.springbootmybatis.controller;


import com.example.springbootmybatis.model.Student;
import com.example.springbootmybatis.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/student/query")
    @ResponseBody
    public String queryStudent(Integer id){
       Student student = studentService.queryStudent(id);
       return student.toString();
    }
}
