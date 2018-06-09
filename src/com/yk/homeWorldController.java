package com.yk;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class homeWorldController {

@RequestMapping("/showForm")
public String showForm() {
	return "helloworld-form";
}

@RequestMapping("/processForm")
public String processForm() {
	return "helloworld";
}

@RequestMapping("/processFormVersionTwo")
public String letShoutDude(HttpServletRequest request, Model model ){
	//read request from request  param
	String theName = request.getParameter("studentName");
	//covert data to caps
	theName=theName.toUpperCase();
	//create message
	String result = "Yo "+theName;
	//add data to model
	model.addAttribute("message", result);
	return "helloworld";
}

@RequestMapping("/processFormVersionThree")
public String processFormVersionThree(@RequestParam("studentName") String theName, Model model ){
	
	//covert data to caps
	theName=theName.toUpperCase();
	//create message
	String result = "Yo3 "+theName;
	//add data to model
	model.addAttribute("message", result);
	return "helloworld";
}

}
