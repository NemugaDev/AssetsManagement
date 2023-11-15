package co.assets.map;

import java.util.List;
import java.util.stream.Collectors;

import co.assets.db.DB;
import co.assets.db.Products;

public class MappingDemo {

public static void main(String[] args) {
	List<Products> ls=DB.getProducts();
	ls.stream().map(product->product.getName()).collect(Collectors.toList());
}
class KeyValue{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public KeyValue(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
}
