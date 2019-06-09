package com.lab.lab29.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cards {
	
	private String image;
	private String value;
	private String suit;
	private String code;
	
	public Cards() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cards(String image, String value, String suit, String code) {
		super();
		this.image = image;
		this.value = value;
		this.suit = suit;
		this.code = code;
	}

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Cards [image=" + image + ", value=" + value + ", suit=" + suit + ", code=" + code + "]";
	}
	
	
	
}
