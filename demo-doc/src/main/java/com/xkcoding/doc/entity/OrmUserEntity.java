package com.xkcoding.doc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Spring Boot Demo Orm 系列示例表
 * @TableName orm_user
 */
@TableName(value ="orm_user")
@Data
public class OrmUserEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Integer id;

    /**
     * 用户名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 加密后的密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 加密使用的盐
     */
    @TableField(value = "salt")
    private String salt;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 手机号码
     */
    @TableField(value = "phone_number")
    private String phoneNumber;

    /**
     * 状态，-1：逻辑删除，0：禁用，1：启用
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 上次登录时间
     */
    @TableField(value = "last_login_time")
    private Date lastLoginTime;

    /**
     * 上次更新时间
     */
    @TableField(value = "last_update_time")
    private Date lastUpdateTime;

    /**
     * 逻辑删除标记 1-已删除 0-未删除
     */
    @TableField(value = "delete_flag")
    private Integer deleteFlag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}