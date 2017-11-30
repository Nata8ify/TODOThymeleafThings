package com.arms.controller;

import java.lang.reflect.Array;
import java.util.List;

import org.assertj.core.util.Lists;
import org.assertj.core.util.Sets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafFeatureController {
	
	@RequestMapping("/fragment")
	public String toFragmentFeature(){
		return "/fragment/main";
	}
	
	@GetMapping("/numberf")
	public String toNumberFeature(Model model){
		model.addAttribute("pi", 3.14159265359d);
		model.addAttribute("decimalList", Lists.<Double>newArrayList(2.141, 3.978, 6.457, 5.369, 12.475, 17.559944, 1.23654));
		model.addAttribute("decimalSet", Sets.<Double>newLinkedHashSet(2.141, 2.141, 7.657, 6.169, 13.275, 18.259944, 2.13654));
		return "/numberf/main";
	}
	
	@GetMapping("/stringf")
	public String toStringFeature(Model model){
		model.addAttribute("nullString", null);
		model.addAttribute("emptyString", "");
		model.addAttribute("helloworld", "Hello World");
		model.addAttribute("thymeleaf", "Thymeleaf");
		return "/stringf/main";
	}
	
	@GetMapping("/dialectf")
	public String toDialectFeature(Model model){
		model.addAttribute("thymeleaf", "Thymeleaf");
		return "/dialectf/main";
	}
}
