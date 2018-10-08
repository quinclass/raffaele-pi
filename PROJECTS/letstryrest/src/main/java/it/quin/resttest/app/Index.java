package it.quin.resttest.app;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import it.quin.resttest.fakedb.FakeDB;

@ApplicationPath("/rest/v1")
public class Index extends Application{
	
	@Inject
	private FakeDB db;

	public FakeDB getDb() {
		return db;
	}
}
