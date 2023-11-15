package co.assets.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ForEachDemo {

	public ForEachDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		List<String> ls=new ArrayList<String>();
		ls.add("Denis");
		ls.add("Morgan");
		ls.add("Olive");
		ls.add("Faith");
		ls.add("Enos");
		ls.add("Mercy");
		//ls.forEach(t->System.out.println(t));//for each accepts Consumer
		
		//ls.stream().filter(t->t.contains("a")).forEach(t->System.out.println("hello "+t));
		List<String> filtered=ls.stream().filter(t->t.contains("a")).collect(Collectors.toList());
		System.out.println(filtered.size());
	}
}
