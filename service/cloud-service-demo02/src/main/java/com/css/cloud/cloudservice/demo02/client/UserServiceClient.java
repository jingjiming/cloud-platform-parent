package com.css.cloud.cloudservice.demo02.client;

import com.css.cloud.common.beans.response.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by jiming.jing on 2023/6/26.
 */
@FeignClient(name = "cloud-service-demo01")
public interface UserServiceClient {

    @GetMapping("/cloud-service-demo01/api/v1/cloud/service/demo01/user/getById/{id}")
    JsonResult getById(@PathVariable("id") String id);
}
