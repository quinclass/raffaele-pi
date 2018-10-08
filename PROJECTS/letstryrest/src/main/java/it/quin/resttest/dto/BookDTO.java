package it.quin.resttest.dto;


public class BookDTO {
	private String ISBN;
	private String Title;
	private String author;
	private String publisher;
	
	public BookDTO() {}
	
	public BookDTO testAdd(String test) {
		this.setTitle(test);
		return this;
	}
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getIsbn() {
		return ISBN;
	}
	public void setIsbn(String isbn) {
		this.ISBN = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
}
