package co.assets.reduce;

import java.util.Arrays;
import java.util.List;

public class Reduce {

	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(1,2,3,4,5,6);
		System.out.println(ls.stream().mapToInt(i->i).sum());
		System.out.println(ls.stream().reduce(1,(x,y)->x*y));
	}
}
