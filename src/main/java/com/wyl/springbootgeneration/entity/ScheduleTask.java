package com.wyl.springbootgeneration.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Description 定时任务表
 * @Author wuyilong
 * @Date 2020-12-30
 */
@Data
@Accessors(chain = true)
@TableName("d_schedule_task")
@Entity
@Table(name="d_schedule_task")
public class ScheduleTask implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "cron_id", type = IdType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cronId;

    /**
     * 定时任务完整类名
     */
    @TableField("cron_key")
    private String cronKey;

    /**
     * cron表达式
     */
    @TableField("cron_expression")
    private String cronExpression;

    /**
     * 任务描述
     */
    @TableField("task_explain")
    private String taskExplain;

    /**
     * 状态,1:正常;2:停用
     */
    @TableField("status")
    private Integer status;


}
