package com.newmoonnovel.novel.user.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author longw
 * @since 2021-03-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id")
    @TableId(value = "UserId", type = IdType.AUTO)
    private Integer UserId;

    @ApiModelProperty(value = "用户名/账号")
    @TableField("UserName")
    private String UserName;

    @ApiModelProperty(value = "用户密码")
    @TableField("UserPass")
    private String UserPass;

    @ApiModelProperty(value = "用户类型")
    @TableField("UserType")
    private String UserType;

    @ApiModelProperty(value = "用户等级")
    @TableField("UserLevel")
    private String UserLevel;

    @ApiModelProperty(value = "账号状态")
    @TableField("UserState")
    private String UserState;

    @ApiModelProperty(value = "乐观锁")
    @TableField("Version")
    private Integer Version;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "GmtCreate", fill = FieldFill.INSERT)
    private Date GmtCreate;

    @ApiModelProperty(value = "修改时间")
    @TableField(value = "GmtModified", fill = FieldFill.INSERT_UPDATE)
    private Date GmtModified;

    @ApiModelProperty(value = "逻辑删除")
    @TableField("DelTag")
    @TableLogic
    private Integer DelTag;


}
