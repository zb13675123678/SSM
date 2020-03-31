package com.qfedu.controller;

import com.qfedu.entity.Subject;
import com.qfedu.service.SubjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Subject)表控制层
 *
 * @author makejava
 * @since 2020-03-31 10:45:59
 */
@RestController
@RequestMapping("subject")
public class SubjectController {
    /**
     * 服务对象
     */
    @Resource
    private SubjectService subjectService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Subject selectOne(Integer id) {
        return this.subjectService.queryById(id);
    }

}