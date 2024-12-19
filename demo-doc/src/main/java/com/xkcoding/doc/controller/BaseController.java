package com.xkcoding.doc.controller;

import com.xkcoding.doc.entity.OrmUserEntity;
import com.xkcoding.doc.service.OrmUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：
 *
 * @author lichen
 * @date 2024/12/19 11:08
 */

@Api(tags = "系统基础", value = "base")
@RestController
@RequestMapping("/base")
@Slf4j
public class BaseController {
    @Resource
    private OrmUserService ormUserService;


    @ApiOperation(value = "获取用户信息")
    @GetMapping("/getUserList")
    public List<OrmUserEntity> getUserList() {
        return ormUserService.list();
    }


}
