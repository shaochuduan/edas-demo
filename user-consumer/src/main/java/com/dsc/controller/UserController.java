package com.dsc.controller;

import com.dsc.service.UserService;
import com.dsc.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：duanshaochu
 * @date ：Created in 2020/6/23 15:10
 * @description：
 * @modified By：
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/show")
    public String show(){
        log.info("start request show");
        return "show";
    }

    @RequestMapping("/showAll")
    public List<UserVo> showAll(){
        log.info("start request showAll");
        log.info("start execute userService findAll function");
        List<UserVo> userVoList = userService.findAll();
        log.info("end execute userService findAll function,response result is {}",userVoList);
        return userVoList;
    }
}
