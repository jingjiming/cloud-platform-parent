package com.css.cloud.cloudservice.demo01.service.impl;

import com.css.cloud.cloudservice.demo01.entity.User;
import com.css.cloud.cloudservice.demo01.mapper.UserMapper;
import com.css.cloud.cloudservice.demo01.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.css.cloud.common.beans.response.JsonResult;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author jiming.jing
 * @since 2023/06/24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public JsonResult add(User user) {
        boolean flag = this.saveOrUpdate(user);
        if (flag) {
            return JsonResult.ok();
        }
        return JsonResult.badRequest();
    }

    @Override
    public JsonResult<User> findById(String id) {
        return JsonResult.ok(this.getById(id));
    }


}
