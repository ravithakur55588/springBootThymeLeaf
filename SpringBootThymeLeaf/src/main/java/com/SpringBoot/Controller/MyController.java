package com.SpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MyController {

	@RequestMapping(value="/jj",method = RequestMethod.GET)
	public String jj() {
		System.out.println("jj hendler");
		return "jj";
	}
}
