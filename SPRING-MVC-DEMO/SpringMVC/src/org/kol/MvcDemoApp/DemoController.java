package org.kol.MvcDemoApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	
	public DemoController() {

	System.out.println("Controller Object");
	}
	
	@RequestMapping(value = "/reg" , method = RequestMethod.POST)
	public ModelAndView display(@ModelAttribute Demo demo) {
		System.out.println("Inside Display Method");
		String msg="Message is "+ demo.getName();
		
		return new ModelAndView("Sucess", "key", msg);
		
	}

	@RequestMapping(value = "/reg1", method = RequestMethod.POST)
	public String  newDisplay(@ModelAttribute Demo demo, ModelMap map ) {
		
		System.out.println("Inside Display Method");
		String msg="Message is "+ demo.getName();
		
		map.addAttribute("key1", msg);
		
		return ("Sucess");
		
	}
}
