<div class="modal fade" id="dlg-user" data-backdrop="static" data-keyboard="true" data-width="700">
	<div class="modal-header modal-dialog-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<div class="modal-title">
			<i class="fa fa-user"></i> <span id="dlg-user-title"></span>
		</div>
	</div>
	<div class="modal-body">
		<form id="fm-user" method="post" class="fm" role="form" novalidate>
			<fieldset>
		   		<div class="row">
		   			<div class="col-lg-5">
		   				<div class="form-group">
							<label for="name"><spring:message code='label.user.fullname' htmlEscape='false'/></label>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="fa fa-align-justify"></i>
								</div>
								<input type="text" class="form-control focus" id="name" name="name" 
									placeholder="<spring:message code='label.user.fullname' htmlEscape='false'/>" 
									autofocus required>
							</div>
						</div>
		   			</div>
		   			<div class="col-lg-4">
		   				<div class="form-group">
							<label for="userName"><spring:message code='label.user.username' htmlEscape='false'/></label>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="fa fa-user"></i>
								</div>
								<input type="text" class="form-control" id="userName" name="userName" 
									placeholder="<spring:message code='label.user.username' htmlEscape='false'/>"
									maxlength="30" data-bv-message="The username is not valid" 
									pattern="[a-zA-Z0-9]+" data-bv-regexp-message="The username can only consist of alphabetical, number"
									required data-bv-notempty-message="The username is required and cannot be empty">
							</div>
						</div>
		   			</div>
		   			
		   			<div class="col-lg-1">
		   				<div class="form-group">
							<label for="btnPassword">&nbsp;</label>
							<button type="button" class="btn btn-danger btn-flat" id="btnPassword" 
									onclick="onResetPassword()">
								<i class="fa fa-key"></i> <spring:message code='label.user.resetpass' htmlEscape='false'/>
							</button>
							<input type="hidden" id="resetPassword" name="resetPassword" value="false" />
						</div>
		   			</div>
		   		</div>
		   		<div class="row">
		   			<div class="col-lg-7">
		   				<div class="form-group">
							<label for="email"><spring:message code='label.user.email' htmlEscape='false'/></label>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="fa fa-envelope"></i>
								</div>
								<input type="email" class="form-control" id="email" name="email" 
									placeholder="<spring:message code='label.user.email' htmlEscape='false'/>" 
									required>
							</div>
						</div>
		   			</div>
		   			<div class="col-lg-5">
		   				<div class="form-group">
							<label for="dob"><spring:message code='label.user.dob' htmlEscape='false'/></label>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="fa fa-calendar"></i>
								</div>
	                           	<input class="form-control date-picker" type="text" id="dob" name="dob" 
	                           		placeholder="<spring:message code='label.user.dob' htmlEscape='false'/>" datatype="date">	<!-- date/datetime/time -->
	                        </div>
						</div>
		   			</div>
		   		</div>
		   		<div class="row">
		   			<div class="col-lg-6">
		   				<div class="form-group">
							<label for="language_ID"><spring:message code='label.user.language' htmlEscape='false'/></label>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="fa fa-book"></i>
								</div>
		   						<select id="language_ID" name="language_ID" 
		   								data-placeholder="<spring:message code='label.user.language' htmlEscape='false'/>" 
		   								class="form-control chzn-select-deselect" required  
		   								ajaxUrl="${pageContext.request.contextPath}/api/lang/listpair"
		   								localstoragex="language" timeout="0">
	                            	<option value=""></option>
	                          	</select>
							</div>
						</div>
					</div>
					<div class="col-lg-6" align="center">
						<img id="preview" alt="Select avatar" width="60" height="80" src="" onclick="openUploadFile()" />
					</div>
				</div>
				
				<div class="row">
		   			<div class="col-lg-12">
		   				<!-- <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/> -->
		   				<table>
		   					<thead>
		   						<tr>
		   							<th>ID</th>
		   							<th>Code</th>
		   							<th>Name</th>
		   						</tr>
		   					</thead>
		   					<tbody id="languages[]" name="languages[]" childTag='tr'>
		   						<tr>
		   							<td>
		   								<select id="languages[][id]" name="languages[][id]" 
				   								data-placeholder="<spring:message code='label.user.language' htmlEscape='false'/>" 
				   								class="form-control multiselect xxchzn-select-deselect" required  
				   								ajaxUrl="${pageContext.request.contextPath}/api/lang/listpair"
				   								preloaded localstoragex="language" timeout="0">
			                            	<option value=""></option>
			                          	</select>
									</td>
									<td>
		   								<input type="text" class="form-control" id="languages[][code]" name="languages[][code]" /> 
									</td>
									<td>
		   								<input type="text" class="form-control" id="languages[][name]" name="languages[][name]" /> 
									</td>
		   						</tr>
		   					</tbody>
		   				</table>
		   			</div>
		   		</div>
		   	</fieldset>
		</form>
	</div> <!-- modal-body -->
	
	<div class="modal-footer">
		<!-- <input id="upload" type="file" name="file" multiple style="opacity: 0; filter:alpha(opacity: 0);" /> -->
		
		<!-- The table listing the files available for upload/download -->
		<!-- <table role="presentation" class="table table-striped">
			<tbody class="files"></tbody>
		</table> -->
		
		<div id="dlg-buttons-person">
			<a href="javascript:void(0)" class="btn btn-primary btn-flat" onclick="saveBean()">
				<i class="fa fa-save"></i>
				<spring:message code='label.save'/>
			</a>
			<a href="javascript:void(0)" class="btn btn-default btn-flat" onclick="closeBeanDialog()">
				<i class="fa fa-times"></i>
				<spring:message code='label.cancel'/>
			</a>
		</div>
	</div>
</div>

<script type="text/javascript">
	function onResetPassword() {
		$('#resetPassword').val('Y'); 
	}
	
	$(function(){
		/* $('#upload').fileupload({
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

				$('#preview').attr('src', URL.createObjectURL(data.files[0]));
				
				$("#btnUpload").on('click', function () {
		            data.submit();
		        });
			}, 
			
			done: function (e, data) {
		        console.log(e);
		        console.log(data);
		        
		        $('#uploadButton').removeClass('btn-warning');
		        $('#uploadButton').addClass('btn-success');
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
	});
</script>