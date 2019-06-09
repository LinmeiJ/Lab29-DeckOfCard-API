package com.lab.lab29.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.lab.lab29.entity.DrawCards;
import com.lab.lab29.entity.ShuffleDeck;

@Controller
public class CardsController {

	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	@RequestMapping("start")
	public ModelAndView home(@RequestParam("deckCount") Integer numDeck, @RequestParam("cardsCount") Integer numCards) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Testing");
		
		String url1 = "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count="+numDeck;
		ResponseEntity<ShuffleDeck> deckResponse = rt.exchange(url1, HttpMethod.GET, new HttpEntity<>("parameters", headers),
				ShuffleDeck.class);
		
		String url2 = "https://deckofcardsapi.com/api/deck/"+deckResponse.getBody().getDeck_id()+"/draw/?count="+numCards;
		ResponseEntity<DrawCards> shuffleResponse = rt.exchange(url2, HttpMethod.GET, new HttpEntity<>("parameters", headers),
				DrawCards.class);
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("newC", deckResponse.getBody());
		mv.addObject("draw",shuffleResponse.getBody());
		mv.addObject("drawCards", shuffleResponse.getBody().getCards());

		return mv;
		
	}
	
	
	

	
	

}
