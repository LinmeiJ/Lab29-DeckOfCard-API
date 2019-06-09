package com.lab.lab29.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class NewDeck {
	private Integer remaining;
	private boolean shuffled;
	private String deck_id;
	private Boolean success;
	

	public Integer getRemaining() {
		return remaining;
	}
	public void setRemaining(Integer remaining) {
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
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public NewDeck(Integer remaining, boolean shuffled, String deck_id, Boolean success) {
		super();
		this.remaining = remaining;
		this.shuffled = shuffled;
		this.deck_id = deck_id;
		this.success = success;
	}
	
	public NewDeck() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "NewDeck [remaining=" + remaining + ", shuffled=" + shuffled + ", deck_id=" + deck_id + ", success="
				+ success + "]";
	}
	
	
	
}
