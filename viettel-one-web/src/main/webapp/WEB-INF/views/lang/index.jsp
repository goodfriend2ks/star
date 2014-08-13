<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!-- Content Header (Page header) -->
<section class="content-header">
	<h1><spring:message code='label.lang.bean'/>
        <small>Control panel</small>
	</h1>
    <ol class="breadcrumb">
    	<li><a href="#"><i class="fa fa-book"></i> <spring:message code='label.home'/></a></li>
        <li class="active"><spring:message code='label.lang.bean'/></li>
	</ol>
</section>

<!-- Main content -->
<section class="content">
	<div class="box box-solid">
		<div class="box-body table-responsive">
			<div id="toolbar-lang">
				<a href="javascript:void(0)" class="btn btn-default btn-flat" plain="true" onclick="newBean()">
		        	<i class="fa fa-plus"></i>
		        	<spring:message code='label.new'/>
		        </a>
		        <a href="javascript:void(0)" class="btn btn-default btn-flat" plain="true" onclick="editBean()">
		        	<i class="fa fa-edit"></i>
		        	<spring:message code='label.edit'/>
		        </a>
		        <a href="javascript:void(0)" class="btn btn-default btn-flat" plain="true" onclick="destroyBean()">
		        	<i class="fa fa-minus"></i>
		        	<spring:message code='label.destroy'/>
		        </a>
		        
		        <div class="btn-group">
					<button type="button" class="btn btn-default btn-flat">Action</button>
					<button type="button" class="btn btn-default btn-flat dropdown-toggle" data-toggle="dropdown">
						<span class="caret"></span>
						<span class="sr-only">Toggle Dropdown</span>
					</button>
					<ul class="dropdown-menu" role="menu">
						<li><a href="#">Action</a></li>
						<li><a href="#">Another action</a></li>
						<li><a href="#">Something else here</a></li>
						<li class="divider"></li>
						<li><a href="#">Separated link</a></li>
					</ul>
				</div>
			</div>
			<table id="dg-lang" toolbar="#toolbar-lang" idcolumn="id" rownum="true" 
					class="table table-bordered table-condensed table-hover">
				<thead>
					<tr>
						<th field="rownum" row-class="rownum" sort="false" class="center" style="width:10px;">&nbsp;</th>
						<th field="code" row-class="center nowrap" class="center">
							<spring:message code='label.lang.code'/>
						</th>
						<th field="name" row-class="center nowrap" class="center">
							<spring:message code='label.lang.name'/>
						</th>
						<th field="datePattern" row-class="center nowrap" class="center">
							<spring:message code='label.lang.datepattern'/>
						</th>
						<th field="timePattern" row-class="center nowrap" class="center">
							<spring:message code='label.lang.timepattern'/>
						</th>
						<!-- <th field="dateTimePattern" row-class="center nowrap" class="center">Date Time Pattern</th> -->
						<th field="decimalPoint" sType="boolean" row-class="center nowrap" class="center">
							<spring:message code='label.lang.decimalpoint'/>
						</th>
						<th field="created" formatter="formatDateTime" row-class="right nowrap" style="text-align: center;">
							<spring:message code='label.bean.created' />
						</th>
						<th field="updated" formatter="formatDateTime" row-class="right nowrap" style="text-align: center;">
							<spring:message code='label.bean.updated' />
						</th>
					</tr>
				</thead>
				<tbody></tbody>
			</table>
		</div>
	</div>
	
	<%@include file="form.jsp"%>
	 
	<div id="error_message"></div>
</section>

<script type="text/javascript">
	beanRequestMappingUrl = "${pageContext.request.contextPath}/api/lang";
	
	beanDatagridId = "dg-lang";
	beanDialogId = "dlg-lang";
	beanFormId = "fm-lang";

	<spring:message code="label.lang.bean.lower" var="beanName" />
	
	dialogNewTitle = "<spring:message code='label.lang.new'/>";
	dialogEditTitle = "<spring:message code='label.lang.edit'/>";
	dialogDeleteTitle = "<spring:message code='label.confirm'/>";
	dialogDeleteMsg = "<spring:message code='label.message.destroy' arguments='${beanName}' />";
	
	//$(function(){
		loadBeans(true);
		initForm();
	//});
</script>