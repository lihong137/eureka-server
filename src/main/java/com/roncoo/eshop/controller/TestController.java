package com.roncoo.eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Copyright  SAP-CDC
 * User: lihong
 * Date: 2021/6/2 3:46 下午
 * Description:
 */
@Controller
public class TestController
{
	@RequestMapping("/test")
	@ResponseBody
	public String home() {
		return "hello,eureka";
	}
}
