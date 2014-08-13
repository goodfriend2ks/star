<div class="modal fade" id="dlg-lang" data-backdrop="static" data-keyboard="true" data-width="700">
	<div class="modal-header modal-dialog-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<div class="modal-title">
			<i class="fa fa-book"></i> <span id="dlg-lang-title"></span>
		</div>
	</div>
	<div class="modal-body">
		<form id="fm-lang" method="post" class="fm" novalidate>
			<fieldset>
				<div class="row">
					<div class="col-lg-8">
						<div class="form-group">
							<label for="name" class="nowrap"><spring:message code='label.lang.name'/></label>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="fa fa-align-justify"></i>
								</div>
								<input type="text" class="form-control focus" id="name" name="name" 
									placeholder="<spring:message code='label.lang.name'/>" autofocus required>
							</div>
						</div>
					</div>
		   			<div class="col-lg-4">
		   				<div class="form-group">
							<label for="code" class="nowrap"><spring:message code='label.lang.code'/></label>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="fa fa-align-justify"></i>
								</div>
								<input type="text" class="form-control" id="code" name="code" 
									placeholder="<spring:message code='label.lang.code'/>"
									maxlength="30" data-bv-message="The username is not valid" 
									pattern="[a-zA-Z0-9]+" data-bv-regexp-message="The username can only consist of alphabetical, number"
									required data-bv-notempty-message="The username is required and cannot be empty">
							</div>
						</div>
					</div>
				</div>
				<div class="row">
		   			<div class="col-lg-4">
		   				<div class="form-group">
							<label for="datePattern" class="nowrap"><spring:message code='label.lang.datepattern'/></label>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="fa fa-calendar"></i>
								</div>
								<input type="text" class="form-control" id="datePattern" name="datePattern" 
									placeholder="<spring:message code='label.lang.datepattern'/>" required>
							</div>
						</div>
		   			</div>
		   			<div class="col-lg-4">
		   				<div class="form-group">
							<label for="timePattern" class="nowrap"><spring:message code='label.lang.timepattern'/></label>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="fa fa-calendar"></i>
								</div>
	                           	<input type="text" class="form-control" id="timePattern" name="timePattern" 
	                           		placeholder="<spring:message code='label.lang.timepattern'/>" required>
	                        </div>
						</div>
					</div>
					<div class="col-lg-4">
		   				<div class="form-group">
			   				<label class="nowrap">&nbsp;</label>
							<div class="input-group">
								<input type="checkbox" class="btn btn-danger btn-flat" 
									id="decimalPoint" name="decimalPoint" value="Y" />
								<label for="decimalPoint" class="nowrap"><spring:message code='label.lang.decimalpoint'/></label>
							</div>
						</div>
		   			</div>
				</div>
			</fieldset>
		</form>
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
</div>