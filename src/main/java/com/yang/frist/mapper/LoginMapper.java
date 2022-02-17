package com.yang.frist.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yang.frist.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper extends BaseMapper<SysUser> {

    List<SysUser> login();
}
