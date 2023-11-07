package com.css.cloud.cloudservice.demo01.controller;

import com.css.cloud.cloudservice.demo01.entity.User;
import com.css.cloud.cloudservice.demo01.service.UserService;
import com.css.cloud.common.beans.response.JsonResult;
import com.netflix.discovery.converters.Auto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
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
@RequestMapping("/api/v1/cloud/service/demo01/user")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "添加用户", notes = "添加用户")
    @PostMapping("/add")
    public JsonResult<Boolean> add(@RequestBody User user) {
        return this.userService.add(user);
    }

    @ApiOperation(value = "查询用户", notes = "根据用户ID查询用户信息")
    @GetMapping("/getById/{id}")
    public JsonResult<User> getById(@PathVariable("id") String id) {
        return this.userService.findById(id);
    }
}
