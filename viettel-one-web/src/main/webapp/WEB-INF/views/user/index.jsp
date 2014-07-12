<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<script src="${pageContext.request.contextPath}/js/jquery-fileupload/vendor/jquery.ui.widget.js" type="text/javascript"></script>
<%-- <script src="${pageContext.request.contextPath}/js/jquery-fileupload/jquery.iframe-transport.js" type="text/javascript"></script> --%>
<script src="${pageContext.request.contextPath}/js/jquery-fileupload/jquery.fileupload.js" type="text/javascript"></script>

<!-- Content Header (Page header) -->
<section class="content-header">
	<h1>User
        <small>Control panel</small>
        <%-- <a href="user/report" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-print'">PDF <spring:message code="label.report" /></a> --%>
	</h1>
    <ol class="breadcrumb">
    	<li><a href="#"><i class="fa fa-user"></i> Home</a></li>
        <li class="active">User</li>
	</ol>
</section>

<!-- Main content -->
<section class="content">
	<div class="box box-solid">
		<div class="box-body table-responsive">
			<div id="toolbar-user">
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
					<button type="button" class="btn btn-default btn-flat" onclick="openUploadFile(true)">Action</button>
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
			<table id="dg-user" toolbar="#toolbar-user" idcolumn="id" rownum="true" 
					class="table table-bordered table-condensed table-hover">
				<thead>
					<tr>
						<th field="rownum" row-class="nowrap rownum" sort="false" style="text-align: center; width:10px;">&nbsp;</th>
						<!-- <th field="key.id" row-class="nowrap" style="text-align: center;">ID</th>
						<th field="ad_Client_ID" row-class="nowrap" style="text-align: center;">Client</th> -->
						<th field="userName" row-class="center nowrap" style="text-align: center;">User Name</th>
						<th field="name" row-class="center nowrap" style="text-align: center;">Full Name</th>
						<th field="dob" formatter="formatDate" sType="date-euro" row-class="center nowrap" style="text-align: center;">DOB</th>
						<th field="email" row-class="center nowrap" style="text-align: center;">Email</th>
						<th field="created" formatter="formatDateTime" row-class="right nowrap" style="text-align: center;">Created</th>
						<th field="updated" formatter="formatDateTime" row-class="right nowrap" style="text-align: center;">Updated</th>
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
	beanRequestMappingUrl = "${pageContext.request.contextPath}/api/user";
	
	beanDatagridId = "dg-user";
	beanDialogId = "dlg-user";
	beanFormId = "fm-user";
	
	dialogNewTitle = "<spring:message code='label.new'/> User";
	dialogEditTitle = "<spring:message code='label.edit'/> User";
	dialogDeleteTitle = "<spring:message code='label.confirm'/>";
	dialogDeleteMsg = "<spring:message code='label.message.destroy' arguments='person' />";

	$(function(){
		loadBeans(true);
		initForm();
	});
</script>