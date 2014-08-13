/********** jQuery Extended ********************/

/***** CENTER ELEMENTS **********/
(function($) {
    "use strict";
    jQuery.fn.center = function(parent) {
        if (parent) {
            parent = this.parent();
        } else {
            parent = window;
        }
        
        /*this.css({
            "position": "absolute",
            "top": ((($(parent).height() - this.outerHeight()) / 2) + $(parent).scrollTop() + "px"),
            "left": ((($(parent).width() - this.outerWidth()) / 2) + $(parent).scrollLeft() + "px")
        });*/
        
        this.css("position", "absolute");
        this.css("top", Math.max(0, (($(parent).height() - this.outerHeight()) / 2) +
                $(parent).scrollTop()) - 30 + "px");
        this.css("left", Math.max(0, (($(parent).width() - this.outerWidth()) / 2) +
                $(parent).scrollLeft()) + "px");
        
        return this;
    };
}(jQuery));

/***** ELEMENTS HAS ATTR **********/
(function($) {
    "use strict";
    jQuery.fn.hasAttr = function(name) {
    	return this.attr(name) !== undefined;
    };
}(jQuery));

/*********** ALERT & CONFIRM DIALOG ****************/
function ui() {}

ui.dialog = {};

ui.dialog.show = function (options) {
	var dialog_id = "dialog_" + parseInt(Date.now());
	
	var defaultOptions = {
			type: DIALOG_TYPE_PRIMARY,
            title: null,
            message: null,
            icon: null,
            closable: true,
            okButton: DIALOG_CONFIRM_OK,
            okIcon: null,
            cancelButton: DIALOG_CONFIRM_CANCEL,
            cancelIcon: null,
            callback: null,
            msgClass: null
    };
	options = $.extend(true, defaultOptions, options);
	
	if (!options.title || options.title === '') {
		if (options.type === DIALOG_TYPE_SUCCESS)
			options.title = 'Success';
		else if (options.type === DIALOG_TYPE_WARNING)
			options.title = 'Warning';
		else if (options.type === DIALOG_TYPE_DANGER)
			options.title = 'Danger';
		else if (options.type === DIALOG_TYPE_ERROR)
			options.title = 'Error';
		else 
			options.title = 'Information';
	}
	
	var tmpl = [
	            '<div id="', dialog_id, '" class="modal hide fade ', options.type, '" tabindex="-1" data-backdrop="static">',
	              '<div class="modal-header">',
	                '<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>',
	                '<div class="modal-title">',
	                	'<i class="fa ', options.icon, '"></i> ', options.title,
	                '</div>',
	              '</div>',
	              '<div class="modal-body ', options.msgClass, '">',
	                '<p>', options.message, '</p>',
	              '</div>',
	              '<div class="modal-footer">',
	              	'<button id="', dialog_id, '-btn-cancel" data-dismiss="modal" class="btn btn-default">',
	              		'<i class="fa ', options.cancelIcon, '"></i> ',
	              		options.cancelButton,
	              	'</button>',
	              	'<button id="', dialog_id, '-btn-ok" data-dismiss="ok" class="btn btn-primary">',
	              		'<i class="fa ', options.okIcon, '"></i> ',
	              		options.okButton, 
	              	'</button>',
	              '</div>',
	            '</div>'
	          ].join('');
	
	var modal = $(tmpl);
	
	if (!options.cancelButton || options.cancelButton === '') {
		modal.find('#' + dialog_id + '-btn-cancel').hide();
	} else if (options.callback) {
		modal.find('#' + dialog_id + '-btn-cancel').click(function(event) {
			options.callback(false);
			//confirmModal.modal('hide');
		});
	}
	
	modal.find('#' + dialog_id + '-btn-ok').click(function(event) {
		if (options.callback) {
			options.callback(true);
		}
		modal.modal('hide');
	});
	
	modal.modal('show');
	
	return modal;
};

ui.dialog.alert = function (message, title, options) {
	var defaultOptions = {
			type: DIALOG_TYPE_PRIMARY,
            title: title,
            message: message,
            icon: 'fa-comment',
            closable: true,
            okButton: DIALOG_CONFIRM_OK,
            okIcon: 'fa-check',
            cancelButton: null,
            cancelIcon: null,
            callback: null
    };
	options = $.extend(true, defaultOptions, options);
	
	return ui.dialog.show(options);
};

ui.dialog.confirm = function (message, title, options) {
	var defaultOptions = {
			type: DIALOG_TYPE_PRIMARY,
            title: title,
            message: message,
            icon: 'fa-question-circle',
            closable: true,
            okButton: DIALOG_CONFIRM_YES,
            okIcon: 'fa-check',
			cancelButton: DIALOG_CONFIRM_NO,
			cancelIcon: 'fa-times',
            callback: null
    };
	options = $.extend(true, defaultOptions, options);
	
	return ui.dialog.show(options);
};

var DIALOG_CONFIRM_YES 		= "Yes";
var DIALOG_CONFIRM_NO 		= "No";
var DIALOG_CONFIRM_OK 		= "OK";
var DIALOG_CONFIRM_CANCEL 	= "Cancel";
var DIALOG_CONFIRM_CLOSE 	= "Close";

var DIALOG_TYPE_DEFAULT 	= 'type-default';
var DIALOG_TYPE_INFO 		= 'type-info';
var DIALOG_TYPE_PRIMARY 	= 'type-primary';
var DIALOG_TYPE_SUCCESS 	= 'type-success';
var DIALOG_TYPE_WARNING 	= 'type-warning';
var DIALOG_TYPE_DANGER 		= 'type-danger';
var DIALOG_TYPE_ERROR 		= 'type-error';