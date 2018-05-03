package com.doganilbars.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doganilbars.entities.Account;

@Controller
@RequestMapping("account")
public class AccountController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("account", new Account());
		return "account/index";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@ModelAttribute("account") Account account, ModelMap modelMap) {
		modelMap.put("account", account);
		return "account/success";
	}

}
