package com.yk;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/silly")
public class sillyController {

@RequestMapping("/showForm")
public String showForm() {
	return "silly";
}


}
