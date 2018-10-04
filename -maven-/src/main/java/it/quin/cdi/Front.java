package it.quin.cdi;

import java.io.IOException;
import java.util.Date;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.quin.cdi.beans.NotesBean;
import it.quin.cdi.model.Note;

@WebServlet("/notes")
public class Front extends HttpServlet {

	private static final long serialVersionUID = -1358388318151576490L;

	@Inject
	private NotesBean bean;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.getOutputStream().println("<!DOCTYPE html>");
		resp.getOutputStream().println("<html>");

		resp.getOutputStream().println("<head style=\"width:100%\">");
		resp.getOutputStream().println("<title>Notes</title>");
		resp.getOutputStream().println("</head>");
		
		resp.getOutputStream().println("<body style=\"width:100%\">");
		

		resp.getOutputStream().println("<form action=\"notes\" method=\"post\" style=\"width:100%\">");
		resp.getOutputStream().println("<input type=\"text\" name=\"title\" style=\"width:40%\">");
		resp.getOutputStream().println("<input type=\"text\" name=\"text\" style=\"width:40%\">");
		resp.getOutputStream().println("<input type=\"submit\" value=\"aggiungi\" style=\"width:15%\">");
		resp.getOutputStream().println("</form>");
		
		resp.getOutputStream().println("<div>");
		for (String s : bean.toString().split(",")) {
			resp.getOutputStream().println("<div style=\"display: inline-block; background-color:gold; border:1px solid black; max-width:300px;\">");
			for (String par : s.split("\n")) {
				resp.getOutputStream().println("<p style=\"overflow-x:scroll;\">" + par + "</p>");
			}
			resp.getOutputStream().println("</div>");
		}
		resp.getOutputStream().println("</div>");
		resp.getOutputStream().println("</body>");
		resp.getOutputStream().println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		bean.addNote(new Note()
				.setTitle(req.getParameter("title"))
				.setText(req.getParameter("text"))
				.setCreation(new Date()));
		doGet(req, resp);

	}

}
