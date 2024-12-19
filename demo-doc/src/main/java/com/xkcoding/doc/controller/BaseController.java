package com.xkcoding.doc.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String test(){
        return "test";
    }

    @ApiOperation(value = "测试")
    @GetMapping("/test2")
    public String test2(){
        return "test2";
    }

}
