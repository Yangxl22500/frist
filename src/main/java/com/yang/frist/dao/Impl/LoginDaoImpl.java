package com.yang.frist.dao.Impl;

import com.yang.frist.dao.LoginDao;
import com.yang.frist.entity.SysUser;
import com.yang.frist.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LoginDaoImpl implements LoginDao {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public List<SysUser> login(SysUser user) {
        return loginMapper.login();
    }
}
