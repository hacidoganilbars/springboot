package com.doganilbars.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/demo")
public class DemoRestController {

	@RequestMapping(value = "helloworld", method = RequestMethod.GET, produces = { MimeTypeUtils.TEXT_HTML_VALUE })
	public ResponseEntity<String> helloworld() {
		try {
			return new ResponseEntity<String>("<b><i><u>Hello World</u></i></b>", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
}
