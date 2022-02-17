package com.yang.frist;

import com.yang.frist.dao.LoginDao;
import com.yang.frist.entity.SysUser;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
class FristApplicationTests {

    @Autowired
    private LoginDao loginDao;
    @Test
    void contextLoads(SysUser user) {
        List<SysUser> login = loginDao.login(user);
        System.out.println(login.get(0).getLoginname());
    }

}
