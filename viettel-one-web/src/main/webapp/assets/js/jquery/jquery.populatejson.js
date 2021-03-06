/**
 * @name jsonform.js: for jQuery JsonForm Plugin
 * @description Create standard JSON from Forms or populate form with json using jQuery.
 * @requires jquery.js
 * @link Github: [https://github.com/milfont/jsonform](https://github.com/milfont/jsonform "https://github.com/milfont/jsonform") 
 * @author Christiano Milfont <cmilfont@gmail.com>
 * @license Copyright Milfont Consulting.
 * Dual licensed under the MIT or GPL Version 2 licenses.
 * http://jquery.org/license
 */
(function ($) {

    /** @memberOf jQuery */
    $.fn.extend({
        /**
         * @version stable
         */
        version: '1.2.5',
        
        /**
         *
         * Example: with ID for legacy code
         *     var lancamento = {
         *         empresa: {id: 2, name: "Teste"},
         *         partidas: [
         *             {conta: {codigo:"1.02.0002", nome: "Compras"}, natureza: "1"},
         *             {conta: {codigo:"1.02.0001", nome: "Banco"}, natureza: "-1"}
         *         ],
         *         description: "Teste",
         *         value: "125,67",
         *         date: "12/03/1999"
         *     };
         *     $('#form_id').populate(lancamento, true);
         */
         
         /** 
         * Example: with name [default]
         *     var lancamento = {
         *         empresa: {id: 2, name: "Teste"},
         *         partidas: [
         *             {conta: {codigo:"1.02.0002", nome: "Compras"}, natureza: "1"},
         *             {conta: {codigo:"1.02.0001", nome: "Banco"}, natureza: "-1"}
         *         ],
         *         description: "Teste",
         *         value: "125,67",
         *         date: "12/03/1999"
         *     };
         *     $("[name='form_name'").populate(lancamento);
         */
         
         /**
         * @name populate
         * @desc Populate form with json using jQuery. Resolve nested objects. 
         * @param {Object} json Standard JSON to populate FORM
         * @param {Boolean} [optional] byId find inputs with query by id
         * @returns {jQuery} jQuery
         * @type jQuery
         * @cat Plugins/jsonform
         */
        populate: function(json, byId) {

            var eachElementIsNotObject = function(value) {
                return ( value.every(function(val){
                                        return typeof val != "object"; 
                                    })
                        );
            };
            
            var setValue = function(input, value, isArray) {
            	if (!isArray || input.length == 1) {
	            	if (input.is(':checkbox')) {
	            		input.prop("checked", (value == input.val()) );
	            	} else if (input.is(':radio')) {
	            		for (var i=0; i<input.length; i++) {
	            			var child = $(input[i]);
	            			child.prop("checked", (value == child.val()) );
	            		}
	            	} else {
	            		input.val(value);
	            	}
            	} else {
            		var len = value.length;
                	for (var i=0; i<input.length; i++) {
                		var child = $(input[i]);
                		if (child.is(':checkbox')) {
                			var val = child.val();
                			var checked = false;
                			for (var j=0; j<value.length; j++) {
                				if (val == value[j]) {
                					checked = true;
                					break;
                				}
                			}
                			
                			child.prop("checked", checked );
                		} else if (i < len) {
	                		setValue(child, value[i], false);
                		}
                	}
            	}
            };
            
            var self = this;
            (function roam(el, father) {
            	var coords = null;
                for (var property in el) {
                    if (el[property] || el[property] === 0) {
                        var value = el[property];
                        var isArrayValue = $.isArray(value); 
                        
                        if (typeof value == "object" && !(isArrayValue && eachElementIsNotObject(value) ) ) {
                            var parent = (!father)? property : father + "\[" + property + "\]";
                            //alert("1:" + parent);
                            if (isArrayValue) {
                            	var name = ((father)? father + "\[" + property + "\]" : property) 
				                				+ (isArrayValue ? "\[\]" : "");
				                var query = "[name='" + name + "']";
				                if(byId) { query = ("#" + name); }
				                
				                var root = self.find(query);
				                var childTag = null;
				                var lastChild = null;
				                
				                /*if (root && root.size() > 0) {
					                childTag = root.attr('childTag');
					                root.find(childTag).each(function(i){
					                	if (i > 0) {
					                		$(this).remove();
					                	}
					                });
				                }*/
				                
				                for (var item in value) {
                                    if ('clean' != item && value[item]) {
                                    	if (lastChild) {
	        				                var newChild = lastChild.clone();
	        				                newChild.find('input').each(function(){
	        				                	$(this).val('');
	        				                	/*if ($(this).hasClass('editable')) {
	        				                		$(this).attr('readonly', true);
	        				                	}*/
	        				                });
	        				                
	        				                newChild.find('select').each(function(){
	        				                	$(this).val('');
	        				                	/*if ($(this).hasClass('editable')) {
	        				                		$(this).attr('readonly', true);
	        				                	}*/
	        				                });
	        				                
	        				                lastChild.after(newChild);
	        				                lastChild = newChild;
                                    	} else if (root && root.size() > 0) {
                                        	lastChild = root.find(childTag + ':last');
                                        	
                                        	/*lastChild.find('input.editable').each(function(i){
	        				                	$(this).attr('readonly', true);
	        				                });
	        				                
                                        	lastChild.find('select.editable').each(function(i){
	        				                	$(this).attr('readonly', true);
	        				                });*/
                                        }
                                    	
                                        var parent_arr = parent + "\\["+item+"\\]";
                                        //alert("2:" + parent_arr)
                                        roam(value[item], parent_arr);
                                    }
                                }
                            } else {
                                roam(value, parent);
                            }
                            parent = null;
                        } else {
                            var name = ((father)? father + "\[" + property + "\]" : property) 
                            				+ (isArrayValue ? "\[\]" : "");
                            var query = "[name='" + name + "']";
                            if(byId) { query = ("#" + name); }
                            
							var other = self.find(query);
							
							//if (isArrayValue)
							//alert("4:" + name + "=" + value + "=" + other + "=" + other.length);
							
                            if(other.length === 0){
                                var selector = query.replace(/\\\[(\d+)?\\\]/g, "\\[\\]"), 
                                    numChave = name.replace(/[^\\\[(\d+)?\\\]]/g, ""), 
                                    index = numChave.replace(/[^\d+]/g, "");
                                
                                other = self.find(selector).eq(index);
                                //alert("3:" + name + "=" + value + "=" + other + "=" + other.val());
                            }
                            
                            setValue(other, value, isArrayValue);
                            
                            if ('latitude' === name) {
                            	if (coords == null)
                            		coords = [value, 105.85232203459168];
                            	else
                            		coords[0] = value;
                            }
                            
                            if ('longitude' === name) {
                            	if (coords == null)
                            		coords = [21.02782551610964, value];
                            	else
                            		coords[1] = value;
                            }
                        }
                    }
                }
                
                if (coords != null) {
                	if (mapInstance) {
                		moveBeanMarker(coords);
                		/*var position = new google.maps.LatLng(coords[0], coords[1]);
                		mapInstance.getMap().setCenter(position);
                		mapInstance.getMarker(mapMarkerId).setPosition(position);*/
                	} else {
                		setTimeout(loadBeanMap, 10);
                	}
                }
            })(json);
            return this;
        }
    });
	
	Object.Equals = Object.Equals || /*bool*/ function(obj1, obj2){
        return JSON.stringify(obj1) === JSON.stringify(obj2);
    };
	
    /*Array.prototype.clean = function() {
    	for (var i = 0; i < this.length; i++) {
    		if (this[i] === null || this[i] === undefined) {         
    			this.splice(i, 1);
    			i--;
    		}
    	}
    	return this;
	};*/
})(jQuery);