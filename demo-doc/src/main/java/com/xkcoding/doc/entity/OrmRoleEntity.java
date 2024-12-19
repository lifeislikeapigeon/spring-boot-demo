package com.xkcoding.doc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * Spring Boot Demo Orm 系列示例表
 * @TableName orm_role
 */
@TableName(value ="orm_role")
@Data
public class OrmRoleEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Integer id;

    /**
     * 角色名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 逻辑删除标记 1-已删除 0-未删除
     */
    @TableField(value = "delete_flag")
    private Integer deleteFlag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}