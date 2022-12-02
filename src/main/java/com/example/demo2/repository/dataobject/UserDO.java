package com.example.demo2.repository.dataobject;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * 用户表
 *
 * @author xuwei
 */

/**
 * 用户表
 *
 * @author xuwei
 */
@Data
@TableName("t_user")
public class UserDO {
    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 企业编码
     */
    @TableField("user_code")
    private String userCode;

    /**
     * 用户姓名
     */
    @TableField("user_name")
    private String userName;

    /**
     * 用户昵称
     */
    @TableField("english_name")
    private String englishName;

    @TableField("short_name")
    private String shortName;

    /**
     * 用户手机号
     */
    @TableField("mobile")
    private String mobile;

    /**
     * 用户邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 状态
     */
    @TableField("user_type")
    private Integer userType;

    /**
     * 状态
     */
    @TableField("status")
    private String status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 创建人
     */
    @TableField(value = "create_user", fill = FieldFill.INSERT)
    private Long createUser;

    /**
     * 更新人
     */
    @TableField(value = "update_user", fill = FieldFill.INSERT_UPDATE)
    private Long updateUser;

    /**
     * 0 未删除 1已删除
     */
    @TableField("deleted")
    @TableLogic
    private Integer deleted;
    /**
     * 最后登入时间
     */
    @TableField(value = "last_login_time")
    private LocalDateTime lastLoginTime;


    /**
     * 头像
     */
    @TableField(value = "head_portrait")
    private String headPortrait;
    /**
     * 街道地址
     */
    @TableField(value = "street_address")
    private String streetAddress;
}
