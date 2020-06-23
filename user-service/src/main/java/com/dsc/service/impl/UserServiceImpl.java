package com.dsc.service.impl;

import com.dsc.mapper.UserMapper;
import com.dsc.service.UserService;
import com.dsc.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author ：duanshaochu
 * @date ：Created in 2020/6/23 15:01
 * @description：
 * @modified By：
 */
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserVo> findAll() {
        log.info("execute userMapper.findAll");
        List<UserVo> userVoList = userMapper.findAll();
        log.info("findAll result is {}",userVoList);
        return userMapper.findAll();
    }
}
