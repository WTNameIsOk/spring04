package com.zhidi.service.impl;

import com.zhidi.dao.BaseDao;
import com.zhidi.service.BaseService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/7/13.
 */
public class BaseServiceImpl<T, PK extends Serializable> implements BaseService<T, PK> {

    private BaseDao<T, PK> baseDao;

    public void setBaseDao(BaseDao<T, PK> baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public T get(PK id) {
        return baseDao.get(id);
    }

    @Override
    public void del(PK id) {
        baseDao.del(id);
    }

    @Override
    public List getAll() {
        return baseDao.getAll();
    }

    @Override
    public void edit(T entity) {
        baseDao.edit(entity);
    }

    @Override
    public void add(T entity) {
        baseDao.add(entity);
    }
}
