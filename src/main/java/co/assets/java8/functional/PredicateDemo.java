package co.assets.java8.functional;

import java.util.Arrays;
import java.util.List;


public class PredicateDemo {

	public PredicateDemo() {
		// TODO Auto-generated constructor stub
	}

	

	public static void main(String[] args) {
		 //Predicate<Integer> predicate=(t)->t%2==0;
	
		 
	   List<Integer> ls=Arrays.asList(1,2,3,4,5,6);
	   ls.stream().filter((t)->t%2==0).forEach(t->System.out.println("printing t"+t));
		
	}
}
