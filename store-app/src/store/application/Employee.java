package store.application;

public class Employee {
	private String name;
	private int id = 0;
	private static int instanceId = 0;
	
	private static Stock stock = new Stock();
	private Receipt receipt = new Receipt();
	
	public Employee(String _name)
	{
		instanceId++;
		id = instanceId;
		name = _name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Stock getStock()
	{
		return stock;
	}
	
	public Receipt getReceipt()
	{
		return receipt;
	}
	
	public void AddProduct(Product _product, int _quantity)
	{
		stock.productList.put(_product, _quantity);
	}
	
	public void RemoveProduct(Product _product)
	{
		stock.productList.remove(_product);
	}
	
	public boolean CheckStock(Product _product, int _quantity)
	{
		for (Product key : stock.productList.keySet())
		{
			if ((_product.getName().equalsIgnoreCase(key.getName())) && (stock.productList.get(key) >= _quantity))
			{
				return true;
			}
		}
		return false;
	}
	
	public void SellProduct(Product _product, int _quantity)
	{
		if (CheckStock(_product, _quantity))
		{
			for (Product key : stock.productList.keySet())
			{
				if (_product.getName().equalsIgnoreCase(key.getName()))
				{
					receipt.receiptProductList.put(_product, _quantity);
					if (stock.productList.get(key) > _quantity)
					{
						stock.productList.replace(key, stock.productList.get(key) - _quantity);
					}
					else
					{
						stock.productList.remove(key);
					}
				}
			}
		}
	}
}
