package com.BikkadIT.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Introduction {

	public Introduction() {
	System.out.println("Introduction class Constructor");
	}
	@GetMapping("/getIntroduction")
	public ModelAndView getIntroduction() {
		String str="my name is kabir. i am from nanded";
		ModelAndView mav=new ModelAndView();
		mav.addObject("MEASSAGE",str);
		mav.setViewName("Introduction");
		return mav;
		
	}

}
