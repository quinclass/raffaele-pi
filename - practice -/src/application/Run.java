package application;

import java.util.*;
import model.*;


public class Run {

	public static void main(String[] args) {
		Map<Stud, Map<Exam,Takn>> cdl = new HashMap<>();
		
		cdl.put(new Stud(null,null) , new HashMap<Exam,Takn>(new Exam(null,null), new Takn(null,null)));
	}
	
}
