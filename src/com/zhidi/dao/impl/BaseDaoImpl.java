package com.zhidi.dao.impl;

import com.zhidi.dao.BaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Administrator on 2017/7/13.
 */
@Repository
public class BaseDaoImpl<T, PK extends Serializable> implements BaseDao<T, PK> {

    @Autowired
    private SessionFactory factory;
    private Class<T> entityClass;

    public BaseDaoImpl() {
        Class<? extends BaseDaoImpl> claz = getClass();
        Type type = claz.getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            Type[] types = ((ParameterizedType) type).getActualTypeArguments();
            entityClass = (Class<T>) types[0];
        }
    }

    private Session getSession(){
        return factory.getCurrentSession();
    }

    @Override
    public T get(PK id) {
        return (T) getSession().get(entityClass, id);
    }

    @Override
    public void del(PK id) {
        getSession().delete(id);
    }

    @Override
    public List getAll() {
        Query query = getSession().createQuery("from" + entityClass.getName());
        return query.list();
    }

    @Override
    public void edit(T entity) {
        getSession().update(entity);
    }

    @Override
    public void add(T entity) {
        Serializable id = getSession().save(entity);
    }
}
