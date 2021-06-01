package com.wyl.springbootgeneration.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import javax.persistence.*;
import com.baomidou.mybatisplus.annotation.IdType;
import javax.persistence.*;
import java.util.Date;
import javax.persistence.*;
import com.baomidou.mybatisplus.annotation.TableId;
import javax.persistence.*;
import com.baomidou.mybatisplus.annotation.TableField;
import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
    import javax.persistence.*;

/**
 * @Description 
 * @Author wuyilong
 * @Date 2021-05-17
 */
@Data
@Accessors(chain = true)
@TableName("d_park_home_data_config")
@Entity
@Table(name="d_park_home_data_config")
public class ParkHomeDataConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @TableField("create_time")
    private Date createTime;

    @TableField("create_user_id")
    private Long createUserId;

    @TableField("deleted")
    private Integer deleted;

    @TableField("department_id")
    private Long departmentId;

    @TableField("update_time")
    private Date updateTime;

    @TableField("update_user_id")
    private Long updateUserId;

    @TableField("uuid")
    private String uuid;

    @TableField("version")
    private Integer version;

    @TableField("park_base_data_json")
    private String parkBaseDataJson;

    @TableField("park_map_json")
    private String parkMapJson;

    @TableField("module1")
    private String module1;

    @TableField("module2")
    private String module2;

    @TableField("module3")
    private String module3;

    @TableField("module4")
    private String module4;

    @TableField("module5")
    private String module5;

    @TableField("module6")
    private String module6;

    @TableField("module7")
    private String module7;

    @TableField("module8")
    private String module8;

    @TableField("park_other_json")
    private String parkOtherJson;


}
