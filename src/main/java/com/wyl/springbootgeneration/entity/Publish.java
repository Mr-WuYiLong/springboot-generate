package com.wyl.springbootgeneration.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 公布公报
 * </p>
 *
 * @author wuyilong
 * @since 2020-09-04
 */
@Data
@Accessors(chain = true)
public class Publish implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 申请号
     */
    private String applyId;

    /**
     * 申请公布号
     */
    private String publishId;

    /**
     * 申请日
     */
    private String applyDate;

    /**
     * 申请公布日
     */
    private String applyPublishDate;

    /**
     * 发明名称
     */
    private String title;

    /**
     * 国际专利分类号
     */
    private String classificationId;

    /**
     * 发明人
     */
    private String inventor;

    /**
     * 申请人
     */
    private String applicant;

    /**
     * 地址
     */
    private String address;

    /**
     * 代理机构
     */
    private String agency;

    /**
     * 代理人
     */
    private String agent;

    /**
     * 专利类参考文献
     */
    private String patentReferences;

    /**
     * 期刊类参考文献
     */
    private String periodicalReferences;

    /**
     * 审查员姓名
     */
    private String examinerName;

    /**
     * 进入国家阶段日期
     */
    private String nationalPhaseDate;

    /**
     * 国际申请
     */
    private String internationalApplication;

    /**
     * 国际公布
     */
    private String internationalPublication;


}
