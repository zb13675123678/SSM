package com.qfedu.service;

import com.qfedu.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestStudentService {

    @Autowired
    private StudentService studentService;

    @Test
    public void testService(){
        Student s = studentService.queryById(1);

        System.out.println(s);
    }
}