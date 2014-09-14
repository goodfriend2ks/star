/**
 * 
 */
var beanDatagridId;
var beanDialogId;
var beanFormId;

var dialogNewTitle = "New";
var dialogEditTitle = "Edit";
var dialogDeleteTitle = "Confirm";
var dialogDeleteMsg = "Delete";

var beanRequestMappingUrl;
var beanCurrentUrl;

var selectedBeans = [];
var singleSelected = true;

var MAP_DEFAULT_LATITUDE = 21.02782551610964;
var MAP_DEFAULT_LONGITUDE = 105.85232203459168;

var mapInstance = null;
var mapInfoWindow = null;
var mapMarkerId = null;
var geocodeNotAddress = 'Cannot determine address at this location.';

var tableLanguage = {};

/***** PRIVATE FUNCTION ******/

/** Init grid data table **/
function initGrid() {
	var aoColumns = [];
	
	try{
		$('#' + beanDatagridId + ' thead tr th').each(function(index) {
			var th = $(this);
			var column = {};
			
			column['mData'] = th.attr('field');
			
			var rowClass = th.attr('row-class');
			if (rowClass)
				column['class'] = rowClass;
			
			var sort = th.attr('sort');
			if ('false' == sort || false == sort)
				column['bSortable'] = false;
			
			var sType = th.attr('sType');
			if (sType)
				column['sType'] = sType;
			
			var formatter = th.attr('formatter');
			if (formatter) {
				column['render'] = function(val) {
					return eval(formatter + '(\'' + val + '\')');
				};
			}
			
			aoColumns.push(column);
		});
	
		$('#' + beanDatagridId +' tbody').on('click', 'tr', function () {
			if (!$(this).hasClass('datagrid-row-selected')) {
				$('#' + beanDatagridId +' tbody tr.datagrid-row-selected').each(function(index) {
					$(this).removeClass('datagrid-row-selected');
				});
			}
			
			$(this).toggleClass('datagrid-row-selected');
		});
	} catch (e) { }
	
	//alert(JSON.stringify(aoColumns));
	return aoColumns;
}

/** Init special control in form **/
function initForm() {
	try {
		$('#' + beanDialogId).on('shown.bs.modal', function () {
			$('#' + beanFormId + ' input[autofocus], #' + beanFormId + ' textarea[autofocus]').first().focus();
		});
		
	    // date-picker
		$('#' + beanFormId + ' input.date-picker').each(
	    		function(index){
	    			try {
	        			var input = $(this);
	        			var name = input.attr('name');
	        			if (!name) {
	        				name = input.attr('id');
	        			}
	        			if (name) {
	        				var format = PERSONAL_DATE_FORMAT;
	        				
	        				var datatype = input.attr('datatype');
	        				if ('datetime' == datatype)
	        					format = PERSONAL_DATE_TIME_FORMAT;
	        				else if ('time' == datatype)
	        					format = PERSONAL_TIME_FORMAT;
	        				
		        			input.datepicker({
	                	        		format: format.toLowerCase(), 
	                	        		autoclose: true
	                	    		});
	        			}
	    			} catch (e) {
	    			}
	    		}
	    );
	    
	    // date-format
	    $('#' + beanFormId + ' input.date-format').each(
	    		function(index){
	    			try {
	        			var input = $(this);
	        			var name = input.attr('name');
	        			if (!name) {
	        				name = input.attr('id');
	        			}
	        			if (name) {
	        				var format = PERSONAL_DATE_FORMAT;
	        				
	        				var datatype = input.attr('datatype');
	        				if ('datetime' == datatype)
	        					format = PERSONAL_DATE_TIME_FORMAT;
	        				else if ('time' == datatype)
	        					format = PERSONAL_TIME_FORMAT;
	        				
		        			input.inputmask(format.toLowerCase());
	        			}
	    			} catch (e) {
	    			}
	    		}
	    );
	    
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
	    
	} catch (e) {}
}

/** On Ajax Fail **/
function onFail(jqXHR, textStatus) {
	var jsonResponse = JSON.parse(jqXHR.responseText);
	onResponseFail(jsonResponse);
}

function onResponseFail(jsonResponse) {
	var error = jsonResponse.error;
	if (error == 'unauthorized' || error == 'invalid_token') {
		if (RELOGIN_WHEN_INVALID_TOKEN && LOGIN_URL) {
			window.location = LOGIN_URL;
			return;
		}
	}
	
	showError(jsonResponse.error_description, error);
}

/** On Javascript exception **/
function onException(ex) {
	showError(ex.message, ex.name);
}

function showError(message, title) {
	ui.dialog.alert(message, title, {
		type: DIALOG_TYPE_ERROR,
		icon: 'fa-exclamation-triangle'
	});
}

/******* GRID DATA TABLE FUNCTION *******/

/** Get selection item **/
function getSelectedId() {
	var tr = $('#' + beanDatagridId +' tbody tr.datagrid-row-selected').first();
	if (tr == null)
		return null;
	
	return tr.attr('idvalue');
	
	/* EasyUI */
	/*var row = $('#' + beanDatagridId).datagrid('getSelected');
	if (row == null)
		return null;
	
	return row.id;*/
}

/** Load ajax data to grid **/
function loadBeans(isGet) {
	progress(true);
	
	if (isGet) {
		oauth2.get(beanRequestMappingUrl + '/list', '', 
				function (response) {
					loadSuccess(response);
					progress(false);
				}, 
				function(jqXHR, textStatus) {
					onFail(jqXHR, textStatus);
					progress(false);
				});
	} else {
		oauth2.post(beanRequestMappingUrl + '/list', '', 
				function (response) {
					loadSuccess(response);
					progress(false);
				}, 
				function(jqXHR, textStatus) {
					progress(false);
					onFail(jqXHR, textStatus);
				});
	}
}

function loadSuccess(response) {
	//$('#' + beanDatagridId).datagrid('loadData', response);
	var aoColumns = initGrid();
	
	$('#' + beanDatagridId).dataTable({
		'sDom' : "<'row'<'col-xs-6'b><'col-xs-6'f>r>t<'row'<'col-xs-6'l><'col-xs-6'p>>",
		'scrollX' : true,
		'data' : response.rows,
		//"dataSrc" : "rows",
		'aoColumns' : aoColumns, 
		'aaSorting': [[1, 'asc']],
		'language': tableLanguage
	});
}

/********** FORM FUNCTION ***********/
function initFormData(callbackOption, callback) {
	$('#' + beanFormId).trigger('reset');
	
	$('#' + beanFormId).find('.inlineDetail').each(function (i) {
		var childTag = $(this).attr('childTag');
		$(this).find(childTag).each(function (i) {
			if (i > 0) {
				$(this).remove();
			}
		});
		
		$(this).find('.newlinewhenblur').bind( "blur", function() {
			newInlineBean(this);
		});
	});
	
	var bootstrapValidator = $('#' + beanFormId).data('bootstrapValidator'); 
    if (bootstrapValidator)
    	bootstrapValidator.resetForm();
    
	var preloadedSize = $('#' + beanFormId + ' select[ajaxUrl][preloaded]').length;
	if (preloadedSize > 0) {
		$('#' + beanFormId + ' select[ajaxUrl][preloaded]').each(
	    		function(index){
	    			var ischosen = $(this).hasClass('chzn-select') || $(this).hasClass('chzn-select-deselect');
	    			var ismultiselect = $(this).hasClass('multiselect');
	    			
	    			initOption($(this), ischosen, ismultiselect, function(jselect, success){
	    				callbackOption(jselect, success);
	    				preloadedSize--;
	    				
	    				if (preloadedSize <= 0) {
	    					initNormalFormData(callbackOption, callback);
	    				}
	    			});
	    		}
	    );
	} else {
		initNormalFormData(callbackOption, callback);
	}
}

function initNormalFormData(callbackOption, callback) {
	$('#' + beanFormId + ' select[ajaxUrl]:not([preloaded])').each(
    		function(index){
    			var ischosen = $(this).hasClass('chzn-select') || $(this).hasClass('chzn-select-deselect');
    			var ismultiselect = $(this).hasClass('multiselect');
    			
    			initOption($(this), ischosen, ismultiselect, callbackOption);
    		}
    );
    
    if (callback) {
    	callback();
    }
}

function openBeanDialog(title) {
	$('#' + beanDialogId).modal('show');
	$('#' + beanDialogId + '-title').html(title);
	/*
	$('#' + beanDialogId).draggable({
	    handle: ".modal-header"
	});
	*/
	/*$(document).on('keydown', null, 'alt+s', function() { 
		saveBean();
	});*/
}

function closeBeanDialog(gridReload) {
	/*$(document).off('keydown');*/
	
	//$('#' + beanDialogId).dialog('close');			// close the dialog
	$('#' + beanDialogId).modal('hide');
	if (gridReload) {
		$('#' + beanDatagridId).datagrid('reload');	// reload the user data
	}
}

function initOption(jselect, ischosen, ismultiselect, callbackOption) {
	try {
		var select = jselect[0]; 
		var ajaxUrl = jselect.attr('ajaxUrl');
		var required = jselect.attr('required');
		var localstorage = jselect.attr('localstorage');
		var timeout = 0;
		
		// minutes
		if (jselect.attr('timeout')) {
			try {
				timeout = parseInt(jselect.attr('timeout'));
			} catch (e) {}
		}
		
		if (ajaxUrl != '') {
			jselect.empty();
			
			if (!!!required && !ismultiselect)
				$('<option />').appendTo(select);
			
			if (localstorage && localstorage != '') {
				var localdata = store.get(localstorage);
				if (localdata) {
					var datas = null;
					var json = JSON.parse(localdata);
					
					if (timeout <= 0) {
						if (json['access_token'] == oauth2.cookie.get('authToken')) {
							datas = json.rows;
						}
					} else {
						try {
							var timeoutDate = new Date(json['timeout']);
							if (timeoutDate.getTime() > (new Date()).getTime()) {
								datas = json.rows;
							}
						} catch (e) {
						}
					}
					
					if (datas == null) {
						store.remove(localstorage);
					} else {
						$.each(datas, function(){
							$('<option />', {value: this.id, text: this.display}).appendTo(select);
						});
						
						if (callbackOption) {
							callbackOption(jselect, true);
						}
						
						if (ischosen)
							jselect.trigger("chosen:updated");
						else if (ismultiselect)
							jselect.multiselect('rebuild');
						
						return;
					}
				}
			}
			
			oauth2.get(ajaxUrl, '', 
					function (response) {
						if (localstorage != '') {
							response['timeout'] = timeout <= 0 ? null : new Date((new Date()).getTime() + timeout*60000);
							response['access_token'] = oauth2.cookie.get('authToken');
							store.set(localstorage, JSON.stringify(response));
						}
						
						$.each(response.rows, function(){
							$('<option />', {value: this.id, text: this.display}).appendTo(select);
						});
						
						if (callbackOption) {
							callbackOption(jselect, true);
						}
						
						if (ischosen)
							jselect.trigger("chosen:updated");
						else if (ismultiselect)
							jselect.multiselect('rebuild');
					},
					function(jqXHR, textStatus) {
						progress(false);
						
						if (callbackOption) {
							callbackOption(jselect, false);
						}
					});
		}
	} catch (e) {
	}
}

/******** BEAN FUNCTION ********/
function resetForm() {
	beanDatagridId = null;
	beanDialogId = null;
	beanFormId = null;
	
	beanRequestMappingUrl = null;
	beanCurrentUrl = null;

	selectedBeans = [];

	mapInstance = null;
	mapMarkerId = null;
}

/** Open dialog for new bean **/
function newBean(){
    //$('#' + beanDialogId).dialog('open').dialog('setTitle', dialogNewTitle);
	
	openBeanDialog(dialogNewTitle);
	
    initFormData();
    
    if (!mapInstance) {
		setTimeout(loadBeanMap, 10);
	}
    
    beanCurrentUrl = beanRequestMappingUrl + '/save/new';
}

/** Get selection bean and open dialog for edit **/
function editBean(selectedId){
	if (!selectedId)
		selectedId = getSelectedId();
	
	if (selectedId != null && selectedId != '') {
	    //$('#' + beanDialogId).dialog('open').dialog('setTitle', dialogEditTitle);
		//$('#' + beanFormId).form('load', row);
		//$('#' + beanFormId).form('load', beanRequestMappingUrl + '/edit/' + selectedId);
	    
		beanCurrentUrl = beanRequestMappingUrl + '/save/' + selectedId;
		
	    progress(true);
	    oauth2.get(beanRequestMappingUrl + '/edit/' + selectedId, '', 
				function (response) {
	    			try {
	    				openBeanDialog(dialogEditTitle);
	        			
	        			initFormData(function (jselect, success) {
	        					if (success) {
	        						var name = jselect.attr('name');
	        						if (!name)
	        							name = jselect.attr('id');
	        						
	        						if (name) {
	        							var value = response[name];
	        							if (value) {
	        								jselect.val(value);
	        							}
	        						}
	        					}
	        				},
	        				function(){
	        					$('#' + beanFormId).populate( response, false );
	    	        			
	    			            // date-picker
	    			        	$('#' + beanFormId + ' input.date-picker').each(
	    			            		function(index){
	    			            			try {
	    			    	        			var input = $(this);
	    			    	        			var name = input.attr('name');
	    			    	        			if (!name)
	    			    	        				name = input.attr('id');
	    			    	        			
	    			    	        			if (name) {
	    			    	        				var format = PERSONAL_DATE_FORMAT;
	    			    	        				
	    			    	        				var datatype = input.attr('datatype');
	    			    	        				if ('datetime' == datatype)
	    			    	        					format = PERSONAL_DATE_TIME_FORMAT;
	    			    	        				else if ('time' == datatype)
	    			    	        					format = PERSONAL_TIME_FORMAT;
	    			    	        				
	    			    		        			var value = formatDateTimeValue(response[name], format);
	    			    		        			input.datepicker('setValue', value);
	    			    	        			}
	    			            			} catch (e) {
	    			            			}
	    			            		}
	    			            );
	    			            
	    			            // date-format
	    			            $('#' + beanFormId + ' input.date-format').each(
	    			            		function(index){
	    			            			try {
	    			    	        			var input = $(this);
	    			    	        			var name = input.attr('name');
	    			    	        			if (!name)
	    			    	        				name = input.attr('id');
	    			    	        			
	    			    	        			if (name) {
	    			    	        				var format = PERSONAL_DATE_FORMAT;
	    			    	        				
	    			    	        				var datatype = input.attr('datatype');
	    			    	        				if ('datetime' == datatype)
	    			    	        					format = PERSONAL_DATE_TIME_FORMAT;
	    			    	        				else if ('time' == datatype)
	    			    	        					format = PERSONAL_TIME_FORMAT;
	    			    	        				
	    			    	        				var value = formatDateTimeValue(response[name], format);
	    			    		        			input.val(value);
	    			    	        			}
	    			            			} catch (e) {
	    			            			}
	    			            		}
	    			            );
	    			            
	    			           /* // chosen
	    			            $('#' + beanFormId + ' .chzn-select, #' + beanFormId + ' .chzn-select-deselect').each(
	    			            		function(index){
	    			            			try {
	    			            				var input = $(this);
	    			    	        			var name = input.attr('name');
	    			    	        			if (!name)
	    			    	        				name = input.attr('id');
	    			    	        			
	    			    	        			if (name) {
	    			    	        				
	    			    	        				var value = response[name];
	    			    	        				input.val('0d3992c2-e578-11e3-a5bf-19b777468313');
	    			    	        				input.trigger("chosen:updated");
	    			    	        				//$(this).trigger("chosen:updated");
	    			    	        			}
	    			            			} catch (e) {
	    			            			}
	    			            		}
	    			            );
	    			            
	    			            // multiselect
	    			            $('#' + beanFormId + ' .multiselect').each(
	    			            		function(index){
	    			            			try {
	    			            				$(this).multiselect('rebuild');
	    			            			} catch (e) {
	    			            			}
	    			            		}
	    			            );*/
	    			            
	    			            progress(false);
	        				});
	    			} catch (e) {
	    				progress(false);
	    				onException(e);
					}
				}, 
				function(jqXHR, textStatus) {
					progress(false);
					onFail(jqXHR, textStatus);
				});
	}
}

/** Save bean and close dialog if success **/
function saveBean() {
	$('#' + beanFormId).bootstrapValidator('validate');
	var isValid = $('#' + beanFormId).data('bootstrapValidator').isValid();
	if (isValid) {
		progress(true);
		
		try {
			var json = $('#' + beanFormId).serializeJSON({
				parseWithFunction : function (input, value) {
					try {
						var datatype = $('[name="' + input.name + '"]').attr('datatype');
						if ('date' == datatype)
							return moment(value, PERSONAL_DATE_FORMAT).toDate();
						else if ('datetime' == datatype)
							return moment(value, PERSONAL_DATE_TIME_FORMAT).toDate();
						else if ('time' == datatype)
							return moment(value, PERSONAL_TIME_FORMAT).toDate();
					} catch (e) {
						//alert(e);
					}
					
					return value;
				}
			});
			//alert(JSON.stringify(json));
			
			oauth2.post(beanCurrentUrl, 
					JSON.stringify(json), 
					//$('#' + beanFormId).serialize(), 
					function (response) {
						progress(false);
						if (response.success && response.success == 'true') {
					    	closeBeanDialog(true);
						} else {
							onResponseFail(response);
						}
					}, 
					function(jqXHR, textStatus) {
						progress(false);
						onFail(jqXHR, textStatus);
					});
		} catch (e) {
			progress(false);
			onException(e);
		}
	}
}

/** Confirm and delete selection bean **/
function destroyBean() {
	var selectedId = getSelectedId();
	if (selectedId != null && selectedId != '') {
		ui.dialog.confirm(dialogDeleteMsg, dialogDeleteTitle, {
			type: DIALOG_TYPE_WARNING,
			icon: 'fa-question-circle',
			callback: function(result) {
				if (result) {
					oauth2.del(beanRequestMappingUrl + '/destroy/' + selectedId, '', 
						function (response) {
							progress(false);
							dialogRef.close();
							$('#' + beanDatagridId).datagrid('reload'); 
						}, 
						function(jqXHR, textStatus) {
							progress(false);
							onFail(jqXHR, textStatus);
						});
				}
			}
		});
    }
}

function progress(show) {
	/*if (show) {
		progressDialog.realize();
		progressDialog.getModalHeader().hide();
		progressDialog.getModalFooter().hide();
		progressDialog.getModalBody().css('background-color', '#0088cc');
		progressDialog.getModalBody().css('color', '#fff');
		progressDialog.open();
	} else {
		progressDialog.close();
	}*/
}

function loadBeanMap() {
	loadGoogleMap({
		mapId: 'map',
		latitudeId: 'latitude',
		longitudeId: 'longitude',
		zoom: 10,
		addMarker: true,
		draggableMarker: true,
		pacInputId: 'pac-input',
		typeSelectorId: 'type-selector',
		showmapInfoWindow: true
	});
	
	if (mapInstance) {
		$('#' + beanDialogId).modal('layout');
	}
}

function moveBeanMarker(coords) {
	if (!mapInstance)
		return;
	
	if (mapInfoWindow) {
		mapInfoWindow.close();
	}
	
	mapInstance.moveMarker(mapMarkerId, coords);
}

function loadGoogleMap(options) {
	var defaultOptions = {
			mapId: 'map',
			latitudeId: 'latitude',
			longitudeId: 'longitude',
			zoom: 10,
			addMarker: true,
			draggableMarker: true,
			pacInputId: null,
			typeSelectorId: null,
			showmapInfoWindow: false,
			infoMakerFunc: function(place) {
				if (!place)
					return '';
				
				var address = '';
				if (place.address_components) {
					address = [
					           (place.address_components[0] && place.address_components[0].short_name || ''),
					           (place.address_components[1] && place.address_components[1].short_name || ''),
					           (place.address_components[2] && place.address_components[2].short_name || '')
					].join(' - ');
				}
				
				return '<div>' + (typeof place.name === 'undefined' ? '' : '<strong>' + place.name + '</strong><br/>') + address + '</div>';
			}, 
			callback: null
    };
	options = $.extend(true, defaultOptions, options);
	
	mapInstance = $('#' + options.mapId);
	if (!mapInstance || mapInstance.length === 0) {
		mapInstance = null;
		return;
	}
	
	mapInstance.show();
	
	var coords = [MAP_DEFAULT_LATITUDE, MAP_DEFAULT_LONGITUDE];
	if (options.latitudeId && options.latitudeId !== '')
		coords[0] = $('#' + options.latitudeId).val() || MAP_DEFAULT_LATITUDE;
	if (options.longitudeId && options.longitudeId !== '')
		coords[1] = $('#' + options.longitudeId).val() || MAP_DEFAULT_LONGITUDE;
	
	mapInstance.googleMap({
		zoom: options.zoom, 	// Initial zoom level (optional)
		coords: coords, 		// Map center (optional)
		type: "ROADMAP" 		// Map type (optional)
	});
	
	mapMarkerId = "marker_" + parseInt(Date.now());
	if (options.addMarker) {
		mapInfoWindow = new google.maps.InfoWindow();
		
		function geocodePosition(map, marker, coords) {
			if (!map || !marker || !options.showmapInfoWindow || (typeof options.infoMakerFunc !== 'function'))
				return;
			
			mapInstance.geocodePosition(coords, 
				function(responses) {
					if (responses && responses.length > 0) {
						mapInfoWindow.setContent(options.infoMakerFunc(responses[0]));
						mapInfoWindow.open(map, marker);
					} else {
						mapInfoWindow.setContent(geocodeNotAddress);
						mapInfoWindow.open(map, marker);
					}
			});
		}
		
		mapInstance.addMarker({
			coords: coords, 	// GPS coords
			id: mapMarkerId, 	// Unique ID for your marker
			draggable: options.draggableMarker, 
			success: function(map, marker, changed, e) {
				if (options.latitudeId && options.latitudeId !== '')
					$('#' + options.latitudeId).val(e.lat);
				if (options.longitudeId && options.longitudeId !== '')
					$('#' + options.longitudeId).val(e.lon);
				
				if (changed) {
					geocodePosition(map, marker, [e.lat, e.lon]);
				}
			}
		});
		
		if (options.pacInputId && options.pacInputId !== '') {
			var pacInput = $('#' + options.pacInputId);
			if (pacInput && pacInput.length === 1) {
				var typeSelector = null;
				
				var map = mapInstance.getMap();
				map.controls[google.maps.ControlPosition.TOP_LEFT].push(pacInput[0]);
				
				if (options.typeSelectorId && options.typeSelectorId !== '') {
					typeSelector = $('#' + options.typeSelectorId);
					if (typeSelector && typeSelector.length === 1)
						map.controls[google.maps.ControlPosition.TOP_LEFT].push(typeSelector[0]);
				}
				
				var autocomplete = new google.maps.places.Autocomplete(pacInput[0]);
				autocomplete.bindTo('bounds', map);
				
				var marker = mapInstance.getMarker(mapMarkerId);
				if (options.showmapInfoWindow && typeof options.infoMakerFunc === 'function') {
					google.maps.event.addListener(marker, 'click', function() {
						var location = marker.getPosition();
						if(typeof location.d != "undefined") {
							var coords = [location.d, location.e];
							geocodePosition(map, marker, coords);
						}
					});
				}
				
				google.maps.event.addListener(autocomplete, 'place_changed', function() {
					mapInfoWindow.close();
					//marker.setVisible(false);
					
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
					
					/*marker.setIcon(({
						url: place.icon,
						size: new google.maps.Size(71, 71),
						origin: new google.maps.Point(0, 0),
						anchor: new google.maps.Point(17, 34),
						scaledSize: new google.maps.Size(35, 35)
					}));*/
					
					if (options.latitudeId && options.latitudeId !== '')
						$('#' + options.latitudeId).val(place.geometry.location.d);
					if (options.longitudeId && options.longitudeId !== '')
						$('#' + options.longitudeId).val(place.geometry.location.e);
					
					marker.setPosition(place.geometry.location);
					marker.setVisible(true);
				    
					if (options.showmapInfoWindow && typeof options.infoMakerFunc === 'function') {
						mapInfoWindow.setContent(options.infoMakerFunc(place));
						mapInfoWindow.open(map, marker);
					}
				});
				
				pacInput.show();
				if (typeSelector) {
					typeSelector.show();
				
					// Sets a listener on a radio button to change the filter type on Places Autocomplete.
					function setupClickListener(id, types) {
						var radioButton = document.getElementById(id);
						google.maps.event.addDomListener(radioButton, 'click', function() {
							autocomplete.setTypes(types);
						});
					}
					
					setupClickListener('changetype-all', []);
					setupClickListener('changetype-establishment', ['establishment']);
					setupClickListener('changetype-geocode', ['geocode']);
				}
			}
		}
	} else {
		if (options.pacInputId && options.pacInputId !== '')
			$('#' + options.pacInputId).hide();
		if (options.typeSelectorId && options.typeSelectorId !== '')
			$('#' + options.typeSelectorId).hide();
	}
	
	if (callback) {
		callback(mapInstance);
	}
}