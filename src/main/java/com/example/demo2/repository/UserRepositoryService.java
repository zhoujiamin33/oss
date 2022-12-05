package com.example.demo2.repository;

import com.example.demo2.entity.UserEntity;

/**
 * @version 1.0
 * @Author AO Jm
 * Created on 2022/12/2 14:04
 */
public interface UserRepositoryService {

    /**
     * addUser
     * @param userEntity
     */
    void addUser(UserEntity userEntity);
}