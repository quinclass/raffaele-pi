package it.quin.secondweek.Ex2609;

import java.util.Collection;
import java.util.HashSet;

public class UniqueMain {
	
	public static void main(String[] args) {
		String s= "Lorem ipsum dolor sit amet consectetur adipiscing elit Nullam dignissim facilisis nulla vel molestie Morbi sollicitudin condimentum vestibulum Mauris lectus ligula tempor eu egestas in vestibulum eget sapien Proin eget leo a nisl facilisis facilisis Vestibulum sed sollicitudin felis Vivamus eu sem ipsum Etiam sed mauris dapibus fermentum orci eget elementum tortor Aliquam facilisis leo a elementum pellentesque libero urna imperdiet diam ac ullamcorper est libero sed purus Nulla sit amet diam eu mi vulputate porttitor Maecenas non convallis risus Fusce laoreet lorem non elit pharetra pulvinar Morbi quis tortor in metus luctus condimentum In volutpat sagittis ante at placerat orci dictum et";
		uniques(new HashSet<String>(),s.split(" "));
		
	}
	
	public static void uniques( Collection<String> collection,String... strings) {
		for(String s : strings) {
			collection.add(s);
		}
		System.out.println(collection.toString());
	}

}
