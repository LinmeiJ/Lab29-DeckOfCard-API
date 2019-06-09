package com.lab.lab29.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ShuffleDeck {
	private boolean success;
	private String deck_id;
	private boolean shuffled;
	private Integer remaining;
//	private Integer deck_count;
	
	
	public ShuffleDeck() {
		super();
		// TODO Auto-generated constructor stub
	}


//	public Integer getDeck_count() {
//		return deck_count;
//	}
//
//
//	public void setDeck_count(Integer deck_count) {
//		this.deck_count = deck_count;
//	}


	public ShuffleDeck(boolean success, String deck_id, boolean shuffled, Integer remaining) {
		super();
		this.success = success;
		this.deck_id = deck_id;
		this.shuffled = shuffled;
		this.remaining = remaining;
	}


	public boolean isSuccess() {
		return success;
	}


	public void setSuccess(boolean success) {
		this.success = success;
	}


	public String getDeck_id() {
		return deck_id;
	}


	public void setDeck_id(String deck_id) {
		this.deck_id = deck_id;
	}


	public boolean isShuffled() {
		return shuffled;
	}


	public void setShuffled(boolean shuffled) {
		this.shuffled = shuffled;
	}


	public Integer getRemaining() {
		return remaining;
	}


	public void setRemaining(Integer remaining) {
		this.remaining = remaining;
	}


	@Override
	public String toString() {
		return "Entity [success=" + success + ", deck_id=" + deck_id + ", shuffled=" + shuffled + ", remaining="
				+ remaining + "]";
	}
	
	
	
}