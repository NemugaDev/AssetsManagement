package co.assets.db;

import java.util.ArrayList;
import java.util.List;

public class DB {

	public static List<Products> getProducts()
	{
		List<Products> ls=new ArrayList<Products>();
		ls.add(new Products(1, 250, "Omo"));
		ls.add(new Products(2, 120, "Bread"));
		ls.add(new Products(3, 1500, "Sugar"));
		ls.add(new Products(4, 340, "Harpic"));
		ls.add(new Products(5, 55, "Amara for men"));
		ls.add(new Products(6, 3500, "Lg Tv"));
		return ls;
	}
}
