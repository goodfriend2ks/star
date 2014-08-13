var left_side_width = 220; //Sidebar width in pixels

$(function() {
    "use strict";
    
    //Enable sidebar toggle
    $("[data-toggle='offcanvas']").click(function(e) {
        e.preventDefault();

        //If window is small enough, enable sidebar push menu
        if ($(window).width() <= 992) {
            $('.row-offcanvas').toggleClass('active');
            $('.left-side').removeClass("collapse-left");
            $(".right-side").removeClass("strech");
            $('.row-offcanvas').toggleClass("relative");
        } else {
            //Else, enable content streching
        	/*$('.left-side').toggleClass("collapse-left");
            	$(".right-side").toggleClass("strech");*/
        	
        	$('body').toggleClass("sidebar-left-mini");
        }
    });

    //Add hover support for touch devices
    $('.btn').bind('touchstart', function() {
        $(this).addClass('hover');
    }).bind('touchend', function() {
        $(this).removeClass('hover');
    });
    
    //Activate tooltips
    $("[data-toggle='tooltip']").tooltip();
    
    /*     
     * Add collapse and remove events to boxes
     */
    $("[data-widget='collapse']").click(function() {
        //Find the box parent        
        var box = $(this).parents(".box").first();
        //Find the body and the footer
        var bf = box.find(".box-body, .box-footer");
        if (!box.hasClass("collapsed-box")) {
            box.addClass("collapsed-box");
            bf.slideUp();
        } else {
            box.removeClass("collapsed-box");
            bf.slideDown();
        }
    });

    /*
     * ADD SLIMSCROLL TO THE TOP NAV DROPDOWNS
     * ---------------------------------------
     */
    /*$(".navbar .menu").slimscroll({
        height: "200px",
        alwaysVisible: false,
        size: "3px"
    }).css("width", "100%");*/

    /*
     * INITIALIZE BUTTON TOGGLE
     * ------------------------
     */
    $('.btn-group[data-toggle="btn-toggle"]').each(function() {
        var group = $(this);
        $(this).find(".btn").click(function(e) {
            group.find(".btn.active").removeClass("active");
            $(this).addClass("active");
            e.preventDefault();
        });

    });

    $("[data-widget='remove']").click(function() {
        //Find the box parent        
        var box = $(this).parents(".box").first();
        box.slideUp();
    });

    /* Sidebar tree view */
    //$(".sidebar .treeview").tree();

    /* 
     * Make sure that the sidebar is streched full height
     * ---------------------------------------------
     * We are gonna assign a min-height value every time the
     * wrapper gets resized and upon page load. We will use
     * Ben Alman's method for detecting the resize event.
     * 
     **/
    function _fix() {
        //Get window height and the wrapper height
        var height = $(window).height() - $("body > .header").height();
        $(".wrapper").css("min-height", height + "px");
        var content = $(".wrapper").height();
        //If the wrapper height is greater than the window
        if (content > height)
            //then set sidebar height to the wrapper
            $(".left-side, html, body").css("min-height", content + "px");
        else {
            //Otherwise, set the sidebar to the height of the window
            $(".left-side, html, body").css("min-height", height + "px");
        }
    }
    
    //Fire upon load
    _fix();
    //Fire when wrapper is resized
    $(".wrapper").resize(function() {
        _fix();
        fix_sidebar();
    });

    //Fix the fixed layout sidebar scroll bug
    fix_sidebar();

    /*
     * We are gonna initialize all checkbox and radio inputs to 
     * iCheck plugin in.
     * You can find the documentation at http://fronteed.com/iCheck/
     */
    // PhatPQ
    /*
    $("input[type='checkbox'], input[type='radio']").iCheck({
        checkboxClass: 'icheckbox_minimal',
        radioClass: 'iradio_minimal'
    });
	*/
    
    initFragment();
    
    initModal();
});
function fix_sidebar() {
    //Make sure the body tag has the .fixed class
    if (!$("body").hasClass("fixed")) {
        return;
    }

    //Add slimscroll
    $(".sidebar").slimscroll({
        height: ($(window).height() - $(".header").height()) + "px",
        color: "rgba(0,0,0,0.2)"
    });
}

function change_layout() {
    $("body").toggleClass("fixed");
    fix_sidebar();
}

function change_skin(cls) {
    $("body").removeClass("skin-blue skin-black");
    $("body").addClass(cls);
}
/*END DEMO*/

/************* FRAGMENT ********************/
function initFragment() {
	// Keep a mapping of url-to-container for caching purposes.
	/* var cache = {
		// If url is '' (no fragment), display this div's content.
		'': $('.bbq-default')
	}; */
	
	// Bind an event to window.onhashchange that, when the history state changes,
	// gets the url from the hash and displays either our cached content or fetches
	// new content to be displayed.
	$(window).bind( 'hashchange', function(e) {
		// Get the hash (fragment) as a string, with any leading # removed. Note that
		// in jQuery 1.4, you should use e.fragment instead of $.param.fragment().
		var url = $.param.fragment();
		
		// Remove .bbq-current class from any previously "current" link(s).
		$( 'a.bbq-current' ).removeClass( 'bbq-current' );
		
		// Hide any visible ajax content.
		$( '.bbq-content' ).children( ':visible' ).hide();
		
		// Add .bbq-current class to "current" nav link(s), only if url isn't empty.
		url && $( 'a[href="#' + url + '"]' ).addClass( 'bbq-current' );
		
		//if ( cache[ url ] ) {
		//	// Since the element is already in the cache, it doesn't need to be
		//	// created, so instead of creating it again, let's just show it!
		//	cache[ url ].show();
		//} else {
			$( '.bbq-item' ).remove();
			
			// Show "loading" content while AJAX content loads.
			$( '.bbq-loading' ).show();
			
			resetForm();
			
			// Create container for this url's content and store a reference to it in the cache.
			//cache[ url ] = 
			$( '<div class="bbq-item"/>' )
			
				// Append the content container to the parent container.
				.appendTo( '.bbq-content' )
				
				// Load external content via AJAX. Note that in order to keep this
				// example streamlined, only the content in .infobox is shown. You'll
				// want to change this based on your needs.
				.load( 'admin/' + url, function(){
					// Content loaded, hide "loading" content.
					$( '.bbq-loading' ).hide();
				});
		//}
	});
	
	// Since the event is only triggered when the hash changes, we need to trigger
	// the event now, to handle the hash the page may have loaded with.
	$(window).trigger( 'hashchange' );
}

/*********** BOOTSTRAP MODAL *********************/
function initModal() {
	$.fn.modalmanager.defaults.resize = true;
	
	$.fn.modal.defaults.maxHeight = function(){
		// subtract the height of the modal header and footer
		return $(window).height() - 165; 
	};
}