package co.assets.java8.functional;

import java.util.Arrays;
import java.util.List;


public class ConsumerDemo  {

	public ConsumerDemo() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(1,2,3,4,5,6);
		ls.stream().forEach(t->System.out.println("printing "+t)); 
	}

}
