package it.quin.cdi.model;

import java.util.Date;

public class Note {
	private String title;
	private String text;
	private Date creation;
	
	public Note() {}
	
	@Override
	public String toString() {
		return  this.title + "\n" + this.text + "\n" + this.creation;
	}

	public String getTitle() {
		return title;
	}
	
	public String getText() {
		return text;
	}
	
	public Date getCreation() {
		return creation;
	}
	
	public Note setTitle(String title) {
		this.title = title;
		return this;
	}
	
	public Note setText(String text) {
		this.text = text;
		return this;
	}
	
	public Note setCreation(Date creation) {
		this.creation = creation;
		return this;
	}
	
	
}
