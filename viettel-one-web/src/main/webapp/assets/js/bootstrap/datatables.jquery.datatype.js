/**
 *  @name Commas for decimal place
 *  @summary Sort numbers correctly which use a common as the decimal place.
 *  @deprecated
 *  @author [Allan Jardine](http://sprymedia.co.uk)
 *
 *  @example
 *    $('#example').dataTable( {
 *       columnDefs: [
 *         { type: 'numeric-comma', targets: 0 }
 *       ]
 *    } );
 */
jQuery.extend( jQuery.fn.dataTableExt.oSort, {
	"numeric-comma-pre": function ( a ) {
		var x = (a == "-") ? 0 : a.replace( /,/, "." );
		return parseFloat( x );
	},

	"numeric-comma-asc": function ( a, b ) {
		return ((a < b) ? -1 : ((a > b) ? 1 : 0));
	},

	"numeric-comma-desc": function ( a, b ) {
		return ((a < b) ? 1 : ((a > b) ? -1 : 0));
	}
} );

/**
 *  @name Numbers with HTML
 *  @summary Sort data which is a mix of HTML and numeric data.
 *  @deprecated
 *  @author [Allan Jardine](http://sprymedia.co.uk)
 *
 *  @example
 *    $('#example').dataTable( {
 *       columnDefs: [
 *         { type: 'num-html', targets: 0 }
 *       ]
 *    } );
 */
jQuery.extend( jQuery.fn.dataTableExt.oSort, {
	"num-html-pre": function ( a ) {
		var x = String(a).replace( /<[\s\S]*?>/g, "" );
		return parseFloat( x );
	},

	"num-html-asc": function ( a, b ) {
		return ((a < b) ? -1 : ((a > b) ? 1 : 0));
	},

	"num-html-desc": function ( a, b ) {
		return ((a < b) ? 1 : ((a > b) ? -1 : 0));
	}
} );

/**
 *  @name Percentage
 *  @summary Sort numeric data with a postfixed percentage symbol
 *  @deprecated
 *  @author [Jonathan Romley](http://jonathanromley.org/)
 *
 *  @example
 *    $('#example').dataTable( {
 *       columnDefs: [
 *         { type: 'percent', targets: 0 }
 *       ]
 *    } );
 */
jQuery.extend( jQuery.fn.dataTableExt.oSort, {
	"percent-pre": function ( a ) {
		var x = (a == "-") ? 0 : a.replace( /%/, "" );
		return parseFloat( x );
	},

	"percent-asc": function ( a, b ) {
		return ((a < b) ? -1 : ((a > b) ? 1 : 0));
	},

	"percent-desc": function ( a, b ) {
		return ((a < b) ? 1 : ((a > b) ? -1 : 0));
	}
} );

/**
 *  @name Fully signed numbers sorting 
 *  @summary Sort data numerically with a leading `+` symbol (as well as `-`).
 *  @author [Allan Jardine](http://sprymedia.co.uk)
 *
 *  @example
 *    $('#example').dataTable( {
 *       columnDefs: [
 *         { type: 'signed-num', targets: 0 }
 *       ]
 *    } );
 */
jQuery.extend( jQuery.fn.dataTableExt.oSort, {
	"signed-num-pre": function ( a ) {
		return (a=="-" || a==="") ? 0 : a.replace('+','')*1;
	},

	"signed-num-asc": function ( a, b ) {
		return ((a < b) ? -1 : ((a > b) ? 1 : 0));
	},

	"signed-num-desc": function ( a, b ) {
		return ((a < b) ? 1 : ((a > b) ? -1 : 0));
	}
} );