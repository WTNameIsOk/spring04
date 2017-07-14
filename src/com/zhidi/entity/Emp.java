package com.zhidi.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by lx on 2017/7/4.
 */

@Entity
@Table(name = "emp")
public class Emp {

    @Id//标识该字段为主键属性
    @GeneratedValue(strategy = GenerationType.AUTO)//和xml文件native作用一样
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    @Temporal(TemporalType.DATE)//指定时间类型
    private Date hiredate;
    private BigDecimal sal;
    @ManyToOne//<many-to-one>
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "deptno")//<many-to-one column="deptno">
    private Dept dept;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
