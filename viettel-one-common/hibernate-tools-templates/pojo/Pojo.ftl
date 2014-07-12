${pojo.getPackageDeclaration()}

/* 
 * Viettel.One Project Model Classes
 * Generated ${date} by Hibernate Tools ${version} 
 */

<#assign classbody>
<#include "PojoTypeDeclaration.ftl"/> {

	private static final long serialVersionUID = 1L;

<#if !pojo.isInterface()>
<#include "PojoFields.ftl"/>

<#include "PojoConstructors.ftl"/>
   
<#include "PojoPropertyAccessors.ftl"/>

<#include "PojoToString.ftl"/>

<#include "PojoEqualsHashcode.ftl"/>

<#else>
<#include "PojoInterfacePropertyAccessors.ftl"/>

</#if>
<#include "PojoExtraClassCode.ftl"/>

<#include "PojoToString.ftl"/>

}
</#assign>

${pojo.generateImports()}
${classbody}

