package com.xkcoding.doc.mapper;

import com.xkcoding.doc.entity.OrmUserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author chaoj
* @description 针对表【orm_user(Spring Boot Demo Orm 系列示例表)】的数据库操作Mapper
* @createDate 2024-12-19 17:21:55
* @Entity com.xkcoding.doc.entity.OrmUserEntity
*/

@Mapper
public interface OrmUserMapper extends BaseMapper<OrmUserEntity> {

}




