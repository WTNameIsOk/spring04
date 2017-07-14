package com.zhidi.service.impl;

import com.zhidi.dao.EmpDao;
import com.zhidi.entity.Emp;
import com.zhidi.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/7/14.
 */
@Service
public class EmpServiceImpl extends BaseServiceImpl<Emp, Integer> implements EmpService {
    @Resource
    private EmpDao empDao;//用来拓展emp的方法

    /**
     * 设置父类的baseDao
     * @param empDao
     */
    @Resource
    public void setBaseDao(EmpDao empDao) {
        super.setBaseDao(empDao);
    }
}
