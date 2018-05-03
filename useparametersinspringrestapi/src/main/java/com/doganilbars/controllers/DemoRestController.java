package com.doganilbars.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoRestController {

	@RequestMapping(value = "hello/{fullName}", method = RequestMethod.GET, produces = {
			MimeTypeUtils.TEXT_HTML_VALUE })
	public ResponseEntity<String> hello(@PathVariable("fullName") String fullName) {
		try {
			String content = "Hello " + fullName;
			return new ResponseEntity<String>(content, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "sum/{a}/{b}", method = RequestMethod.GET, produces = { MimeTypeUtils.TEXT_HTML_VALUE })
	public ResponseEntity<String> sum(@PathVariable("a") int a, @PathVariable("b") int b) {
		try {
			String content = String.valueOf(a + b);
			return new ResponseEntity<String>(content, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}

}
