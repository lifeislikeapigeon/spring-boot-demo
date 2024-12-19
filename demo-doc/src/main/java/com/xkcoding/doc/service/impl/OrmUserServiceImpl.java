package com.xkcoding.doc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xkcoding.doc.entity.OrmUser;
import com.xkcoding.doc.service.OrmUserService;
import com.xkcoding.doc.mapper.OrmUserMapper;
import org.springframework.stereotype.Service;

/**
* @author chaoj
* @description 针对表【orm_user(Spring Boot Demo Orm 系列示例表)】的数据库操作Service实现
* @createDate 2024-12-19 16:01:34
*/
@Service("ormUserService")
public class OrmUserServiceImpl extends ServiceImpl<OrmUserMapper, OrmUser>
    implements OrmUserService{

}




