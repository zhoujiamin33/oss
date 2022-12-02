package com.example.demo2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @version 1.0
 * @Author AO Jm
 * Created on 2022/9/2 14:50
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    /**
     * 用户编码
     */
    private Long userId;
    /**
     * 用户代码
     */
    private String userCode;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 英文名称
     */
    private String englishName;

    /**
     * 简称
     */
    private String shortName;
    /**
     * 创建人
     */
    private Long createUser;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 修改人
     */
    private Long updateUser;
    /**
     * 修改时间
     */
    private LocalDateTime updateTime;
    /**
     * 是否删除
     */
    private Integer deleted;
    /**
     * 乐观锁
     */
    private Integer version;

}