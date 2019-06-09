package com.lab.lab29.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DrawCards {
	private boolean success;
	private ArrayList<Cards> cards;
	private String deck_id;
	private Integer remaining;
	
	public DrawCards() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public ArrayList<Cards> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Cards> cards) {
		this.cards = cards;
	}

	public String getDeck_id() {
		return deck_id;
	}

	public void setDeck_id(String deck_id) {
		this.deck_id = deck_id;
	}

	public Integer getRemaining() {
		return remaining;
	}

	public void setRemaining(Integer remaining) {
		this.remaining = remaining;
	}


	@Override
	public String toString() {
		return "DrawCards [success=" + success + ", cards=" + cards + ", deck_id=" + deck_id + ", remaining="
				+ remaining + "]";
	}
	
	
	
}
