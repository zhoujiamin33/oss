package com.example.demo2.service;

import com.example.demo2.entity.UserEntity;
import org.apache.xmlbeans.impl.xb.xsdschema.Attribute;

import java.util.List;

/**
 * @version 1.0
 * @Author AO Jm
 * Created on 2022/9/2 15:18
 */
public interface UserService {
    /**
     * getUser
     * @return
     */
    List<UserEntity> getUser();

    /**
     * adduser
     * @param userEntity
     */
    void addUser(UserEntity userEntity);
}