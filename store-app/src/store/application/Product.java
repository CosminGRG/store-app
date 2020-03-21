package store.application;

public class Product {
	private static int instanceId = 0;
	private int id = 0;
	private int price;
	private String name;
	private String description;
	private String expiration_date;
	
	public Product() {}
	
	public Product(int _price, String _name, String _description, String _expiration_date)
	{
		instanceId++;
		id = instanceId;
		price = _price;
		name = _name;
		description = _description;
		expiration_date = _expiration_date;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public double getPrice()
	{
		return price;
	}
}
