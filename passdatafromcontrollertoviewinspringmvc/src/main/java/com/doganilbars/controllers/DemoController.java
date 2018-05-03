package com.doganilbars.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("demo")
public class DemoController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("age", 31);
		modelMap.put("username", "ilbars");
		return "demo/index";
	}

	@RequestMapping(value = "demo2", method = RequestMethod.GET)
	public String demo2(ModelMap modelMap) {
		modelMap.put("status", true);
		modelMap.put("price", 3.5);
		return "demo/demo2";
	}

}
