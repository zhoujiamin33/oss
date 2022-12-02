package com.example.demo2.service.impl;

import com.example.demo2.entity.UserEntity;
import com.example.demo2.repository.UserRepositoryService;
import com.example.demo2.repository.impl.UserRepositoryImpl;
import com.example.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        userRepositoryService.addUser(userEntity);
    }

}