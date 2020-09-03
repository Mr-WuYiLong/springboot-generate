package com.wyl.springbootgeneration.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 公布公报
 * </p>
 *
 * @author wuyilong
 * @since 2020-09-03
 */
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }
    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }
    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }
    public String getApplyPublishDate() {
        return applyPublishDate;
    }

    public void setApplyPublishDate(String applyPublishDate) {
        this.applyPublishDate = applyPublishDate;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(String classificationId) {
        this.classificationId = classificationId;
    }
    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }
    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }
    public String getPatentReferences() {
        return patentReferences;
    }

    public void setPatentReferences(String patentReferences) {
        this.patentReferences = patentReferences;
    }
    public String getPeriodicalReferences() {
        return periodicalReferences;
    }

    public void setPeriodicalReferences(String periodicalReferences) {
        this.periodicalReferences = periodicalReferences;
    }
    public String getExaminerName() {
        return examinerName;
    }

    public void setExaminerName(String examinerName) {
        this.examinerName = examinerName;
    }
    public String getNationalPhaseDate() {
        return nationalPhaseDate;
    }

    public void setNationalPhaseDate(String nationalPhaseDate) {
        this.nationalPhaseDate = nationalPhaseDate;
    }
    public String getInternationalApplication() {
        return internationalApplication;
    }

    public void setInternationalApplication(String internationalApplication) {
        this.internationalApplication = internationalApplication;
    }
    public String getInternationalPublication() {
        return internationalPublication;
    }

    public void setInternationalPublication(String internationalPublication) {
        this.internationalPublication = internationalPublication;
    }

    @Override
    public String toString() {
        return "Publish{" +
            "id=" + id +
            ", applyId=" + applyId +
            ", publishId=" + publishId +
            ", applyDate=" + applyDate +
            ", applyPublishDate=" + applyPublishDate +
            ", title=" + title +
            ", classificationId=" + classificationId +
            ", inventor=" + inventor +
            ", applicant=" + applicant +
            ", address=" + address +
            ", agency=" + agency +
            ", agent=" + agent +
            ", patentReferences=" + patentReferences +
            ", periodicalReferences=" + periodicalReferences +
            ", examinerName=" + examinerName +
            ", nationalPhaseDate=" + nationalPhaseDate +
            ", internationalApplication=" + internationalApplication +
            ", internationalPublication=" + internationalPublication +
        "}";
    }
}
