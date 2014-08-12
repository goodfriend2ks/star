<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
</head>
<body>
	<input type="text" id="latitude" name="latitude" />
	<input type="text" id="longitude" name="longitude" />
	<button id="xyz" type="button" onclick="loadMap()">XYZZZ</button>
	
	<input id="pac-input" class="controls" type="text"
        					placeholder="Enter a location">
        				<div id="type-selector" class="controls">
      <input type="radio" name="type" id="changetype-all" checked="checked">
      <label for="changetype-all">All</label>

      <input type="radio" name="type" id="changetype-establishment">
      <label for="changetype-establishment">Establishments</label>

      <input type="radio" name="type" id="changetype-geocode">
      <label for="changetype-geocode">Geocodes</label>
    </div>
    
	<div id="map" style="width: 800px; height: 500px;"></div>
	
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
	
	<script type="text/javascript">
		function loadMap() {
			mapMarkerId = "marker_" + parseInt(Date.now());
			
			var coords = [21.02782551610964, 105.85232203459168];
			
			mapInstance = $("#map"); 
			mapInstance.show();
			
			mapInstance.googleMap({
				zoom: 10, // Initial zoom level (optional)
				coords: coords, // Map center (optional)
				type: "ROADMAP" // Map type (optional)
			});
			
			mapInstance.addMarker({
				coords: coords, // GPS coords
				//url: 'http://www.tiloweb.com', // Link to redirect onclick (optional)
				id: mapMarkerId, // Unique ID for your marker
				draggable: true, 
				success: function(e) {
					$("#latitude").val(e.lat);
					$("#longitude").val(e.lon);
				}
			});

			/* mapInstance.addWay({
		    	start: "Nghĩa Tân Cầu Giấy Hà Nội", // Postal address for the start marker (obligatory)
				end:  [21.010840189092324, 105.84167902922059], // Postal Address or GPS coordinates for the end marker (obligatory)
				route : 'way', // Block's ID for the route display (optional)
				langage : 'vi', // language of the route detail (optional) //english
				step: [[21.030869851342153, 105.80202525114441],
						[21.003468596240726, 105.82004969572449]]
			}); */
			
			//$('#' + beanDialogId).modal('layout');
			
			/* $('#pac-input').geocomplete(); */
			
			var map = mapInstance.getMap();
			var marker = mapInstance.getMarker(mapMarkerId);
			
			var input = document.getElementById('pac-input');
			var types = document.getElementById('type-selector');
			
			map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);
			map.controls[google.maps.ControlPosition.TOP_LEFT].push(types);
			
			var autocomplete = new google.maps.places.Autocomplete(input);
			
			autocomplete.bindTo('bounds', map);
			
			var infowindow = new google.maps.InfoWindow();
			google.maps.event.addListener(autocomplete, 'place_changed', function() {
				infowindow.close();
			    marker.setVisible(false);
			    var place = autocomplete.getPlace();
			    
			    if (!place.geometry) {
			      return;
			    }

			    // If the place has a geometry, then present it on a map.
			    if (place.geometry.viewport) {
			      map.fitBounds(place.geometry.viewport);
			    } else {
			      map.setCenter(place.geometry.location);
			      map.setZoom(17);  // Why 17? Because it looks good.
			    }
			    marker.setIcon(({
			      url: place.icon,
			      size: new google.maps.Size(71, 71),
			      origin: new google.maps.Point(0, 0),
			      anchor: new google.maps.Point(17, 34),
			      scaledSize: new google.maps.Size(35, 35)
			    }));
			    marker.setPosition(place.geometry.location);
			    marker.setVisible(true);

			    var address = '';
			    if (place.address_components) {
			      address = [
			        (place.address_components[0] && place.address_components[0].short_name || ''),
			        (place.address_components[1] && place.address_components[1].short_name || ''),
			        (place.address_components[2] && place.address_components[2].short_name || '')
			      ].join(' ');
			    }

			    infowindow.setContent('<div><strong>' + place.name + '</strong><br>' + address);
			    infowindow.open(map, marker);
			  });
			
			// Sets a listener on a radio button to change the filter type on Places
			  // Autocomplete.
			  function setupClickListener(id, types) {
			    var radioButton = document.getElementById(id);
			    google.maps.event.addDomListener(radioButton, 'click', function() {
			      autocomplete.setTypes(types);
			    });
			  }

			  setupClickListener('changetype-all', []);
			  setupClickListener('changetype-establishment', ['establishment']);
			  setupClickListener('changetype-geocode', ['geocode']);
			  /* 
			$("#map").googleMap({
				zoom: 10, // Initial zoom level (optional)
				coords: [], // Map center (optional)
				type: "ROADMAP" // Map type (optional)
			});
			
			$("#map").addMarker({
				//zoom: 10, // Initial zoom level (optional)
				coords: [21.02782551610964, 105.85232203459168], // GPS coords
				//url: 'http://www.tiloweb.com', // Link to redirect onclick (optional)
				id: 'marker1', // Unique ID for your marker
				draggable: true, 
				success: function(e) {
		    	    $("#latitude").val(e.lat);
		    	    $("#longitude").val(e.lon);
		    	}
			});

			$("#map").addWay({
		    	start: "Nghĩa Tân Cầu Giấy Hà Nội", // Postal address for the start marker (obligatory)
				end:  [21.010840189092324, 105.84167902922059], // Postal Address or GPS coordinates for the end marker (obligatory)
				route : 'way', // Block's ID for the route display (optional)
				langage : 'vi', // language of the route detail (optional) //english
				step: [[21.030869851342153, 105.80202525114441],
						[21.003468596240726, 105.82004969572449]]
			}); */
		};
	</script>
</body>
</html>