/**
 * 
 */
var beanDatagridId;
var beanDialogId;
var beanFormId;

var dialogNewTitle;
var dialogEditTitle;
var dialogDeleteTitle;
var dialogDeleteMsg;

var beanRequestMappingUrl;
var beanCurrentUrl;

var selectedBeans = [];
var singleSelected = true;

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
				$('#' + beanDatagridId +' tbody tr').each(function(index) {
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
	var error = jsonResponse.error;
	if (error == 'unauthorized' || error == 'invalid_token') {
		if (RELOGIN_WHEN_INVALID_TOKEN && LOGIN_URL) {
			window.location = LOGIN_URL;
			return;
		}
	}
	
	BootstrapDialog.alert({
		type: BootstrapDialog.TYPE_ERROR,
		title: '<span class=\'fa fa-exclamation-triangle\'> ' + error + '</span>',
		message: jsonResponse.error_description, 
		draggable: true
	});
}

/** On Javascript exception **/
function onException(ex) {
	BootstrapDialog.alert({
		type: BootstrapDialog.TYPE_ERROR,
		title: '<span class=\'fa fa-exclamation-triangle\'> ' + ex.name + '</span>',
		message: ex.message, 
		draggable: true
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
		"language": {
            "lengthMenu": "Display _MENU_ records per page",
            "zeroRecords": "Nothing found - sorry",
            "info": "Showing page _PAGE_ of _PAGES_",
            "infoEmpty": "No records available",
            "infoFiltered": "(filtered from _MAX_ total records)"
        }
	});
}

/********** FORM FUNCTION ***********/
function initFormData() {
	var bootstrapValidator = $('#' + beanFormId).data('bootstrapValidator'); 
    if (bootstrapValidator)
    	bootstrapValidator.resetForm();
    
	// chzn-select
    $('#' + beanFormId + ' .chzn-select[ajaxUrl], #' + beanFormId + ' .chzn-select-deselect[ajaxUrl]').each(
    		function(index){
    			initOption($(this), true, false);
    		}
    );
	
	// multiselect
    $('#' + beanFormId + ' .multiselect[ajaxUrl]').each(
    		function(index){
    			initOption($(this), false, true);
    		}
    );
}

function initOption(jselect, ischosen, ismultiselect) {
	try {
		var select = jselect[0]; 
		var ajaxUrl = jselect.attr('ajaxUrl');
		var required = jselect.attr('required');
		
		if (ajaxUrl != '') {
			jselect.empty();
			if (!!!required && !ismultiselect)
				$('<option />').appendTo(select);
			
			oauth2.get(ajaxUrl, '', 
					function (response) {
						$.each(response, function(){
							$('<option />', {value: this.id, text: this.display}).appendTo(select);
						});
						
						if (ischosen)
							jselect.trigger("chosen:updated");
						else if (ismultiselect)
							jselect.multiselect('rebuild');
					},
					function(jqXHR, textStatus) {
						progress(false);
					});
		}
	} catch (e) {
	}
}

/******** BEAN FUNCTION ********/

/** Open dialog for new bean **/
function newBean(){
    //$('#' + beanDialogId).dialog('open').dialog('setTitle', dialogNewTitle);
	/*$('#' + beanDialogId).dynamicDraggable({
	     handle: ".modal-header"  
	});*/
	
	$('#' + beanDialogId).modal('show');
    $('#' + beanFormId).trigger('reset');
    
    initFormData();
    
    beanCurrentUrl = beanRequestMappingUrl + '/save/new';
}

/** Get selection bean and open dialog for edit **/
function editBean(){
	var selectedId = getSelectedId();
    if (selectedId != null && selectedId != '') {
        //$('#' + beanDialogId).dialog('open').dialog('setTitle', dialogEditTitle);
    	//$('#' + beanFormId).form('load', row);
    	//$('#' + beanFormId).form('load', beanRequestMappingUrl + '/edit/' + selectedId);
        
    	beanCurrentUrl = beanRequestMappingUrl + '/savex/' + selectedId;
    	
        progress(true);
        oauth2.get(beanRequestMappingUrl + '/edit/' + selectedId, '', 
				function (response) {
        			try {
	        			$('#' + beanDialogId).modal('show');
	        			
	        			initFormData();
	        			
	        			$('#' + beanFormId).populate( response, false );
	        			
			        	//$('#' + beanFormId + ' input, #' + beanFormId + ' select').each(
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
			            
			            progress(false);
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
    
    return row;
}

/** Save bean and close dialog if success **/
function saveBean(){
	$('#' + beanFormId).bootstrapValidator('validate');
	var isValid = $('#' + beanFormId).data('bootstrapValidator').isValid();
	if (isValid) {
		progress(true);
		
		try {
			var json = $('#' + beanFormId).serializeJSON({
				parseWithFunction : function (input, value) {
					try {
						var datatype = $('[name=' + input.name + ']').attr('datatype');
						
						if ('date' == datatype)
							return moment(value, PERSONAL_DATE_FORMAT).toDate();
						else if ('datetime' == datatype)
							return moment(value, PERSONAL_DATE_TIME_FORMAT).toDate();
						else if ('time' == datatype)
							return moment(value, PERSONAL_TIME_FORMAT).toDate();
					} catch (e) {}
					
					return value;
				}
			});
			
			oauth2.post(beanCurrentUrl, 
					JSON.stringify(json), 
					//$('#' + beanFormId).serialize(), 
					function (response) {
						progress(false);
				    	closeBeanDialog(true);
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

/*BootstrapDialog.TYPE_DEFAULT = 'type-default';
BootstrapDialog.TYPE_INFO = 'type-info';
BootstrapDialog.TYPE_PRIMARY = 'type-primary';
BootstrapDialog.TYPE_SUCCESS = 'type-success';
BootstrapDialog.TYPE_WARNING = 'type-warning';
BootstrapDialog.TYPE_DANGER = 'type-danger';*/

/** Confirm and delete selection bean **/
function destroyBean() {
	var selectedId = getSelectedId();
	if (selectedId != null && selectedId != '') {
		BootstrapDialog.show({
			type: BootstrapDialog.TYPE_WARNING,
            title: dialogDeleteTitle,
            message: dialogDeleteMsg,
            closeByBackdrop: false,
            draggable: true,
            buttons: [{
                icon: 'fa fa-thumbs-up',
                label: '&nbsp;Yes',
                cssClass: 'btn-primary',
                autospin: true,
                action: function(dialogRef){
                    dialogRef.enableButtons(false);
                    dialogRef.setClosable(false);
                    //dialogRef.getModalBody().html('Dialog closes in 5 seconds.');
                    
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
            }, {
                label: 'Close',
                action: function(dialogRef){
                    dialogRef.close();
                }
            }]
        });
    }
}

function closeBeanDialog(gridReload) {
	//$('#' + beanDialogId).dialog('close');			// close the dialog
	$('#' + beanDialogId).modal('hide');
	if (gridReload) {
		$('#' + beanDatagridId).datagrid('reload');	// reload the user data
	}
}

/*var progressDialog = new BootstrapDialog({
    message: function(dialogRef){
        var $message = $('<div>OK, this dialog has no header and footer, but you can close the dialog using this button: </div>');
        var $button = $('<button class="btn btn-primary btn-lg btn-block">Close the dialog</button>');
        $button.on('click', {dialogRef: dialogRef}, function(event){
            event.data.dialogRef.close();
        });
        $message.append($button);

        return $message;
    },
    closable: false
});*/

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