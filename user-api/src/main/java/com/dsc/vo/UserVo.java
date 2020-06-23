package com.dsc.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：duanshaochu
 * @date ：Created in 2020/6/23 14:47
 * @description：
 * @modified By：
 */
@Data
public class UserVo implements Serializable {
    private Long userId;
    private String userName;
    private String userAddress;
}
