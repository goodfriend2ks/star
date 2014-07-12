/**
 * Holds cookie methods
 */
oauth2.cookie = {};

/**
 * Get the value of a cookie.
 * @param {string}
 * @return {string}
 */
oauth2.cookie.get = function (name) {
	var cookies = {};
	
	try {
		var pairs = document.cookie.split(/\; /g);
		
		for (var i in pairs) {
			if (typeof pairs[i] === 'string') {
				var parts = pairs[i].split(/\=/);
				cookies[parts[0]] = unescape(parts[1]);
			}
		}
	} catch (e) {
		//alert("XYZ:" + e);
	}
	
	return cookies[name];
};

/**
 * Delete a cookie
 * @param {string}
 */
oauth2.cookie.remove = function (name) {
	document.cookie = name + '=;path=/; expires=Thu, 01 Jan 1970 00:00:01 GMT;Max-Age=0';
};

/**
 * Set a cookie
 * @param {string}
 * @param {string}
 */
oauth2.cookie.set = function (name, value) {
	// document.cookie = "name=value[; expires=UTCString][; domain=domainName][; path=pathName][; secure]"; 
	document.cookie = name + '=' + value + ';path=/';
};

