package com.css.cloud.cloudservice.demo01.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author jiming.jing
 * @since 2023/06/24
 */
@Getter
@Setter
@TableName("T_USER")
@ApiModel(value = "User对象", description = "用户表")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    @TableId(value = "ID", type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty("姓名")
    @TableField("USER_NAME")
    private String userName;

    @ApiModelProperty("密码")
    @TableField("PASSWD")
    private String passwd;

    @ApiModelProperty("出生日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField("BIRTH_OF_DATE")
    private Date birthOfDate;

    @ApiModelProperty("性别 0-未知 1-男 2-女")
    @TableField("GENDER")
    private Integer gender;

    @ApiModelProperty("身份证号")
    @TableField("IDENTITY_CARD")
    private String identityCard;

    @ApiModelProperty("创建日期")
    @TableField(value = "CREATE_TIME", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty("创建人")
    @TableField("CREATOR")
    private String creator;

    @ApiModelProperty("最后修改日期")
    @TableField(value = "LAST_TIME", fill = FieldFill.INSERT_UPDATE)
    private Date lastTime;

    @ApiModelProperty("最后修改人")
    @TableField("LAST_EDITOR")
    private String lastEditor;

    @ApiModelProperty("删除标识 0-未删除 1-已删除")
    @TableField("DEL_FLAG")
    @TableLogic
    private Integer delFlag;


}
