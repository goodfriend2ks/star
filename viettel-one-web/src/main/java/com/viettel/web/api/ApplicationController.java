/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.web.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicationController {
 
    @RequestMapping(value = "/start", method = RequestMethod.GET)
	public String init(ModelMap model) {
         return "layouts/index";
	}
    
    @RequestMapping(value = "/admin/{module}", method = RequestMethod.GET)
    public String admin(ModelMap model, @PathVariable String module) {
		return module + "/index";
    }
    
    /*@RequestMapping(value = "/role", method = RequestMethod.GET)
    public String role(ModelMap model) {
		return "role/index";
    }*/
}
