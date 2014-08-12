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

/* CENTER ELEMENTS IN THE SCREEN */
/*jQuery.fn.center = function() {
    this.css("position", "absolute");
    this.css("top", Math.max(0, (($(window).height() - $(this).outerHeight()) / 2) +
            $(window).scrollTop()) - 30 + "px");
    this.css("left", Math.max(0, (($(window).width() - $(this).outerWidth()) / 2) +
            $(window).scrollLeft()) + "px");
    return this;
};*/