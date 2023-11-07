package com.css.cloud.cloudservice.demo01.mapper;

import com.css.cloud.cloudservice.demo01.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author jiming.jing
 * @since 2023/06/24
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
