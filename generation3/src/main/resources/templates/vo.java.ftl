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
@ApiModel(value = "${entity}Vo对象", description = "${table.comment!}")
</#if>
public class ${entity}Vo extends ${entity}Dto {

}
