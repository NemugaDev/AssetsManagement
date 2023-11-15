package co.assets.java8.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo  {

	public SupplierDemo() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		Supplier<String> supplier=()->"Dave";
		//System.out.println(supplier.get());
		
		  List<String> ls=Arrays.asList("d","dd");
		  
		  String str=ls.stream().findAny().orElseGet(supplier); 
		  System.out.println("yes there:"+str);
	}

}
