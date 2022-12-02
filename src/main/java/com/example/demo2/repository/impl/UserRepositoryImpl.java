package com.example.demo2.repository.impl;

import cn.hutool.core.bean.BeanUtil;
import com.example.demo2.entity.UserEntity;
import com.example.demo2.repository.UserRepositoryService;
import com.example.demo2.repository.dataobject.UserDO;
import com.example.demo2.repository.mapperService.UserMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @Author AO Jm
 * Created on 2022/12/2 13:36
 */
@Repository
public class UserRepositoryImpl implements UserRepositoryService {
    @Autowired
    private UserMapperService userMapperService;

    @Override
    public void addUser(UserEntity userEntity){
        UserDO userDO = BeanUtil.copyProperties(userEntity, UserDO.class);
        userMapperService.save(userDO);
    }

}