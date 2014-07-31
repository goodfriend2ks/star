<!-- <div id="dlg-person" class="easyui-dialog" style="width:700px;height:350px;"
           closed="true" buttons="#dlg-buttons-person" modal="true"> -->
	<!-- <div class="ftitle">Person Information</div> -->
	
<div class="modal fade" id="dlg-lang" aria-hidden="true" data-backdrop="static" role='dialog'>
	<div class="modal-dialog" style="width:700px;height:350px;">
		<div class="modal-content">
			
    		<div class="modal-header modal-dialog-header">
  				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
  				<div class="modal-title">
					<i class="fa fa-user-md"></i> Language
				</div>
			</div>
			
			<form id="fm-lang" method="post" class="fm" role="form" novalidate>
  				<fieldset>
	    			<div class="modal-body">
   	
				   		<div class="row">
				   			<div class="col-lg-8">
				   				<div class="form-group">
									<label for="name">Name</label>
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
									<label for="code">Code</label>
									<div class="input-group">
										<div class="input-group-addon">
											<i class="fa fa-user"></i>
										</div>
										<input type="text" class="form-control" id="code" name="code" 
											placeholder="Language Code"
											maxlength="30" data-bv-message="The username is not valid" 
											pattern="[a-zA-Z0-9]+" data-bv-regexp-message="The username can only consist of alphabetical, number"
											required data-bv-notempty-message="The username is required and cannot be empty">
									</div>
								</div>
				   			</div>
				   		</div>
				   		<div class="row">
				   			<div class="col-lg-6">
				   				<div class="form-group">
									<label for="datePattern">Date Pattern</label>
									<div class="input-group">
										<div class="input-group-addon">
											<i class="fa fa-envelope"></i>
										</div>
										<input type="text" class="form-control" id="datePattern" name="datePattern" 
											placeholder="Date Pattern" required>
									</div>
								</div>
				   			</div>
				   			<div class="col-lg-6">
				   				<div class="form-group">
									<label for="timePattern">Time Pattern</label>
									<div class="input-group">
										<div class="input-group-addon">
											<i class="fa fa-calendar"></i>
										</div>
			                           	<input type="text" class="form-control" id="timePattern" name="timePattern" 
			                           		placeholder="Time Pattern" required>
			                        </div>
								</div>
				   			</div>
				   		</div>
				   		<div class="row">
				   			<div class="col-lg-8">
				   				<div class="form-group">
									<!-- <label for="dateTimePattern">Date Time Pattern</label>
									<div class="input-group">
										<div class="input-group-addon">
											<i class="fa fa-calendar"></i>
										</div>
			                           	<input type="text" class="form-control" id="dateTimePattern" name="dateTimePattern" 
			                           		placeholder="Date Time Pattern" required>
			                        </div> -->
								</div>
				   			</div>
				   			<div class="col-lg-4">
				   				<div class="form-group">
									<label for="decimalPoint" class="nowrap">Decimal Point</label>
									<div class="input-group">
										<input type="checkbox" class="btn btn-danger btn-flat" 
											id="decimalPoint" name="decimalPoint" value="Y" />
									</div>
								</div>
				   			</div>
				   		</div>
	   				</div> <!-- modal-body -->
	   				
	   				<div class="modal-footer">
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
	   			</fieldset>
			</form>
		</div>
	</div>
</div>