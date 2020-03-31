package com.qfedu.controller;

import com.qfedu.entity.Student;
import com.qfedu.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2020-03-31 10:45:59
 */
@RestController
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public Student selectOne(@PathVariable Integer id) {
        return this.studentService.queryById(id);
    }

    /**
     * 分页查询（手写板）
     * @param currentPage
     * @param pageSize
     * @return
     */
    @GetMapping("selectPage")
    public List<Student> getStudentByPage(@RequestParam(value = "cp",defaultValue = "1") Integer currentPage,
                                          @RequestParam(value = "ps",defaultValue = "5") Integer pageSize){

        currentPage = currentPage <= 1 ? 1 :currentPage;
        pageSize = pageSize <= 0 ? 10 :pageSize;

        return studentService.queryAllByLimit((currentPage-1)*pageSize,pageSize);
    }

}