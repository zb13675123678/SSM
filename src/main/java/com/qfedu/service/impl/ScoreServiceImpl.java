package com.qfedu.service.impl;

import com.qfedu.entity.Score;
import com.qfedu.dao.ScoreDao;
import com.qfedu.service.ScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Score)表服务实现类
 *
 * @author makejava
 * @since 2020-03-31 10:45:59
 */
@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {
    @Resource
    private ScoreDao scoreDao;

    /**
     * 通过ID查询单条数据
     *
     * @param scId 主键
     * @return 实例对象
     */
    @Override
    public Score queryById(Integer scId) {
        return this.scoreDao.queryById(scId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Score> queryAllByLimit(int offset, int limit) {
        return this.scoreDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    @Override
    public Score insert(Score score) {
        this.scoreDao.insert(score);
        return score;
    }

    /**
     * 修改数据
     *
     * @param score 实例对象
     * @return 实例对象
     */
    @Override
    public Score update(Score score) {
        this.scoreDao.update(score);
        return this.queryById(score.getScId());
    }

    /**
     * 通过主键删除数据
     *
     * @param scId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer scId) {
        return this.scoreDao.deleteById(scId) > 0;
    }
}