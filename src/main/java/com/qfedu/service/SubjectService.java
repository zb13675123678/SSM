package com.qfedu.service;

import com.qfedu.entity.Subject;
import java.util.List;

/**
 * (Subject)表服务接口
 *
 * @author makejava
 * @since 2020-03-31 10:45:59
 */
public interface SubjectService {

    /**
     * 通过ID查询单条数据
     *
     * @param suId 主键
     * @return 实例对象
     */
    Subject queryById(Integer suId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Subject> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param subject 实例对象
     * @return 实例对象
     */
    Subject insert(Subject subject);

    /**
     * 修改数据
     *
     * @param subject 实例对象
     * @return 实例对象
     */
    Subject update(Subject subject);

    /**
     * 通过主键删除数据
     *
     * @param suId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer suId);

}