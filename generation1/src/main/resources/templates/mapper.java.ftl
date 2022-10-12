package ${package.Mapper};

import org.apache.ibatis.annotations.Mapper;
import ${package.Entity}.${entity};
import ${superMapperClassPackage};

/**
 * @Description ${table.comment!} 接口
 * @Author ${author}
 * @Date ${date}
 */
<#if kotlin>
interface ${table.mapperName} : ${superMapperClass}<${entity}>
<#else>
 @Mapper
public interface ${table.mapperName} extends ${superMapperClass}<${entity}> {

}
</#if>
