package it.quin.resttest.app;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import it.quin.resttest.dto.BookDTO;
import it.quin.resttest.fakedb.FakeDB;

@Path("/books")
public class BookResource {
	
	@Inject
	private FakeDB db;
	
	protected FakeDB getDB() { return db; }
	
	
	/** get method, shows the list of all book records registered */
	
	@GET  
	@Produces(MediaType.APPLICATION_JSON)	
	public List<BookDTO> getBooks() {
		return Arrays.asList(new BookDTO().testAdd("titolo di prova 1"), new BookDTO().testAdd("titolo di prova 2"));
	}
	
	
	/**	post method, used to add a book to the pool */
	
	@POST	
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public BookDTO add( BookDTO b ) {
		b.setIsbn("isbn-0000-" + System.currentTimeMillis());
		return b;
	}
	
	
	/** get method, used to see target book quantity and location */
	// TODO : use itemsDTO 
	
	@GET @Path("/books/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BookDTO> locate(@PathParam("id") String id) {
		return null;
	}
	
	/** put method, used to see edit book data */
	//
	
	@PUT @Path("/books/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public BookDTO edit(@PathParam("id") String id, BookDTO b) {
		return null;
	}
	
	/** delete method, used to see edit book data */
	//
	
	@DELETE @Path("/books/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public BookDTO delete(@PathParam("id") String id, BookDTO b) {
		return null;
	}

}
