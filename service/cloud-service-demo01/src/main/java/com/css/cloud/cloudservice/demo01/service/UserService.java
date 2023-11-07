package com.css.cloud.cloudservice.demo01.service;

import com.css.cloud.cloudservice.demo01.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.css.cloud.common.beans.response.JsonResult;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author jiming.jing
 * @since 2023/06/24
 */
public interface UserService extends IService<User> {

    JsonResult add(User user);

    JsonResult<User> findById(String id);

}
