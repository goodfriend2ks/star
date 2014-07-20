<div class="modal fade" id="dlg-uploadfile" aria-hidden="true" data-backdrop="static" role='dialog'>
	<div class="modal-dialog" style="width:800px;height:350px;">
		<div class="modal-content">
			
    		<div class="modal-header modal-dialog-header">
  				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
  				<div class="modal-title">
					<i class="fa fa-camera"></i>&nbsp;Media
				</div>
			</div>
			
			<form id="fm-uploadfile" method="post" enctype="multipart/form-data" class="fm" role="form" novalidate>
  				<fieldset>
	    			<div class="modal-body">
	    				<div class="row">
		   					<div class="col-lg-12">
		   						<span class="btn btn-success fileinput-button">
									<i class="glyphicon glyphicon-plus"></i>
                  						<span>Add files...</span>
                  						<input type="file" id="uploadfile" name="file" multiple>
              						</span>
              						
				   				<a href="javascript:void(0)" class="btn btn-primary btn-flat fileupload-button">
									<i class="fa fa-upload"></i>
									<spring:message code='label.upload'/>
								</a>
				   				<a href="javascript:void(0)" class="btn btn-default btn-flat fileclear-button">
				   					<i class="fa fa-times"></i>
				   					<spring:message code='label.clear'/>
				   				</a>
				   			</div>
						</div>
						<div class="row">
		   					<div class="col-lg-12" style="height:300px;">
				   				<table id="uploadFiles" role="presentation" class="table table-bordered table-condensed table-hover">
	     							<tbody>
	     								<thead>
											<tr>
												<th row-class="nowrap rownum" class="center" style="width:10px;">&nbsp;</th>
												<th row-class="nowrap" class="center">File Name</th>
												<th row-class="right nowrap" class="center">File Size</th>
												<th row-class="center nowrap" class="center">File Type</th>
												<th row-class="center nowrap" class="center">Status</th>
												<th row-class="center nowrap" class="center">Action</th>
											</tr>
										</thead>
	     							</tbody>
	     						</table>
	     					</div>
	     				</div>
	    			</div> <!-- modal-body -->
	   				
	   				<div class="modal-footer">
	   					<div id="dlg-buttons-uploadfile">
							<a href="javascript:void(0)" class="btn btn-primary btn-flat" onclick="saveBean()">
								<i class="fa fa-save"></i>
								<spring:message code='label.save'/>
							</a>
			   				<a href="javascript:void(0)" class="btn btn-default btn-flat" onclick="closeUploadFile()">
			   					<i class="fa fa-times"></i>
			   					<spring:message code='label.cancel'/>
			   				</a>
						</div>
	   				</div>
	    		</fieldset>
	    	</form>
		</div>
	</div>
</div>

<script type="text/javascript">
	var uploadedFiles = [];
	
	$(function(){
		/* $('#uploadfile').fileupload({
	        url: '${pageContext.request.contextPath}/profile/image',
	        method: 'POST',
	        dataType: 'json',
	        autoUpload: false,
	        //acceptFileTypes: /(\.|\/)(png)$/i,
	        acceptFileTypes: /(\.|\/)(gif|jpe?g|png)$/i,
	        maxFileSize: 4000000, // 4 MB
	        disableImageResize: /Android(?!.*Chrome)|Opera/
	            .test(window.navigator.userAgent),
	        previewMaxWidth: 300,
	        previewMaxHeight: 200,
	        previewCrop: true,
	        headers: {
				'Authorization' : 'Bearer ' + oauth2.cookie.get('authToken')
			},
			 
			add: function (e, data) {
				console.log(data);
				
				//$('#preview').attr('src', URL.createObjectURL(data.files[0]));
				
				//$("#btnUpload").on('click', function () {
		        //    data.submit();
		        //});
			}, 
			
			done: function (e, data) {
		        console.log(e);
		        console.log(data);
		        
		        //$('#uploadButton').removeClass('btn-warning');
		        //$('#uploadButton').addClass('btn-success');
		    }
	    });  */
	    /*.on('fileuploadadd', function (e, data) {
		    //console.log(data);
		    alert("1:" + data.context);
	        data.context = $('<div class="col-md-3 videopreview" />').appendTo('#files');
	        $.each(data.files, function (index, file) {
	            var node = $('<p/>');
	            if (!index) {
	                node.append('<br>')
	            }
	            node.appendTo(data.context);
	        });
	    }).on('fileuploadprocessalways', function (e, data) {
		    alert("2:" + data);
	        var index = data.index,
	        file = data.files[index],
	        node = $(data.context.children()[index]);
	        
	    	if (file.preview) {
	      		node.prepend('<br/>')
	        		.prepend(file.preview)
	    	}
	    	if (file.error) {
	      		node.append('<br/>')
	        		.append($('<span class="text-danger"/>').text(file.error));
	    	}
		});*/
		
		$('#uploadFiles').dataTable({
			'sDom' : 			"t<'row'<'col-xs-6'l><'col-xs-6'p>>",
			'scrollX' : 		true,
			'scrollY' :			'250px',
	        'scrollCollapse' :	true,
	        'paging' : 			true,
			'data' : 			uploadedFiles, 
			'columns' : [{ 'class' : 'rownum' },
			             { 'class' : 'center nowrap' },
			             { 'class' : 'right nowrap' }, 
			             { 'class' : 'center nowrap' },
			             { 'class' : 'center nowrap' },
			             { 'class' : 'center nowrap' }]
	    });
	});
	
	function openUploadFile(multiple) {
		if (uploadedFiles.length == 0) {
			// Ajax load uploaded files
		}
		
		$('#dlg-uploadfile').modal('show');

		$('#uploadfile').fileupload({
	        url: '${pageContext.request.contextPath}/api/profile/image',
	        method: 'POST',
	        dataType: 'json',
	        autoUpload: false,
	        //acceptFileTypes: /(\.|\/)(png)$/i,
	        acceptFileTypes: /(\.|\/)(gif|jpe?g|png)$/i,
	        maxFileSize: 4000000, // 4 MB
	        disableImageResize: /Android(?!.*Chrome)|Opera/
	            .test(window.navigator.userAgent),
	        previewMaxWidth: 300,
	        previewMaxHeight: 200,
	        previewCrop: true,
	        dropZone : $('#uploadFiles'),
	        multiple : multiple,
	        headers: {
				'Authorization' : 'Bearer ' + oauth2.cookie.get('authToken')
			},
			
			add: function (e, data) {
				var uploadFiles = $('#uploadFiles');
				for (var i=0; i<data.files.length; i++) {
					var file = data.files[i];
					
					var uploadedFile = [uploadedFiles.length + 1];
					uploadedFile.push('<img width=\'60\' height=\'60\' src=\'' + URL.createObjectURL(file) + '\'>');
					uploadedFile.push(file.size);
					uploadedFile.push(file.type);
					uploadedFile.push('Draft');
					uploadedFile.push('<div class="btn-group nowrap">' 
							+ '<button type="button" class="btn btn-default">Action</button>'
							+ '<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">'
								+ '<span class="caret"></span>'
								+ '<span class="sr-only">Toggle Dropdown</span>'
							+ '</button>'
							+ '<ul class="dropdown-menu" role="menu">'
								+ '<li><a href="#">Action</a></li>'
								+ '<li><a href="#">Another action</a></li>'
								+ '<li><a href="#">Something else here</a></li>'
								+ '<li class="divider"></li>'
								+ '<li><a href="#">Separated link</a></li>'
							+ '</ul>'
						+ '</div>');

					uploadedFiles.push(uploadedFile);
					uploadFiles.dataTable().fnAddData(uploadedFile);
					console.log(typeof data);
				}
				
				//$('#filepreview').attr('src', URL.createObjectURL(data.files[0]));
				
				$(".fileupload-button").on('click', function () {
					console.log(data);
		            data.submit();
		        });

				$(".fileclear-button").on('click', function () {
		            uploadFiles.dataTable().fnClearTable();
		            data.files = [];
		        });
			}, 
			
			done: function (e, data) {
		        console.log(e);
		        console.log(data);
		        
		        /* $('#uploadButton').removeClass('btn-warning');
		        $('#uploadButton').addClass('btn-success'); */
		    }
	    });
	}
	
	function closeUploadFile() {
		$('#dlg-uploadfile').modal('hide');
	}
</script>