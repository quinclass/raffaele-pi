package it.quin.resttest.fakedb;

import java.util.HashSet;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;

import it.quin.resttest.dto.BookDTO;
import it.quin.resttest.dto.ItemsDTO;
import it.quin.resttest.dto.LibraryDTO;

@ApplicationScoped
public class FakeDB {
	HashSet <BookDTO> bookstable;
	HashSet <LibraryDTO> libstable;
	HashSet <ItemsDTO> itemstable;
	
	public Set<BookDTO> getBooks() { return bookstable; }
	
	public Set<ItemsDTO> getItems() { return itemstable; }
	
	public Set<LibraryDTO> getLibs() { return libstable; }
}
