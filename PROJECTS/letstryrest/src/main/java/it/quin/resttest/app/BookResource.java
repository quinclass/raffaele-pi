package it.quin.resttest.app;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import it.quin.resttest.dto.BookDTO;

@Path("/books")
public class BookResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<BookDTO> getBooks() {
		//return Response.ok().entity("Hello World").build();
		return Arrays.asList(new BookDTO().testAdd("titolo di prova 1"), new BookDTO().testAdd("titolo di prova 2"));
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public BookDTO addBook( BookDTO b ) {
		b.setIsbn("test-isbn-0000-" + System.currentTimeMillis());
		return b;
	}
}
