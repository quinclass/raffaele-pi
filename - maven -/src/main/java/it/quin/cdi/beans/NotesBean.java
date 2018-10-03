package it.quin.cdi.beans;

import java.io.Serializable;
import java.util.*;

import javax.annotation.*;
import javax.enterprise.context.*;

import it.quin.cdi.model.*;


@ApplicationScoped
public class NotesBean implements Serializable {
	private static final long serialVersionUID = 2652302763862379609L;
	private List<Note> notes;
	
	public NotesBean() {
		notes= new LinkedList<>();
	}
	
	public NotesBean addNote(Note n) {
		notes.add(n);
		return this;
	}
	
	@PostConstruct
	private void setUp() { System.out.println("freshly made a notes list"); }
	@PreDestroy
	private void cleanUp() { System.out.println("ready to campfire with notes"); }
	
	@Override
	public String toString() {
		return notes.toString();
	}
}
