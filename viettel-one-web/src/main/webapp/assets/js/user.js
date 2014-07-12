oauth2.user = {};


/**
 * Get user info
 * @param {function}
 */
oauth2.user.current = function (callback) {
	
	oauth2.get(
			CONTEXT_PATH + '/api/profile/current',
			{},
			function (response) {
				console.log(response);
				// If the cached version is the same as the most recent
				// version, just return. Else, we will run the callback.
				/*if (store.get('userResponse') === JSON.stringify(response)) {
					console.log('cached');
					return false;
				}
				
				store.set('userResponse', JSON.stringify(response));*/
				
				if (callback) {
					callback();
				}
			},
			
			function(jqXHR, textStatus) {
				if (callback) {
					callback(jqXHR);
				}
			});
};

/**
 * Get user info
 * @param {function}
 */
oauth2.user.get = function (callback) {
	var userResponse = store.get('userResponse');
	
	if (userResponse) {
		var response = JSON.parse(userResponse);
		oauth2.user.user = response.user;
		
		// We still download the latest data in the background to make sure
		// cache is current. But we return immediately.
		oauth2.user.current(callback);
		return callback();
	}
	
	oauth2.user.current(callback);
};

/**
 * @return {bool}
 */
oauth2.user.is_logged_in = function () {
	return !!oauth2.cookie.get('authToken');
};

/**
 * Log the user in
 * @param {string}
 * @param {string}
 * @param {function} Callback. First parameter is error, if any.
 */
oauth2.user.login = function (username, password, callback) {
	oauth2.login(
		CONTEXT_PATH + '/oauth/token',
     	{
    		"username" : username,
    		"password" : password,
    		"grant_type": "password"
     	},
	    
	    function (response) {
     		/*store.remove('authToken');*/
	        oauth2.cookie.set('authToken', response.access_token);
	        oauth2.cookie.set('refreshToken', response.refresh_token);
	        //oauth2.cookie.set('userId', response.apiUser.id);
	        oauth2.cookie.set('username', username);
	        oauth2.cookie.set('lockscreen', false);
	        callback();
	    },
	    
	    function(jqXHR, textStatus) {
	    	callback(jqXHR);
	    });
};

oauth2.user.relogin = function (password, callback) {
	var username = oauth2.cookie.get('username');
	var refreshToken = oauth2.cookie.get('refreshToken');
	if (username == null || username == '' || refreshToken == null || refreshToken == '') {
		callback(
				{
					"status" : "400",
					"forceLogin" : "true"
				});
	} else {
		oauth2.login(
			CONTEXT_PATH + '/oauth/token',
	     	{
	    		"username" : username,
	    		"password" : password,
	    		"refresh_token" : refreshToken,
	    		"grant_type": "relogin_token"
	     	},
		    
		    function (response) {
	     		/*alert(JSON.stringify(response));*/
	     		/*store.remove('authToken');*/
		        oauth2.cookie.set('authToken', response.access_token);
		        oauth2.cookie.set('refreshToken', response.refresh_token);
		        oauth2.cookie.set('lockscreen', false);
		        callback();
		    },
		    
		    function(jqXHR, textStatus) {
		    	callback(jqXHR);
		    });
	}
};

oauth2.user.lockscreen = function () {
	/*store.set('authToken', oauth2.cookie.get('authToken'));*/
	oauth2.cookie.set('lockscreen', true);
	oauth2.cookie.remove('authToken');
};

/**
 * Delete the users cookies.
 */
oauth2.user.logout = function (callback) {
	oauth2.get(
		CONTEXT_PATH + '/logout', {}, 
		function (response) {
			// console.log(response);
			oauth2.cookie.remove('authToken');
			oauth2.cookie.remove('refreshToken');
			oauth2.cookie.remove('userId');
			oauth2.cookie.remove('username');
			oauth2.cookie.remove('email');
			oauth2.cookie.remove('lockscreen');
			store.clear();
			
	        callback();
	    },
	    
	    function(jqXHR, textStatus) {
	    	if (jqXHR.status == 200) {
	    		oauth2.cookie.remove('authToken');
				oauth2.cookie.remove('refreshToken');
				oauth2.cookie.remove('userId');
				oauth2.cookie.remove('username');
				oauth2.cookie.remove('email');
				oauth2.cookie.remove('lockscreen');
				store.clear();
				
	    		callback();
	    	} else {
	    		callback(jqXHR);
	    	}
	    });
};