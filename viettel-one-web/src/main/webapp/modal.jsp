<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!doctype html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="chrome=1">
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<title>Viettel.One</title>
	
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/logo.png">
	
	<link href="${pageContext.request.contextPath}/styles/application.css" rel="stylesheet" type="text/css" media="screen" />
	
	<!-- bootstrap 3.0.2 -->
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap-2.3.2.css" rel="stylesheet" type="text/css" />
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
	<%-- <link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap.dialog.css" rel="stylesheet" type="text/css" /> --%>
	
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap-responsive-2.3.2.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/styles/bootstrap/bootstrap-modal.css" rel="stylesheet" type="text/css" />
	
	<link href="${pageContext.request.contextPath}/styles/bootstrap/jquery.googlemap.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/styles/bootstrap/jquery.fileupload.css" rel="stylesheet" type="text/css" />
	
	<!-- <link href="./styles/bootstrap/checkbox-flat.css" rel="stylesheet" type="text/css" /> -->
	
	<!-- JQuery -->
	<script src="${pageContext.request.contextPath}/js/jquery/jquery.min.js" type="text/javascript"></script>
	<!-- JQuery Draggable -->
	<%-- <script src="${pageContext.request.contextPath}/js/jquery/jquery.draggable.js" type="text/javascript"></script> --%>
	<!-- JQuery Extended -->
	<script src="${pageContext.request.contextPath}/js/jquery/jquery.ext.js" type="text/javascript"></script>
	<!-- JQuery Shortcut -->
	<script src="${pageContext.request.contextPath}/js/jquery/jquery.hotkeys.js" type="text/javascript"></script>
		
	<!-- Populate JSON to Form-->
	<script src="${pageContext.request.contextPath}/js/jquery/jquery.populatejson.js" type="text/javascript"></script>
	<!-- Serialize Form to JSON -->
	<script src="${pageContext.request.contextPath}/js/jquery/jquery.serializejson.js" type="text/javascript"></script>
	
	<!-- BBQ Fragment -->
	<script src="${pageContext.request.contextPath}/js/jquery/jquery.ba-bbq.js" type="text/javascript"></script>
	
	<!-- Date time -->
	<script src="${pageContext.request.contextPath}/js/common/moment.min.js" type="text/javascript"></script>
	
	<script src="${pageContext.request.contextPath}/js/common/store.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/common/oauth2.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/common/sha256.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/common/enc-base64-min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/common/cookie.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/common/user.js" type="text/javascript"></script>
	
	<script src="${pageContext.request.contextPath}/js/common/url.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/common/format.js" type="text/javascript"></script>
	
	<script src="${pageContext.request.contextPath}/js/common/bean.js" type="text/javascript"></script>
	
	<script type="text/javascript">
		DIALOG_CONFIRM_YES 		= "Yes";
		DIALOG_CONFIRM_NO 		= "No";
		DIALOG_CONFIRM_OK 		= "OK";
		DIALOG_CONFIRM_CANCEL 	= "Cancel";
		DIALOG_CONFIRM_CLOSE 	= "Close";
		
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
	</script>
	
	<style>      
  		.text-center { 
    		text-align: center; 
  	}

  .marketing h1 {
    font-size: 50px;
    font-weight: lighter;
    line-height: 1;
  }

  .marketing p {
    font-size: 18px;
  }
  </style>
</head>
<body class="skin-blue">
    <div class="container" style="position: relative">
      <div class="marketing">
        <h1>Bootstrap-Modal</h1>
      </div>
      <br />
		  <div class="row">
			  <div class="span10">
  				<p>
            Using Bootstrap 3? Include the <a href="css/bootstrap-modal-bs3patch.css">patch file</a> <strong>before</strong> bootstrap-modal and check out the <a href="bs3.html">demo page</a>.
          </p>
          <div class="responsive">
  				  <h3>Responsive</h3>
  				  <div class="text-center">
  					<button class="demo btn btn-primary btn-large" data-toggle="modal" href="#responsive">View Demo</button>
  				  </div>
  				</div>
  				<br />

		    </div>
	    </div>
	  </div>
		
<!-- Modal Definitions (tabbed over for <pre>) -->
<div id="responsive" class="modal hide fade" tabindex="-1" data-width="760" data-replace="true">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
    <h3>Responsive</h3>
  </div>
  <div class="modal-body">
  	<!-- <button type="button" onclick="$('#xyz').height('800px')">XYZ</button>
  	<img id="xyz" style="height: 300px" src="http://i.imgur.com/KwPYo.jpg"> -->
    <div class="row-fluid">
      <div class="span6">
        <h4>Some Input</h4>
        <p><input type="text" class="form-control" /></p>
        <p><input type="text" class="form-control" /></p>
        <p><input type="text" class="form-control" /></p>
        <p><input type="text" class="form-control" /></p>
        <p><input type="text" class="form-control" /></p>
        <p><input type="text" class="form-control" /></p>
        <p><input type="text" class="form-control" /></p>
      </div>
      <div class="span6">
        <h4>Some More Input</h4>
        <p><input type="text" class="form-control" /></p>
        <p><input type="text" class="form-control" /></p>
        <p><input type="text" class="form-control" /></p>
        <p><input type="text" class="form-control" /></p>
        <p><input type="text" class="form-control" /></p>
        <p><input type="text" class="form-control" /></p>
        <p><input type="text" class="form-control" /></p>
      </div>
    </div>
  </div>
  <div class="modal-footer">
    <button type="button" data-dismiss="modal" class="btn">Close</button>
    <button type="button" class="btn btn-primary">Save changes</button>
  </div>
</div>

	<!-- Bootstrap -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap.min.js" type="text/javascript"></script>
	<!-- AdminLTE App -->
	<script src="${pageContext.request.contextPath}/js/common/application.js" type="text/javascript"></script>
	<%-- <script src="${pageContext.request.contextPath}/js/bootstrap/app.js" type="text/javascript"></script> --%>
	<!-- Bootstrap Validator -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap.validator.min.js" type="text/javascript"></script>
	<!-- Bootstrap Dialog -->
	<%-- <script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap-dialog.js" type="text/javascript"></script> --%>
	
	<!-- Bootstrap Modal -->
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap-modal.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap-modalmanager.js" type="text/javascript"></script>
	
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
	
	<!-- <script src="http://maps.google.com/maps/api/js?sensor=true&language=vi" type="text/javascript"></script> -->
	<%-- <script src="${pageContext.request.contextPath}/js/gmaps.js" type="text/javascript"></script> --%>
	<script src="https://maps.googleapis.com/maps/api/js?v=3.4&libraries=places&sensor=false&language=vi"></script>
	
	<!-- <script type="text/javascript" src="http://www.google.com/jsapi"></script>
	<script type="text/javascript">
    	google.load("maps", "3.4", {
    		other_params: "sensor=false&language=vi"
    	});
	</script> -->
	
	<script src="${pageContext.request.contextPath}/js/jquery/jquery.googlemap.js" type="text/javascript"></script>
	<%-- <script src="${pageContext.request.contextPath}/js/gmap/jquery.geocomplete.min.js" type="text/javascript"></script> --%>
	
<script id="dynamic" type="text/javascript">
/* $('.dynamic .demo').click(function(){
  var tmpl = [
    // tabindex is required for focus
    '<div class="modal hide fade" tabindex="-1">',
      '<div class="modal-header">',
        '<button type="button" class="close" data-dismiss="modal" aria-hidden="true">Ã</button>',
        '<h3>Modal header</h3>', 
      '</div>',
      '<div class="modal-body">',
        '<p>Test</p>',
      '</div>',
      '<div class="modal-footer">',
        '<a href="#" data-dismiss="modal" class="btn">Close</a>',
        '<a href="#" class="btn btn-primary">Save changes</a>',
      '</div>',
    '</div>'
  ].join('');
  
  $(tmpl).modal();
}); */
</script>

<script id="ajax" type="text/javascript">

/* var $modal = $('#ajax-modal');

$('.ajax .demo').on('click', function(){
  // create the backdrop and wait for next modal to be triggered
  $('body').modalmanager('loading');

  setTimeout(function(){
     $modal.load('modal_ajax_test.html', '', function(){
      $modal.modal();
    });
  }, 1000);
});

$modal.on('click', '.update', function(){
  $modal.modal('loading');
  setTimeout(function(){
    $modal
      .modal('loading')
      .find('.modal-body')
        .prepend('<div class="alert alert-info fade in">' +
          'Updated!<button type="button" class="close" data-dismiss="alert">&times;</button>' +
        '</div>');
  }, 1000);
}); */

</script> 
  </body>
</html>
