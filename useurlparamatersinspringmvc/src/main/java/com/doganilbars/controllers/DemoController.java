package com.doganilbars.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("demo")
public class DemoController {

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "demo/index";
	}

	@RequestMapping(value = "hello/{fullName}", method = RequestMethod.GET)
	public String demo2(@PathVariable("fullName") String fullName, ModelMap modelMap) {

		modelMap.put("result", "Hi " + fullName);
		return "demo/demo2";
	}

	@RequestMapping(value = "sum/{a}/{b}", method = RequestMethod.GET)
	public String sum(@PathVariable("a") int a, @PathVariable("b") int b, ModelMap modelMap) {
		modelMap.put("result", a + b);
		return "demo/demo3";
	}
}
