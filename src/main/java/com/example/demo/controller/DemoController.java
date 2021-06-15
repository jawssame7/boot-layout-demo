package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	/**
	 * レイアウト適用
	 * @return
	 */
	@RequestMapping(value = "/")
	public String index() {
		
		return "test";
	}
	
	@RequestMapping(value = "/no-layout")
	public String noLayout() {
		return "no-layout";
	}
}
