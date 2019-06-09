package com.lab.lab29.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ShuffleDeck {
	private int remaining;
	private boolean shuffled;
	private String deck_id;
//	private Integer deck_count;
	
	
	public int getRemaining() {
		return remaining;
	}
	public ShuffleDeck() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	public boolean isShuffled() {
		return shuffled;
	}
	public void setShuffled(boolean shuffled) {
		this.shuffled = shuffled;
	}
	public String getDeck_id() {
		return deck_id;
	}
	public void setDeck_id(String deck_id) {
		this.deck_id = deck_id;
	}
	@Override
	public String toString() {
		return "ShuffleDeck [remaining=" + remaining + ", shuffled=" + shuffled + ", deck_id=" + deck_id + "]";
	}
	
	
}
