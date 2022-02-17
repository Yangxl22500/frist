package com.yang.frist.dao;

import com.yang.frist.entity.SysUser;

import java.util.List;

public interface LoginDao {

    public List<SysUser> login(SysUser user);
}
