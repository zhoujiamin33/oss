package com.example.demo2.service.impl;

import cn.hutool.crypto.SecureUtil;
import com.example.demo2.entity.UserEntity;
import com.example.demo2.enums.BusinessCodeEnum;
import com.example.demo2.repository.UserRepositoryService;
import com.example.demo2.repository.impl.UserRepositoryImpl;
import com.example.demo2.service.UserService;
import com.example.demo2.util.BusinessCodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @version 1.0
 * @Author AO Jm
 * Created on 2022/9/2 15:23
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepositoryService userRepositoryService;
    @Override
    public List<UserEntity> getUser() {
        return null;
    }

    @Override
    public void addUser(UserEntity userEntity) {
        userEntity.setUserCode(BusinessCodeGenerator.getGeneratorCode(BusinessCodeEnum.ENT_MEMBER));
        userEntity.setCreateTime(LocalDateTime.now());
        userEntity.setUpdateTime(LocalDateTime.now());
        // TODO: 2022/12/5 权限获取当前登录用户的Id 
        userEntity.setCreateUser(1L);
        userEntity.setUpdateUser(1L);
        userEntity.setPassword(SecureUtil.md5(userEntity.getPassword()));
        userRepositoryService.addUser(userEntity);
    }

}