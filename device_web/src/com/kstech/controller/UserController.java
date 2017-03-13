package com.kstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kstech.session.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/login")
	public ModelAndView checkUser(User user){
		ModelAndView mav = new ModelAndView("success");
		mav.addObject("user", user);
		System.out.println(user.toString());
		return mav;
	}
}
