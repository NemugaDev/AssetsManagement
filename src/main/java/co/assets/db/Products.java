package co.assets.db;

public class Products {

	private int id;
	private double cost;
	private String name;
	
	
	public Products(int id, double cost, String name) {
		
		this.id = id;
		this.cost = cost;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public double getCost() {
		return cost;
	}
	public String getName() {
		return name;
	}
	
	
}
