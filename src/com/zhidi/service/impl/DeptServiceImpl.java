package com.zhidi.service.impl;

import com.zhidi.dao.DeptDao;
import com.zhidi.entity.Dept;
import com.zhidi.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/7/14.
 */
@Service
public class DeptServiceImpl extends BaseServiceImpl<Dept, Integer> implements DeptService {
    @Resource
    private DeptDao deptDao;//用来拓展dept的方法

    /**
     * 设置父类的baseDao
     * @param deptDao
     */
    @Resource
    public void setBaseDao(DeptDao deptDao) {
        super.setBaseDao(deptDao);
    }
}
