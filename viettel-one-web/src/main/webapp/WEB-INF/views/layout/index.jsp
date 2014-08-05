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
	
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/logo.png">
	<!-- <link rel="stylesheet" href="./styles/themes/gray/easyui.css" type="text/css" media="screen" /> -->
	<!-- <link rel="stylesheet" href="./styles/themes/metro-blue/easyui.css" type="text/css" media="screen" /> -->
	<!-- <link rel="stylesheet" href="./styles/themes/metro/metro.css" type="text/css" media="screen" /> -->
	
	<%-- <link href="${pageContext.request.contextPath}/styles/easyui/bootstrap/easyui.css" rel="stylesheet" type="text/css" media="screen" /> --%>
	
	<link href="${pageContext.request.contextPath}/styles/application.css" rel="stylesheet" type="text/css" media="screen" />
	
	<!-- bootstrap 3.0.2 -->
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap.css" rel="stylesheet" type="text/css" />
	<!-- font Awesome -->
	<link href="${pageContext.request.contextPath}/styles/bootstrap/font-awesome.css" rel="stylesheet" type="text/css" />
	<!-- Ionicons -->
	<link href="${pageContext.request.contextPath}/styles/bootstrap/ionicons.css" rel="stylesheet" type="text/css" />
	<!-- Theme style -->
	<link href="${pageContext.request.contextPath}/styles/bootstrap/AdminLTE.css" rel="stylesheet" type="text/css" />
	
	<!-- Theme style -->
	<link href="${pageContext.request.contextPath}/styles/bootstrap/themes/blue.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/styles/bootstrap/themes/black.css" rel="stylesheet" type="text/css" />
	
	<link href="${pageContext.request.contextPath}/styles/bootstrap/datepicker.css" rel="stylesheet" type="text/css" />
	
	<link href="${pageContext.request.contextPath}/styles/bootstrap/datatables.bootstrap.css" rel="stylesheet" type="text/css" />
	
	<link href="${pageContext.request.contextPath}/styles/bootstrap/chosen.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap.multiselect.css" rel="stylesheet" type="text/css" />
	
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap.validator.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap.dialog.css" rel="stylesheet" type="text/css" />
	
	<link href="${pageContext.request.contextPath}/styles/bootstrap/jquery.fileupload.css" rel="stylesheet" type="text/css" />
	
	<!-- <link href="./styles/bootstrap/checkbox-flat.css" rel="stylesheet" type="text/css" /> -->
	
	<script src="${pageContext.request.contextPath}/js/url.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/format.js" type="text/javascript"></script>
	
	<!-- JQuery -->
	<script src="${pageContext.request.contextPath}/js/jquery.min.js" type="text/javascript"></script>
	<!-- Joda Date time -->
	<script src="${pageContext.request.contextPath}/js/moment.min.js" type="text/javascript"></script>
	<!-- JQuery Shortcut -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/jquery.hotkeys.js" type="text/javascript"></script>
	
	<script src="${pageContext.request.contextPath}/js/store.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/oauth2.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/sha256.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/enc-base64-min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/cookie.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/user.js" type="text/javascript"></script>
	
	<script src="${pageContext.request.contextPath}/js/bean.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/application.js" type="text/javascript"></script>
	
	<!-- BBQ Fragment -->
	<script src="${pageContext.request.contextPath}/js/jquery.ba-bbq.js" type="text/javascript"></script>
	
	<!-- Populate JSON to Form-->
	<script src="${pageContext.request.contextPath}/js/bootstrap/jquery.populatejson.js" type="text/javascript"></script>
	<!-- Serialize Form to JSON -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/jquery.serializejson.js" type="text/javascript"></script>
	
	<!-- <script src="http://maps.google.com/maps/api/js?sensor=true&language=vi" type="text/javascript"></script> -->
	<%-- <script src="${pageContext.request.contextPath}/js/gmaps.js" type="text/javascript"></script> --%>
	
	<script type="text/javascript" src="http://www.google.com/jsapi"></script>
	<script type="text/javascript">
    	google.load("maps", "3.4", {
    		other_params: "sensor=false&language=vi"
    	});
	</script>
	<script src="${pageContext.request.contextPath}/js/jquery.googlemap.js" type="text/javascript"></script>
	
	<script type="text/javascript">
		DIALOG_CONFIRM_YES 		= "<spring:message code='label.dialog.yes' htmlEscape='false'/>";
		DIALOG_CONFIRM_NO 		= "<spring:message code='label.dialog.no' htmlEscape='false'/>";
		DIALOG_CONFIRM_OK 		= "<spring:message code='label.dialog.ok' htmlEscape='false'/>";
		DIALOG_CONFIRM_CANCEL 	= "<spring:message code='label.dialog.cancel' htmlEscape='false'/>";
		DIALOG_CONFIRM_CLOSE 	= "<spring:message code='label.dialog.close' htmlEscape='false'/>";
		
		CONTEXT_PATH = "${pageContext.request.contextPath}";
		
		LOGIN_URL = "${pageContext.request.contextPath}/login.jsp?force";
		LOCKSCREEN_URL = "${pageContext.request.contextPath}/lockscreen.jsp"; 
		RELOGIN_WHEN_INVALID_TOKEN = true;

		//PERSONAL_DATE_FORMAT = "DD/MM/YYYY";
		//PERSONAL_TIME_FORMAT = "HH:mm:ss";
		var cookieValue = oauth2.cookie.get('datePattern');
		if (cookieValue != '')
			PERSONAL_DATE_FORMAT = cookieValue.toUpperCase();
		
		cookieValue = oauth2.cookie.get('timePattern');
		if (cookieValue != '')
			PERSONAL_TIME_FORMAT = cookieValue;
		
		PERSONAL_DATE_TIME_FORMAT = PERSONAL_DATE_FORMAT + ' ' + PERSONAL_TIME_FORMAT;

		// Fragment
		$(function(){
			// Keep a mapping of url-to-container for caching purposes.
			/* var cache = {
				// If url is '' (no fragment), display this div's content.
				'': $('.bbq-default')
			}; */
			
			// Bind an event to window.onhashchange that, when the history state changes,
			// gets the url from the hash and displays either our cached content or fetches
			// new content to be displayed.
			$(window).bind( 'hashchange', function(e) {
				// Get the hash (fragment) as a string, with any leading # removed. Note that
				// in jQuery 1.4, you should use e.fragment instead of $.param.fragment().
				var url = $.param.fragment();
				
				// Remove .bbq-current class from any previously "current" link(s).
				$( 'a.bbq-current' ).removeClass( 'bbq-current' );
				
				// Hide any visible ajax content.
				$( '.bbq-content' ).children( ':visible' ).hide();
				
				// Add .bbq-current class to "current" nav link(s), only if url isn't empty.
				url && $( 'a[href="#' + url + '"]' ).addClass( 'bbq-current' );
				
				//if ( cache[ url ] ) {
				//	// Since the element is already in the cache, it doesn't need to be
				//	// created, so instead of creating it again, let's just show it!
				//	cache[ url ].show();
				//} else {
					$( '.bbq-item' ).remove();
					
					// Show "loading" content while AJAX content loads.
					$( '.bbq-loading' ).show();
					
					// Create container for this url's content and store a reference to it in the cache.
					//cache[ url ] = 
					$( '<div class="bbq-item"/>' )
					
						// Append the content container to the parent container.
						.appendTo( '.bbq-content' )
						
						// Load external content via AJAX. Note that in order to keep this
						// example streamlined, only the content in .infobox is shown. You'll
						// want to change this based on your needs.
						.load( 'admin/' + url, function(){
							// Content loaded, hide "loading" content.
							$( '.bbq-loading' ).hide();
						});
				//}
			});
			
			// Since the event is only triggered when the hash changes, we need to trigger
			// the event now, to handle the hash the page may have loaded with.
			$(window).trigger( 'hashchange' );
		});
	</script>
</head>

<body class="skin-blue">
	<!-- header logo: style can be found in header.less -->
	<header class="header">
		<a href="${pageContext.request.contextPath}" class="logo">
			<!-- Add the class icon to your logo image or logo icon to add the margining -->
			Viettel.One
		</a>
		<!-- Header Navbar: style can be found in header.less -->
		<nav class="navbar navbar-static-top" role="navigation">
			<!-- Sidebar toggle button-->
			<a href="#" class="navbar-btn sidebar-toggle" data-toggle="offcanvas" role="button">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</a>
			<div class="navbar-right">
				<%@include file="navbar-right.jsp"%>
			</div>
		</nav>
	</header>
	
	<div class="wrapper row-offcanvas row-offcanvas-left">
		<!-- Left side column. contains the logo and sidebar -->
		<aside class="left-side sidebar-offcanvas">
			<!-- sidebar: style can be found in sidebar.less -->
			<section class="sidebar">
				<!-- Sidebar user panel -->
				<!-- <div class="user-panel">
					<div class="pull-left image">
						<img src="./assets/img/avatar3.png" class="img-circle" alt="User Image" />
					</div>
					<div class="pull-left info">
						<p>Hello, Jane</p>
						<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
					</div>
				</div> -->
				
				<!-- search form -->
				<!-- <form action="#" method="get" class="sidebar-form">
					<div class="input-group">
						<input type="text" name="q" class="form-control" placeholder="Search..."/>
						<span class="input-group-btn">
							<button type='submit' name='seach' id='search-btn' class="btn btn-flat">
								<i class="fa fa-search"></i>
							</button>
						</span>
					</div>
				</form> -->
				<!-- /.search form -->
				
				<div class="media user-media bg-dark dker">
	  				<div class="user-media-toggleHover">
						<span class="fa fa-user"></span> 
	  				</div>
	  				<div class="user-wrapper bg-dark">
						<a class="user-link" href="">
	  						<img class="media-object img-thumbnail user-img" width="64" height="64" 
	  							alt="User Picture" src="./img/avatar3.png">
	  						<span class="label label-danger user-label">16</span> 
						</a> 
						<div class="media-body">
	  						<h5 class="media-heading">Archie</h5>
	  						<ul class="list-unstyled user-info">
								<li> <a href="">Administrator</a>  </li>
								<li>Last Access :
		  							<br><small><i class="fa fa-calendar"></i>&nbsp;16 Mar 16:32</small> 
								</li>
	  						</ul>
						</div>
	  				</div>
				</div>
				
				 <!-- sidebar menu: : style can be found in sidebar.less -->
				<%@include file="menu.jsp"%>
				
      		</section>
		<!-- /.sidebar -->
		</aside>
	
		<!-- Right side column. Contains the navbar and content of the page -->
		<aside class="right-side">
			<div class="bbq-content">
				<!-- This will be shown while loading AJAX content. You'll want to get an image that suits your design at http://ajaxload.info/ -->
				<div class="bbq-loading" style="display:none;">
					<img src="/shell/images/ajaxload-15-white.gif" alt="Loading"/> Loading content...
				</div>
				
				<!-- This content will be shown if no path is specified in the URL fragment. -->
				<div class="bbq-default bbq-item">
					<!-- <img src="bbq.jpg" width="400" height="300">
					<h1>jQuery BBQ XYZ</h1>
					<p>Click a nav item above or below to load some delicious AJAX content! Also,
						once the content loads, feel free to further explore our savory delights by
						clicking any inline links you might see.</p> -->
				</div>
			</div>
  		</aside>
	</div>
			
	<!-- %@include file="uploadfile.jsp"% -->
	
	<!-- Bootstrap -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap.min.js" type="text/javascript"></script>
	<!-- AdminLTE App -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/app.js" type="text/javascript"></script>
	<!-- Bootstrap Validator -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap.validator.min.js" type="text/javascript"></script>
	<!-- Bootstrap Dialog -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap-dialog.js" type="text/javascript"></script>
	
	<!-- Input mask -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/jquery.inputmask.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap/jquery.inputmask.extensions.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap/jquery.inputmask.date.extensions.js" type="text/javascript"></script>
	
	<!-- Date picker -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap-datepicker.js" type="text/javascript"></script>
	
	<!-- Data grid table -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/datatables.jquery.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap/datatables.jquery.bootstrap.js" type="text/javascript"></script>
	
	<!-- Select element -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/chosen.jquery.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap-multiselect.js" type="text/javascript"></script>
</body>
</html>
