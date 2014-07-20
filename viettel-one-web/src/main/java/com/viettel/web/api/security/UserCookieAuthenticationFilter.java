package com.viettel.web.api.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserCookieAuthenticationFilter implements Filter {
	private String[] excludePatterns = null;
	private String loginUrl;
	private String lockscreenUrl;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.loginUrl = filterConfig.getInitParameter("login");
		if (this.loginUrl == null || "".equals(this.loginUrl.trim())) {
			this.loginUrl = "/login.jsp";
		}
		
		this.lockscreenUrl = filterConfig.getInitParameter("lockscreen");
		
		String excludePattern = filterConfig.getInitParameter("excludePatterns");
		if (excludePattern != null && !"".equals(excludePattern)) {
			String[] patterns = excludePattern.split(",");
			
			this.excludePatterns = new String[patterns.length];
			for (int i=0; i<patterns.length; i++) {
				this.excludePatterns[i] = patterns[i].trim();
			}
		}
    }
	
	@Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
    		throws IOException, ServletException {
        
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		String pageName = req.getServletPath().toLowerCase();
		
		boolean matchExclude = matchExcludePatterns(pageName);
		if (matchExclude) {
			chain.doFilter(request, response);
		} else {
			boolean foundAuthToken = false;
			boolean foundRefreshToken = false;
			boolean foundLockscreen = false;
			
			boolean isLockscreenUrl = false;
			if (lockscreenUrl != null && !"".equals(lockscreenUrl)) {
				isLockscreenUrl = pageName.indexOf(lockscreenUrl) >= 0;
			}
			
			boolean isLoginUrl = "/".equals(pageName) || pageName.indexOf(loginUrl) >= 0;
			boolean isForce = isLoginUrl && (req.getParameter("force") != null);
			
	        Cookie[] cookies = req.getCookies();
			if (cookies != null) {
				for(int i = 0; i < cookies.length; i++) { 
					Cookie c = cookies[i];
					Object value = c.getValue();
					if ("authToken".equalsIgnoreCase(c.getName())) {
						if (value != null && !"".equals(value.toString())) {
							foundAuthToken = true;
						}
					} else if ("refreshToken".equalsIgnoreCase(c.getName())) {
						if (value != null && !"".equals(value.toString())) {
							foundRefreshToken = true;
						}
					} else if ("lockscreen".equalsIgnoreCase(c.getName())) {
						if (value != null && "true".equalsIgnoreCase(value.toString())) {
							foundLockscreen = true;
						}
					/*} else if ("wlocation".equalsIgnoreCase(c.getName())) {
						if (value != null && !"".equals(value.toString())) {
							wlocation = value.toString();
						}*/
					}
				}
			}
			
			if (!isLockscreenUrl && !isForce && foundRefreshToken && foundLockscreen 
					&& lockscreenUrl != null && !"".equals(lockscreenUrl)) {
				res.sendRedirect(req.getContextPath() + lockscreenUrl);
			} else if (isLockscreenUrl && foundRefreshToken && foundLockscreen) {
				chain.doFilter(request, response);
			} else if (!isLoginUrl && !foundAuthToken) {
				res.sendRedirect(req.getContextPath() + loginUrl);
	        }else{
	        	chain.doFilter(request, response);
	        }
		}
    }
	
	@Override
    public void destroy() {}
	
	private boolean matchExcludePatterns(String url) {
		if (this.excludePatterns == null || this.excludePatterns.length == 0)
			return false;
		
		if (url.endsWith(".jsp"))
			return false;
		
		for (int i=0; i<this.excludePatterns.length; i++) {
			boolean retValue = false;
			String pattern = this.excludePatterns[i];
			
			if (pattern.startsWith("*") && pattern.endsWith("*")) {
				retValue = (url.indexOf(pattern.substring(1, pattern.length() - 1)) >= 0);
			} else if (pattern.startsWith("*")) {
				retValue = (url.endsWith(pattern.substring(1)));
			} else if (pattern.endsWith("*")) {
				retValue = (url.startsWith(pattern.substring(0, pattern.length() - 1)));
			}
			
			if (retValue) {
				return true;
			}
		}
		
		return false;
	}
}
