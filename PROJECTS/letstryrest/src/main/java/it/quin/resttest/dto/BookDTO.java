package it.quin.resttest.dto;


public class BookDTO {
	private String isbn;
	private String Title;
	private AuthorDTO author;
	private PubDTO	publisher;
	
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
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public AuthorDTO getAuthor() {
		return author;
	}
	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	public PubDTO getPublisher() {
		return publisher;
	}
	public void setPublisher(PubDTO publisher) {
		this.publisher = publisher;
	}
	
}
