package com.dsc.mapper;

import com.dsc.vo.UserVo;

import java.util.List;

public interface UserMapper {
    List<UserVo> findAll();
}
