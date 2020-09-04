package com.wyl.springbootgeneration.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 已存在的号码
 * </p>
 *
 * @author wuyilong
 * @since 2020-09-04
 */
@Data
@Accessors(chain = true)
public class Existence implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 已经入库的xml的号码
     */
    private String number;


}
