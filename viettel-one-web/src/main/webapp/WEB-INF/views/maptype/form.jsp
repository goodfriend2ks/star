<div class="modal fade" id="dlg-maptype" data-backdrop="static" data-keyboard="true" data-width="850">
	<div class="modal-header modal-dialog-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<div class="modal-title">
			<i class="fa fa-book"></i> <span id="dlg-maptype-title"></span>
		</div>
	</div>
	<div class="modal-body">
		<form id="fm-maptype" method="post" class="fm" novalidate>
			<fieldset>
				<div class="row">
					<div class="col-lg-8">
						<div class="form-group">
							<label for="name" class="nowrap"><spring:message code='label.maptype.name'/></label>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="fa fa-align-justify"></i>
								</div>
								<input type="text" class="form-control focus" id="name" name="name" 
									placeholder="<spring:message code='label.maptype.name'/>" autofocus required>
							</div>
						</div>
					</div>
		   			<div class="col-lg-4">
		   				<div class="form-group">
							<label for="code" class="nowrap"><spring:message code='label.maptype.code'/></label>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="fa fa-align-justify"></i>
								</div>
								<input type="text" class="form-control" id="code" name="code" 
									placeholder="<spring:message code='label.maptype.code'/>"
									maxlength="30" required>
							</div>
						</div>
					</div>
				</div>
				
				<div class="row">
		   			<div class="col-lg-12">
		   				<table>
		   					<thead>
		   						<tr>
		   							<th>#</th>
		   							<th>Property Name</th>
		   							<th>Property Type</th>
		   							<th>Input Name</th>
		   							<th>Input Type</th>
		   							<th>Java Code</th>
		   						</tr>
		   					</thead>
		   					<tbody class="inlineDetail" id="details[]" name="details[]" childTag='tr'>
		   						<tr class="edit-mode">
		   							<td nowrap="nowrap">
		   								<input type="hidden" class="editable" id="details[][id]" name="details[][id]" />
		   								<input type="hidden" id="details[][action]" name="details[][action]" value="A" />
		   								<a href="javascript:void(0)" class="btn btn-primary btn-flat btn-edit-inline" onclick="editInlineBean(this)">
											<i class="fa fa-edit"></i>
										</a>
		   								<a href="javascript:void(0)" class="btn btn-primary btn-flat btn-new-inline" onclick="newInlineBean(this)">
											<i class="fa fa-plus"></i>
										</a>
										<a href="javascript:void(0)" class="btn btn-primary btn-flat btn-del-inline" onclick="deleteInlineBean(this)">
											<i class="fa fa-cut"></i>
										</a>
										<a href="javascript:void(0)" class="btn btn-primary btn-flat btn-cancel-inline" onclick="cancelInlineBean(this)">
											<i class="fa fa-undo"></i>
										</a>
		   							</td>
									<td>
		   								<input type="text" class="form-control editable" id="details[][propertyName]" name="details[][propertyName]" style="width:120px" /> 
									</td>
									<td>
		   								<input type="text" class="form-control editable" id="details[][propertyType]" name="details[][propertyType]" style="width:120px" /> 
									</td>
									<td>
		   								<input type="text" class="form-control editable" id="details[][inputPropertyName]" name="details[][inputPropertyName]" style="width:120px" /> 
									</td>
									<td>
		   								<input type="text" class="form-control editable" id="details[][inputPropertyType]" name="details[][inputPropertyType]" style="width:120px" /> 
									</td>
									<td>
		   								<input type="text" class="form-control editable newlinewhenblur" id="details[][javaCode]" name="details[][javaCode]" style="width:210px" /> 
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
	function editInlineBean(line) {
		var $row = $(line).closest('tr');
		var $body = $row.closest('tbody');
		
		var $inputs = $row.find('input.editable');
		var $selects = $row.find('select.editable');
		$.each($inputs, function() {
		    $(this).attr('readonly', false);
		});
		$.each($selects, function() {
			$(this).attr('readonly', false);
		});
		
		$row.removeClass('delete-mode').addClass('edit-mode');
		$row.find('input[name="' + $body.attr('name') + '[action]"]').val('E');
	}

	function deleteInlineBean(line) {
		var $row = $(line).closest('tr');
		var $body = $row.closest('tbody');
		
		var $inputs = $row.find('input.editable');
		var $selects = $row.find('select.editable');
		$.each($inputs, function() {
		    $(this).attr('readonly', true);
		});
		$.each($selects, function() {
			$(this).attr('readonly', true);
		});
		
		$row.removeClass('edit-mode').addClass('delete-mode');
		$row.find('input[name="' + $body.attr('name') + '[action]"]').val('D');
	}
	
	function cancelInlineBean(line) {
		var $row = $(line).closest('tr');
		var $body = $row.closest('tbody');
		
		var $inputs = $row.find('input.editable');
		var $selects = $row.find('select.editable');
		$.each($inputs, function() {
		    $(this).attr('readonly', true);
		});
		$.each($selects, function() {
			$(this).attr('readonly', true);
		});

		$row.removeClass('edit-mode').removeClass('delete-mode');
		$row.find('input[name="' + $body.attr('name') + '[action]"]').val('N');
	}

	function newInlineBean(line) {
		var $row = $(line).closest('tr');
		var $body = $row.closest('tbody');
		var $newrow = $row.clone();
		
		var $inputs = $newrow.find('input.editable');
		var $selects = $newrow.find('select.editable');
		$.each($inputs, function() {
		    $(this).attr('readonly', false);
		    $(this).val('');
		});
		$.each($selects, function() {
			$(this).attr('readonly', false);
			$(this).val('');
		});
		$row.after($newrow);
		
		$newrow.removeClass('delete-mode').addClass('edit-mode');
		$newrow.find('input[name="' + $body.attr('name') + '[action]"]').val('A');
	}
</script>