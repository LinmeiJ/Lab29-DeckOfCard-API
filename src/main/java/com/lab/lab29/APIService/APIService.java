package com.lab.lab29.APIService;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.lab.lab29.entity.DrawCards;
import com.lab.lab29.entity.NewDeck;
import com.lab.lab29.entity.ShuffleDeck;

public class APIService {
	
	static RestTemplate rt = new RestTemplate();
	static HttpHeaders headers = new HttpHeaders();
	
	// get HTTP response with ShuffleDeck entity
		public static ResponseEntity<NewDeck> getNewDeckResponse() {
			String url = "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1";
			headers.add(HttpHeaders.USER_AGENT, "Testing");
			ResponseEntity<NewDeck> response = rt.exchange(url, HttpMethod.GET, new HttpEntity<>("parameters", headers),
					NewDeck.class);
			return response;
		}

		// get HTTP response with DrawCards entity
		public static ResponseEntity<ShuffleDeck> getShuffleDeckResponse(String id) {
//			DrawCards dc = new DrawCards();
//			dc.setDeck_id(id);
			String url = "https://deckofcardsapi.com/api/deck/<<"+id+">>/draw/?count=2";
			headers.add(HttpHeaders.USER_AGENT, "Testing");
			ResponseEntity<ShuffleDeck> response = rt.exchange(url, HttpMethod.GET, new HttpEntity<>("parameters", headers),
					ShuffleDeck.class);
			return response;
		}


//			private ResponseEntity<Cards> getCardsResponse() {
//				String url = "https://deckofcardsapi.com/api/deck/<<deck_id>>/draw/?count=2";
//				headers.add(HttpHeaders.USER_AGENT, "Testing");
//				ResponseEntity<Cards> response = rt.exchange(url, HttpMethod.GET, new HttpEntity<>("parameters", headers), Cards.class);
//				return response;
//			}
}
