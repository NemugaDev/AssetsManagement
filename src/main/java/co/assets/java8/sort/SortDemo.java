package co.assets.java8.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import co.assets.db.DB;
import co.assets.db.Products;

public class SortDemo {

	public SortDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		/*List<String> ls=new ArrayList<String>();
		ls.add("Denis");
		ls.add("Morgan");
		ls.add("Olive");
		ls.add("Faith");
		ls.add("Enos");
		ls.add("Mercy");
		ls.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println("value:"+t));
		
		*/
		List<Products> ls=DB.getProducts();
		//Collections.sort(ls, (p1,p2)->(int)(p2.getCost()-p1.getCost()));
		ls=ls.stream().filter(t->t.getCost()<1000).sorted((p1,p2)->(int)(p2.getCost()-p1.getCost())).collect(Collectors.toList());
		ls.forEach(t->System.out.println(t.getName()+" "+t.getCost()));
	}

	
}
