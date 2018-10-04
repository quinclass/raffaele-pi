package model;

public class Exam {
	private String materia;
	private Integer grades;
	
	public Exam(String materia, Integer grades) {
		this.materia = materia;
		this.grades = grades;
	}
	
	public Integer getGrades() { return grades; }
	public String getMateria() { return materia; }
		
}
