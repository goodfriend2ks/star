<%-- 
    Document   : header
    Created on : 13/06/2014, 15:17:32
    Author     : GoodFriend2ks
--%>

<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html style="height: 100%;">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <title>DMS Lite</title>
        
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
        <script type="text/javascript">
        	CONTEXT_PATH = "${pageContext.request.contextPath}";
        	
        	LOGIN_URL = "${pageContext.request.contextPath}/login.jsp?force";
			RELOGIN_WHEN_INVALID_TOKEN = true;
        </script>
        
        <script src="${pageContext.request.contextPath}/js/format.js" type="text/javascript"></script>
        <script type="text/javascript">
        	PERSONAL_DATE_FORMAT = "DD/MM/YYYY";
        	PERSONAL_TIME_FORMAT = "HH:mm:ss";
        	PERSONAL_DATE_TIME_FORMAT = "DD/MM/YYYY HH:mm:ss";
        	
        	//var datePat = /^(\d{1,2})(\/|-)(\d{1,2})(\/|-)(\d{4})$/;
        </script>
        
        <script src="${pageContext.request.contextPath}/js/jquery.min.js" type="text/javascript"></script>
        <%-- <script src="${pageContext.request.contextPath}/js/jquery.easyui.min.js" type="text/javascript"></script> --%>
        <script src="${pageContext.request.contextPath}/js/moment.min.js" type="text/javascript"></script>
        
		<script src="${pageContext.request.contextPath}/js/store.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/js/oauth2.js" type="text/javascript"></script>
	    <script src="${pageContext.request.contextPath}/js/sha256.js" type="text/javascript"></script>
	    <script src="${pageContext.request.contextPath}/js/enc-base64-min.js" type="text/javascript"></script>
	    <script src="${pageContext.request.contextPath}/js/cookie.js" type="text/javascript"></script>
	    <script src="${pageContext.request.contextPath}/js/user.js" type="text/javascript"></script>
	    
	    <script src="${pageContext.request.contextPath}/js/bean.js" type="text/javascript"></script>
	    <script src="${pageContext.request.contextPath}/js/application.js" type="text/javascript"></script>
	    
	    <!-- Populate JSON to Form-->
	    <script src="${pageContext.request.contextPath}/js/bootstrap/jquery.populatejson.js" type="text/javascript"></script>
	    <!-- Serialize Form to JSON -->
		<script src="${pageContext.request.contextPath}/js/bootstrap/jquery.serializejson.js" type="text/javascript"></script>
		
        <decorator:head />
    </head>
	
    <body class="skin-blue">
    	<!-- header logo: style can be found in header.less -->
        <header class="header">
            <a href="${pageContext.request.contextPath}" class="logo">
                <!-- Add the class icon to your logo image or logo icon to add the margining -->
                DMS.Lite
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
                                <button type='submit' name='seach' id='search-btn' class="btn btn-flat"><i class="fa fa-search"></i></button>
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
            	<decorator:body/>
			</aside>
		</div>
		
		<%@include file="uploadfile.jsp"%>
		
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
		
		<script type="text/javascript">
			$(function() {
				/* if (!oauth2.user.is_logged_in()) {
            		window.location = '${pageContext.request.contextPath}/login.jsp';
                }; */

                /* $(".date-format").inputmask(PERSONAL_DATE_FORMAT.toLowerCase()); */
        		
        		/* $(".date-picker").datepicker({
        	        format: PERSONAL_DATE_FORMAT.toLowerCase()
        	    }); */

        		/* $(".chzn-select").chosen({
        	        allow_single_deselect: false,
        	        width: '100%'
        	    });
        		
        	    $(".chzn-select-deselect").chosen({
        	        allow_single_deselect: true,
        	        width: '100%'
        	    }); */
        	    
        	    /* 
				$.extend($.fn.datebox.defaults,{
					formatter:function(date){
						var y = date.getFullYear();
						var m = date.getMonth()+1;
						var d = date.getDate();
						//return (d < 10 ? ('0' + d) : d) + '/' + (m < 10 ? ('0' + m) : m) + '/' + y;
						return (m < 10 ? ('0' + m) : m) + '/' + (d < 10 ? ('0' + d) : d) + '/' + y;
					},
					
					parser:function(s){
						if (!s) 
							return new Date();
						
						var ss = s.split('/');
						var d = parseInt(ss[0],10);
						var m = parseInt(ss[1],10);
						var y = parseInt(ss[2],10);
						if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
							return new Date(y,m-1,d);
						} else {
							return new Date();
						}
					}
				}); */
			});
        </script>
    </body>
</html>
