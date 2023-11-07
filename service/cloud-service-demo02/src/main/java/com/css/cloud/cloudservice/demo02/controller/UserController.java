package com.css.cloud.cloudservice.demo02.controller;

import com.css.cloud.cloudservice.demo02.client.UserServiceClient;
import com.css.cloud.common.beans.response.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author jiming.jing
 * @since 2023/06/24
 */
@Api(value = "用户管理", tags = {"用户管理"})
@RestController
@RequestMapping("/api/v1/cloud/service/demo02/user")
public class UserController {

    @Autowired
    UserServiceClient userServiceClient;

    @ApiOperation(value = "查询用户", notes = "根据用户ID查询用户信息")
    @GetMapping("/getById/{id}")
    public JsonResult getById(@PathVariable("id") String id) {
        return this.userServiceClient.getById(id);
    }
}
