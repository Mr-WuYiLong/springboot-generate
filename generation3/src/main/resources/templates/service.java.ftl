package ${package.Service};

import ${package.Entity}.${entity};
import ${superServiceClassPackage};

/**
* @Description ${table.comment}
* @Author ${author}
* @Date ${date}
*/
<#if kotlin>
interface ${table.serviceName} : ${superServiceClass}<${entity}>
<#else>
public interface ${table.serviceName} extends ${superServiceClass}<${entity}> {

}
</#if>
