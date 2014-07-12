<div class="modal fade" id="dlg-user" aria-hidden="true" data-backdrop="static" role='dialog'>
	<div class="modal-dialog" style="width:700px;height:350px;">
		<div class="modal-content">
			
    		<div class="modal-header modal-dialog-header">
  				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
  				<div class="modal-title" id="myModalLabel">
					<i class="fa fa-user-md"></i> New Event
				</div>
			</div>
			
			<form id="fm-user" method="post" class="fm" role="form" novalidate>
  				<fieldset>
	    			<div class="modal-body">
   	
				   		<div class="row">
				   			<div class="col-lg-5">
				   				<div class="form-group">
									<label for="name">Full Name</label>
									<div class="input-group">
										<div class="input-group-addon">
											<i class="fa fa-user-md"></i>
										</div>
										<input type="text" class="form-control focus" id="name" name="name" 
											placeholder="Full name" autofocus required>
									</div>
								</div>
				   			</div>
				   			<div class="col-lg-4">
				   				<div class="form-group">
									<label for="userName">UserName</label>
									<div class="input-group">
										<div class="input-group-addon">
											<i class="fa fa-user"></i>
										</div>
										<input type="text" class="form-control" id="userName" name="userName" 
											placeholder="Username"
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
										<i class="fa fa-key"></i> Reset pass
									</button>
								</div>
				   			</div>
				   		</div>
				   		<div class="row">
				   			<div class="col-lg-7">
				   				<div class="form-group">
									<label for="email">Email</label>
									<div class="input-group">
										<div class="input-group-addon">
											<i class="fa fa-envelope"></i>
										</div>
										<input type="email" class="form-control" id="email" name="email" 
											placeholder="Full name" required>
									</div>
								</div>
				   			</div>
				   			<div class="col-lg-5">
				   				<div class="form-group">
									<label for="dob">DOB</label>
									<div class="input-group">
										<div class="input-group-addon">
											<i class="fa fa-calendar"></i>
										</div>
			                           	<input class="form-control date-picker" type="text" id="dob" name="dob" 
			                           		placeholder="DOB [dd/mm/yyyy]" datatype="date">	<!-- date/datetime/time -->
			                        </div>
								</div>
				   			</div>
				   		</div>
				   		<div class="row">
				   			<div class="col-lg-6">
				   				<div class="form-group">
									<label for="email">Language</label>
									<div class="input-group">
										<div class="input-group-addon">
											<i class="fa fa-calendar"></i>
										</div>
				   						<select id="c_Language_ID" name="c_Language_ID" data-placeholder="Select language" 
				   								class="form-control chzn-select-deselect" required  
				   								ajaxUrl="${pageContext.request.contextPath}/api/lang/listpair">
			                            	<option value=""></option>
			                          	</select>
									</div>
								</div>
							</div>
							<div class="col-lg-6" align="center">
								<img id="preview" alt="Select avatar" width="60" height="80" src="" onclick="openUploadFile()" />
								<!-- <span id="uploadButton" class="btn btn-warning fileinput-button">
				                    <img id="preview" alt="Select avatar" width="60" height="80" src="">
				                    <input type="file" id="upload" name="file" multiple>
				                </span> -->
				                
				   				<!-- <div class="form-group">
									<label for="dob">DOB</label>
									<div class="input-group">
										<div class="input-group-addon">
											<i class="fa fa-calendar"></i>
										</div>
										<select id="opq[]" name="opq[]" data-placeholder="Your Favorite Types of Bear" 
												multiple class="form-control chzn-select">
											<option value=""></option>
											<option>American Black Bear</option>
											<option>Asiatic Black Bear</option>
											<option>Brown Bear</option>
											<option>Giant Panda</option>
											<option selected>Sloth Bear</option>
											<option disabled>Sun Bear</option>
											<option>Polar Bear</option>
											<option disabled>Spectacled Bear</option>
										</select>
									</div>
								</div> -->
							</div>
						</div>
						<%-- <div class="row">
				   			<div class="col-lg-6">
				   				<div class="form-group">
									<label for="email">Email</label>
									<div class="input-group">
										<div class="input-group-addon">
											<i class="fa fa-calendar"></i>
										</div>
										<select class="multiselect" multiple="multiple" 
												ajaxUrl="${pageContext.request.contextPath}/api/lang/listpair">
											<option value="cheese">Cheese</option>
											<option value="tomatoes">Tomatoes</option>
											<option value="mozarella">Mozzarella</option>
											<option value="mushrooms">Mushrooms</option>
											<option value="pepperoni">Pepperoni</option>
											<option value="onions">Onions</option>
										</select>
									</div>
								</div>
							</div>
							<div class="col-lg-6">
				   				<div class="form-group">
									<label for="email">Email</label>
									<div class="input-group">
										<div class="input-group-addon">
											<i class="fa fa-calendar"></i>
										</div>
										<select class="multiselect">
											<option value="cheese">Cheese</option>
											<option value="tomatoes">Tomatoes</option>
											<option value="mozarella">Mozzarella</option>
											<option value="mushrooms">Mushrooms</option>
											<option value="pepperoni">Pepperoni</option>
											<option value="onions">Onions</option>
										</select>
									</div>
								</div>
							</div>
						</div> --%>
	   				</div> <!-- modal-body -->
	   				
	   				<div class="modal-footer">
	   					<!-- <input id="upload" type="file" name="file" multiple style="opacity: 0; filter:alpha(opacity: 0);" /> -->
	   					
	   					<!-- The table listing the files available for upload/download -->
        				<!-- <table role="presentation" class="table table-striped">
        					<tbody class="files"></tbody>
        				</table> -->
        				
        				
	   					<!-- <input type="hidden" id="resetPassword" name="resetPassword" value="false" /> -->
	   					<div id="dlg-buttons-person">
							<a href="javascript:void(0)" class="btn btn-primary btn-flat" onclick="saveBean()">
								<i class="fa fa-save"></i>
								<spring:message code='label.save'/>
							</a>
			   				<a href="javascript:void(0)" class="btn btn-default btn-flat" onclick="closeBeanDialog()">
			   					<i class="fa fa-times"></i>
			   					<spring:message code='label.cancel'/>
			   				</a>
			   				
			   				<a href="javascript:void(0)" class="btn btn-default btn-flat" id="btnUpload">
			   					<i class="fa fa-times"></i> Upload
			   				</a>
						</div>
					</div>
	   			</fieldset>
			</form>
		</div>
	</div>
</div>

<script type="text/javascript">
	function onResetPassword() {
		$('#resetPassword').val('true'); 
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