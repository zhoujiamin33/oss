package com.example.demo2.adapter;


import com.example.demo2.entity.UserEntity;
import com.example.demo2.enums.BusinessCodeEnum;
import com.example.demo2.service.UserService;
import com.example.demo2.util.BusinessCodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;

import lombok.extern.slf4j.Slf4j;

/**
 * 凌晨定时任务过期用户优惠券
 * <p>
 * 用户优惠券过期后，修改状态成已过期
 *
 * @author Staryeah
 * @date 2022/11/19 16:27
 **/
@Component
@Slf4j
public class AddUserExpiredJob {

    @Autowired
    private UserService userService;

    @XxlJob("addUserJob")
    public ReturnT<String> execute() {
        log.info(">>>>>>>>>>>>>>>addUser expired xxl-job beginning...");

        userService.addUser(UserEntity.builder().userCode(BusinessCodeGenerator.getGeneratorCode(BusinessCodeEnum.ENT_MEMBER)).build());

        return ReturnT.SUCCESS;
    }
}
