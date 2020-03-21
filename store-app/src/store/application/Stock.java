package store.application;

import java.util.*;

public class Stock {
	public Map<Product, Integer> productList = new HashMap<Product, Integer>();
	
	public Stock() {}
	
	public void PrintStock()
	{
		System.out.println("Stock:" );
		for (Product key : productList.keySet()) {
			System.out.println(key.getName() + " : " + productList.get(key));
		}
		System.out.println();
	}
}
