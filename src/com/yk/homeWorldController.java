package com.yk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeWorldController {

@RequestMapping("/showForm")
public String showForm() {
	return "helloworld-form";
}

@RequestMapping("/processForm")
public String processForm() {
	return "helloworld";
}

}
