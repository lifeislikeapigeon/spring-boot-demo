package com.xkcoding.doc.mapper;

import com.xkcoding.doc.entity.OrmRoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author chaoj
* @description 针对表【orm_role(Spring Boot Demo Orm 系列示例表)】的数据库操作Mapper
* @createDate 2024-12-19 19:30:55
* @Entity com.xkcoding.doc.entity.OrmRoleEntity
*/

@Mapper
public interface OrmRoleMapper extends BaseMapper<OrmRoleEntity> {

}




