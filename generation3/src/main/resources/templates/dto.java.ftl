package  com.wyl.business.dto;
<#if swagger>
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
</#if>
<#if entityLombokModel>
import lombok.Data;
    <#if chainModel>
import lombok.experimental.Accessors;
    </#if>
</#if>
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Description ${table.comment}
 * @Author ${author}
 * @Date ${date}
 */
@Data
<#if swagger>
@ApiModel(value = "${entity}Dto对象", description = "${table.comment!}")
</#if>
public class ${entity}Dto implements Serializable {

    private static final long serialVersionUID = 1L;
<#-- ----------  BEGIN 字段循环遍历  ---------->
<#list table.fields as field>
    <#if field.keyFlag>
        <#assign keyPropertyName="${field.propertyName}"/>
    </#if>

    <#if field.comment!?length gt 0>
        <#if swagger>
    @ApiModelProperty("${field.comment}")
        <#else>
    /**
     * ${field.comment}
     */
        </#if>
    </#if>
    private ${field.propertyType} ${field.propertyName};
</#list>
<#------------  END 字段循环遍历  ---------->
}
