package com.zhidi.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/7/13.
 */
public interface BaseDao<T, PK extends Serializable> {

    T get(PK id);

    void del(PK id);

    List getAll();

    void edit(T entity);

    void add(T entity);
}
