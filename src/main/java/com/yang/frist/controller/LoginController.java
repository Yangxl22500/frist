package com.yang.frist.controller;

import com.yang.frist.dao.LoginDao;
import com.yang.frist.entity.SysUser;
import com.yang.frist.vo.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginDao loginDao;

    @RequestMapping(value = "/login", produces="application/json; charset=utf-8")
    @ResponseBody
    public AjaxResult login(SysUser user){
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setCode(0);
        List<SysUser> login = loginDao.login(user);
        ajaxResult.setData(login);
        return ajaxResult;
    }
}
