<div class="modal fade" id="dlg-area" data-backdrop="static" data-keyboard="true" data-width="760">
	<div class="modal-header modal-dialog-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<div class="modal-title">
			<i class="fa fa-location-arrow"></i> <span id="dlg-area-title"></span>
		</div>
	</div>
	
	<div class="modal-body">
		<form id="fm-area" method="post" class="fm" novalidate>
			<fieldset>
			<div class="row">
				<div class="col-lg-8">
					<div class="form-group">
						<label for="name"><spring:message code='label.area.name'/></label>
						<div class="input-group">
							<div class="input-group-addon">
								<i class="fa fa-user-md"></i>
							</div>
							<input type="text" class="form-control focus" id="name" name="name" 
								placeholder="<spring:message code='label.area.name'/>" autofocus required>
						</div>
					</div>
				</div>
	   			<div class="col-lg-4">
	   				<div class="form-group">
						<label for="code"><spring:message code='label.area.code'/></label>
						<div class="input-group">
							<div class="input-group-addon">
								<i class="fa fa-user"></i>
							</div>
							<input type="text" class="form-control" id="code" name="code" 
								placeholder="<spring:message code='label.area.code'/>"
								maxlength="30" data-bv-message="The username is not valid" 
								pattern="[a-zA-Z0-9]+" data-bv-regexp-message="The username can only consist of alphabetical, number"
								required data-bv-notempty-message="The username is required and cannot be empty">
						</div>
					</div>
	   			</div>
	   		</div>
	   		<div class="row">
	   			<div class="col-lg-12">
	   				<div class="form-group">
						<label for="parent_ID"><spring:message code='label.area.parent'/></label>
						<div class="input-group">
							<div class="input-group-addon">
								<i class="fa fa-envelope"></i>
							</div>
							<select id="parent_ID" name="parent_ID" 
	   								data-placeholder="<spring:message code='label.area.parent' htmlEscape='false'/>" 
	   								class="form-control chzn-select-deselect"   
	   								ajaxUrl="${pageContext.request.contextPath}/api/area/listpair"
	   								localstoragex="area" timeout="0">
	                           	<option value=""></option>
	                         	</select>
						</div>
					</div>
	   			</div>
	   		</div>
	   		<div class="row">
	   			<div class="col-lg-12">
	   				<div class="form-group">
	   					<input type="text" id="latitude" name="latitude" />
						<input type="text" id="longitude" name="longitude" />
						<button id="xyz" type="button" onclick="loadMap()">XYZZZ</button>
						<div id="map" class="map hide" style="width:100%; height:250px;"></div>
					</div>
	   			</div>
	   		</div>
	   		</fieldset>
		</form>
	</div> <!-- modal-body -->
	
	<div class="modal-footer">
		<input id="pac-input" class="form-control" type="text" placeholder="Enter a location" noserialize>
		<div id="type-selector" class="form-control">
			<input type="radio" name="type" id="changetype-all" value="changetype-all" checked="checked" noserialize>
			<label for="changetype-all">All</label>

			<input type="radio" name="type" id="changetype-establishment" value="changetype-establishment" noserialize>
			<label for="changetype-establishment">Establishments</label>

			<input type="radio" name="type" id="changetype-geocode" value="changetype-geocode" noserialize>
			<label for="changetype-geocode">Geocodes</label>
		</div>
    
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