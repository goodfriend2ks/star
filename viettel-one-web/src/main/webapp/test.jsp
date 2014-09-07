<%-- 
    Document   : header
    Created on : 13/06/2014, 15:17:32
    Author     : GoodFriend2ks
--%>

<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html style="height: 100%;">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<title>Viettel.One</title>
	
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap-2.3.2.css" rel="stylesheet" type="text/css" />
	<%-- <link href="${pageContext.request.contextPath}/styles/bootstrap/font-awesome.css" rel="stylesheet" type="text/css" /> --%>
	<%-- <link href="${pageContext.request.contextPath}/styles/bootstrap/ionicons.css" rel="stylesheet" type="text/css" /> --%>
	<%-- <link href="${pageContext.request.contextPath}/styles/bootstrap/AdminLTE.css" rel="stylesheet" type="text/css" /> --%>
	
	<link href="${pageContext.request.contextPath}/styles/bootstrap/chosen.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap.multiselect.css" rel="stylesheet" type="text/css" />
	
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap-responsive-2.3.2.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap-modal.css" rel="stylesheet" type="text/css" />
	
	<script src="${pageContext.request.contextPath}/js/jquery/jquery.min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/jquery/jquery.ext.js" type="text/javascript"></script>
</head>

<body class="skin-blue">
	<br/>
	<div class="row" stylexxx="overflow: auto;">
		<div class="col-lg-4">
			<button>XXXXXXXXXXXXX</button>
		</div>
		<div class="col-lg-4">
			<select id="language_IDx" name="language_IDx" 
				data-placeholder="Ch&#7885;n ng&#244;n ng&#7919;" 
				class="form-control chzn-select-deselect">
					<option value="vi-VN">Ti&#7871;ng Vi&#7879;t</option>
					<option value="en-US">English</option>
			</select>
		</div>
		<div class="col-lg-4">
			<button>YYYYYYYYYYYYYYYYYYYY</button>
		</div>
	</div>
	<br/><br/>
	
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap.min.js" type="text/javascript"></script>
	
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap-modal.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap-modalmanager.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap/chosen.jquery.js" type="text/javascript"></script>
	<%-- <script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap-multiselect.js" type="text/javascript"></script> --%>
	
	<script type="text/javascript">
		$(function() {
			// select
		    $(".chzn-select").chosen({
		        allow_single_deselect: false,
		        width: '100%'
		    });
			
		    $(".chzn-select-deselect").chosen({
		        allow_single_deselect: true,
		        width: '100%'
		    });
		    
		    // multiselect
		    $('.multiselect').multiselect();
		});
	</script>
</body>
</html>