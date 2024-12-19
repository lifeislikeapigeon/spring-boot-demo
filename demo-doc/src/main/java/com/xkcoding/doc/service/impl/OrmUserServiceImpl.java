package com.xkcoding.doc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xkcoding.doc.entity.OrmUserEntity;
import com.xkcoding.doc.service.OrmUserService;
import com.xkcoding.doc.mapper.OrmUserMapper;
import org.springframework.stereotype.Service;

/**
* @author chaoj
* @description 针对表【orm_user(Spring Boot Demo Orm 系列示例表)】的数据库操作Service实现
* @createDate 2024-12-19 17:21:55
*/
@Service
public class OrmUserServiceImpl extends ServiceImpl<OrmUserMapper, OrmUserEntity>
    implements OrmUserService{

}




