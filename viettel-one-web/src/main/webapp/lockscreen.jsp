<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html style="height: 100%;">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/logo.png">
	<title>Viettel.One | Lockscreen</title>
        
	<!-- bootstrap 3.0.2 -->
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap-2.3.2.css" rel="stylesheet" type="text/css" />
	<%-- <link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css" /> --%>
	<!-- font Awesome -->
	<link href="${pageContext.request.contextPath}/styles/bootstrap/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<!-- Theme style -->
	<link href="${pageContext.request.contextPath}/styles/bootstrap/AdminLTE.css" rel="stylesheet" type="text/css" />
	
	<!-- Theme style -->
	<link href="${pageContext.request.contextPath}/styles/bootstrap/themes/blue.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/styles/bootstrap/themes/black.css" rel="stylesheet" type="text/css" />
	
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap-responsive-2.3.2.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap-modal.css" rel="stylesheet" type="text/css" />
	
	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
	<![endif]-->
	
	<!-- JQuery -->
	<script src="${pageContext.request.contextPath}/js/jquery/jquery.min.js" type="text/javascript"></script>
	<!-- JQuery Extended -->
	<script src="${pageContext.request.contextPath}/js/jquery/jquery.ext.js" type="text/javascript"></script>
	<!-- JQuery Shortcut -->
	<script src="${pageContext.request.contextPath}/js/jquery/jquery.hotkeys.js" type="text/javascript"></script>
	
	<script src="${pageContext.request.contextPath}/js/common/store.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/common/oauth2.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/common/sha256.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/common/enc-base64-min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/common/cookie.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/common/user.js" type="text/javascript"></script>
	
	<script src="${pageContext.request.contextPath}/js/common/context.var.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/common/format.js" type="text/javascript"></script>
	<script type="text/javascript">
		CONTEXT_PATH = "${pageContext.request.contextPath}";
		
		PERSONAL_DATE_FORMAT = "DD/MM/YYYY";
		PERSONAL_DATE_TIME_FORMAT = "DD/MM/YYYY HH:mm:ss";
	</script>
</head>
<body class="lockscreen">
	<!-- Automatic element centering using js -->
	<div class="center">            
		<div class="headline text-center" id="time">
			<!-- Time auto generated by js -->
		</div><!-- /.headline -->
		
		<!-- User name -->
		<div class="lockscreen-name"></div>
		
		<!-- START LOCK SCREEN ITEM -->
		<div class="lockscreen-item">
			<!-- lockscreen image -->
			<div class="lockscreen-image">
				<img src="${pageContext.request.contextPath}/img/avatar5.png" alt="user image"/>
			</div>
			<!-- /.lockscreen-image -->
			
			<!-- lockscreen credentials (contains the form) -->
			<div class="lockscreen-credentials">   
				<div class="input-group">
					<input type="password" class="form-control" id="password" name="password" placeholder="password" />
					<div class="input-group-btn">
						<button type="button" class="btn btn-flat" onclick="doReLogin()">
							<i class="fa fa-arrow-right text-muted"></i>
						</button>
					</div>
				</div>
			</div><!-- /.lockscreen credentials -->
		</div><!-- /.lockscreen-item -->
		
		<div class="lockscreen-link">
			<a href="${pageContext.request.contextPath}/login.jsp?force">Or sign in as a different user</a>
		</div>            
	</div><!-- /.center -->
	
	<!-- Bootstrap -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap.min.js" type="text/javascript"></script>
	<!-- AdminLTE App -->
	<%-- <script src="${pageContext.request.contextPath}/js/common/application.js" type="text/javascript"></script> --%>
	
	<!-- page script -->
	<script type="text/javascript">
		$(function() {
			var user = oauth2.user.get();
			if (user == null) {
				$('.lockscreen-name').text('Anonymous');
			} else {
				$('.lockscreen-name').text(user.full_name);
			}
			
			startTime();
			
			$(".center").center();
			
			$(window).resize(function() {
				$(".center").center();
			});

			$('#password').bind('keydown', 'return', function(){
				doReLogin();
			});
		});
		
		/*  */
		function startTime()
		{
			var today = new Date();
			var h = today.getHours();
			var m = today.getMinutes();
			var s = today.getSeconds();
			
			// add a zero in front of numbers<10
			m = checkTime(m);
			s = checkTime(s);
			
			//Check for PM and AM
			var day_or_night = (h > 11) ? "PM" : "AM";
			
			//Convert to 12 hours system
			if (h > 12)
				h -= 12;
			
			//Add time to the headline and update every 500 milliseconds
			$('#time').html(h + ":" + m + ":" + s + " " + day_or_night);
			
			setTimeout(function() {
				startTime();
			}, 500);
		}

		function checkTime(i)
		{
			if (i < 10) {
				i = "0" + i;
			}
			
			return i;
		}
		
		/* jQuery.fn.center = function() {
		    this.css("position", "absolute");
		    this.css("top", Math.max(0, (($(window).height() - $(this).outerHeight()) / 2) +
		            $(window).scrollTop()) - 30 + "px");
		    this.css("left", Math.max(0, (($(window).width() - $(this).outerWidth()) / 2) +
		            $(window).scrollLeft()) + "px");
		    return this;
		}; */
		
		function doReLogin(){
			oauth2.user.relogin($('#password').val(), function (result) {
				if (!result) {
					var wlocation = oauth2.cookie.get('wlocation');
					if (!wlocation || wlocation == '')
						wlocation = '${pageContext.request.contextPath}/start';
					
					window.location = wlocation;
				} else {
					ui.dialog.alert('Username and/or password did not match a user account.', 'Sign-in Error', {
						type: DIALOG_TYPE_DANGER,
						msgClass: 'text-gray'
					});
				}
			});
		}
	</script>
</body>
</html>