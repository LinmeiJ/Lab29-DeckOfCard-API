package com.lab.lab29.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.lab.lab29.APIService.APIService;

@Controller
public class CardsController {

	ModelAndView mv = new ModelAndView("index");
	
	@RequestMapping("/")
	public ModelAndView home() {
		mv.addObject("newC", APIService.getNewDeckResponse().getBody());
		return mv;
	}
	
	@RequestMapping("send-id")
	public ModelAndView accessById(@RequestParam("id") String id) {
		mv.addObject("draw",APIService. getShuffleDeckResponse(id).getBody());
//		mv.addObject("drawCards",APIService.getDrawCardsResponse(id).getBody());
		return mv;	
	}

	
	

	
	

}
