/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
var PERSONAL_DATE_FORMAT = "DD/MM/YYYY";
var PERSONAL_TIME_FORMAT = "HH:mm:ss";
var PERSONAL_DATE_TIME_FORMAT = "DD/MM/YYYY HH:mm:ss";

var PERSONAL_DATE_PATTERN = /^(\d{1,2})\/(\d{1,2})\/(\d{4})$/; //   /^(\d{1,2})(\/|-)(\d{1,2})(\/|-)(\d{4})$/;
var PERSONAL_TIME_PATTERN = /^(\d{1,2}):(\d{2})(:00)?([ap]m)?$/;
var PERSONAL_DATE_TIME_PATTERN = "";

/***** Format Date Time from string **************/
function formatDateTimeValue(val, format) {
	if (!val)
        return val;
	
	try {
		var now = new Date(val);
		return moment(now).format(format);
	} catch (e) {}

	return val;
}

function formatDateTime(val) {
	return formatDateTime(val, -1);
}

function formatDateTime(val, row) {
	return formatDateTimeValue(val, PERSONAL_DATE_TIME_FORMAT);
}

function formatDate(val) {
	return formatDate(val, -1);
}

function formatDate(val, row) {
	return formatDateTimeValue(val, PERSONAL_DATE_FORMAT);
}

/***** Format Date Time from date **************/
function formatInputDateTime(now) {
	return moment(now).format(PERSONAL_DATE_TIME_FORMAT);
}

function formatInputDate(now) {
	return moment(now).format(PERSONAL_DATE_FORMAT);
}

function formatColumn(colName, value, row, index) {
    return eval("row." + colName);
}

/***** Parse Date Time from string **************/
function parseDateTimeValue(val, format) {
	if (!val || val == ''){
        return new Date();
    }
	
	try {
	    if (isNaN(val)){
	    	return moment(val, format).toDate();
	    } else {
	    	return new Date(val);
	    }
	} catch (e) {}
	
	return new Date();
}

function parseDate(val) {
    return parseDateTimeValue(val, PERSONAL_DATE_FORMAT);
}

function parseDateTime(val) {
	return parseDateTimeValue(val, PERSONAL_DATE_TIME_FORMAT);
}