package com.example.demo2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo2.entity.UserEntity;
import com.example.demo2.repository.dataobject.UserDO;

import java.util.List;

/**
 * @version 1.0
 * @Author AO Jm
 * Created on 2022/9/2 15:08
 */
public interface UserMapper extends BaseMapper<UserDO> {
    /**
     * getUser
     * @return
     */
    List<UserEntity> getUser();
}