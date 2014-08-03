<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html style="height: 100%;">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/logo.png">
	<title>Viettel.One</title>
		
	<link href="${pageContext.request.contextPath}/styles/application.css" rel="stylesheet" type="text/css" media="screen" />
	<!-- bootstrap 3.0.2 -->
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css" />
	<!-- font Awesome -->
	<link href="${pageContext.request.contextPath}/styles/bootstrap/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<!-- Ionicons -->
	<link href="${pageContext.request.contextPath}/styles/bootstrap/ionicons.css" rel="stylesheet" type="text/css" />
	<!-- Theme style -->
	<link href="${pageContext.request.contextPath}/styles/bootstrap/AdminLTE.css" rel="stylesheet" type="text/css" />
		
	<!-- Theme style -->
	<link href="${pageContext.request.contextPath}/styles/bootstrap/themes/blue.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/styles/bootstrap/themes/black.css" rel="stylesheet" type="text/css" />
		
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap.dialog.css" rel="stylesheet" type="text/css" />
		
	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
	<![endif]-->
		
	<script src="${pageContext.request.contextPath}/js/url.js" type="text/javascript"></script>
	<script type="text/javascript">
		CONTEXT_PATH = "${pageContext.request.contextPath}";
	</script>
        	
	<script src="${pageContext.request.contextPath}/js/application.js" type="text/javascript"></script>
	<script type="text/javascript">
		PERSONAL_DATE_FORMAT = "DD/MM/YYYY";
		PERSONAL_DATE_TIME_FORMAT = "DD/MM/YYYY HH:mm:ss";
	</script>
        
	<!-- JQuery -->
	<script src="${pageContext.request.contextPath}/js/jquery.min.js" type="text/javascript"></script>
	<!-- JQuery Shortcut -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/jquery.hotkeys.js" type="text/javascript"></script>
		
	<script src="${pageContext.request.contextPath}/js/store.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/oauth2.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/sha256.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/enc-base64-min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/cookie.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/user.js" type="text/javascript"></script>
</head>
<body class="bg-blue">
	<div class="form-box" id="login-box">
		<div class="header">
			<h3 class="title">Sign In</h3>
		</div>
		<form action="#" method="post">
			<div class="body">
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<i class="fa fa-user"></i>
						</div>
						<input type="text" class="form-control" id="username" 
								placeholder="User ID" data-options="required:true" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<i class="fa fa-key"></i>
						</div>
						<input type="password" class="form-control" id="password" 
								placeholder="Password" data-options="required:true" />
					</div>
				</div>
				
				<div class="form-group">
					<input type="checkbox" class="flat-red" id="rememberMe"/> Remember me
				</div>
			</div>
			
			<div class="footer">
				<a href="javascript:void(0)" class="btn btn-block btn-flat bg-olive" onclick="doLogin()">Sign me in</a>
				<!-- <a href="javascript:void(0)" class="btn btn-flat" onclick="clearForm()">Clear</a> -->
				<p><a href="#">I forgot my password</a></p>
				
				<a href="${pageContext.request.contextPath}/register.jsp" class="text-center">Register a new membership</a>
			</div>
		</form>
		
		<div class="margin text-center">
			<span>Sign in using social networks</span><br/>
			<button class="btn bg-light-blue btn-circle"><i class="fa fa-facebook"></i></button>
			<button class="btn bg-aqua btn-circle"><i class="fa fa-twitter"></i></button>
			<button class="btn bg-red btn-circle"><i class="fa fa-google-plus"></i></button>
		</div>
	</div>
	
	<!-- Bootstrap -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap.min.js" type="text/javascript"></script>
	<!-- AdminLTE App -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/app.js" type="text/javascript"></script>
	<!-- Bootstrap Dialog -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap-dialog.js" type="text/javascript"></script>
	
	<script type="text/javascript">
		$(function() {
			$('#password').bind('keydown', 'return', function(){
				doLogin();
			});
		});
		
		function doLogin() {
			oauth2.user.login($('#username').val(), $('#password').val(), function (result) {
				if (!result) {
					var wlocation = oauth2.cookie.get('wlocation');
					if (!wlocation || wlocation == '')
						wlocation = '${pageContext.request.contextPath}';
					
					window.location = wlocation;
				} else {
					BootstrapDialog.alert({
							title: 'Sign-in Error',
							message: 'Username and/or password did not match a user account.',
							closeByBackdrop: false,
							draggable: true
					});
				}
			});
		}
		
		function clearForm(){
			
		}
	</script>
</body>
</html>