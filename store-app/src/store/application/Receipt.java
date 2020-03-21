package store.application;

import java.util.*;

public class Receipt {
	public Map<Product, Integer> receiptProductList = new HashMap<Product, Integer>();
	
	public Receipt() {}
	
	private double CalculateTotal()
	{
		double total = 0;
		for (Product key : receiptProductList.keySet())
		{
			total += CalculateProductTotal(key);
		}
		return total;
	}
	
	private double CalculateProductTotal(Product _product)
	{
		double productTotal = 0;
		productTotal = _product.getPrice() * receiptProductList.get(_product);
		
		return productTotal;
	}
	
	public void PrintReceipt(Employee employee)
	{
		System.out.println();
		System.out.println("Receipt:");
		System.out.println("Employee ID: " + employee.getId());
		System.out.println("Employee Name: " + employee.getName());
		System.out.println();
		for (Product key : receiptProductList.keySet())
		{
			System.out.println(receiptProductList.get(key) + " x " + key.getName() + " " + key.getPrice() + " " + CalculateProductTotal(key));
		}
		System.out.println("Total: " + CalculateTotal());
		System.out.println();
		
		ResetReceipt();
	}
	
	private void ResetReceipt()
	{
		receiptProductList.clear();
	}
}
