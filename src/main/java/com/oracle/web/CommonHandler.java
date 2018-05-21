package com.oracle.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonHandler {

	@RequestMapping(value="/hello")
	public String Hello() {
		return "book";
	}
}
