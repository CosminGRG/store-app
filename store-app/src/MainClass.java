

import store.application.*;
import java.util.*;

public class MainClass {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		
		//FOR TEST ONLY
		Employee employee = new Employee("Angajatul");
		Employee gemployee = new Employee("Angajata");
		
		Product Coffee = new Product(35, "Coffee", "Coffe Beans", "01.01.2021");
		Product Milk = new Product(10, "Milk", "2L Milk", "25.06.2020");
		Product Sugar = new Product(5, "Sugar", "For my coffee", "01.01.2021");
		Product Cup = new Product(20, "Cup", "Coffee goes here", "n/a");
		Product Spoon = new Product(15, "Spoon", "To mix the coffee", "n/a");
		
		employee.AddProduct(Coffee, 10);
		employee.AddProduct(Milk, 25);
		employee.AddProduct(Sugar, 5);
		employee.AddProduct(Cup, 3);
		gemployee.AddProduct(Spoon, 50);
		
		employee.getStock().PrintStock();
		
		employee.RemoveProduct(Milk);
		employee.RemoveProduct(Cup);
		
		employee.getStock().PrintStock();
		
		
		employee.SellProduct(Coffee, 5);
		employee.SellProduct(Spoon, 20);
		employee.getReceipt().PrintReceipt(employee);
		
		employee.getStock().PrintStock();
		
		employee.AddProduct(Milk, 20);
		
		gemployee.SellProduct(Spoon, 15);
		gemployee.SellProduct(Milk, 10);
		gemployee.getReceipt().PrintReceipt(gemployee);
		
		gemployee.getStock().PrintStock();
		
		input.close();
		/*
		 * The above code will output:
		 * 
		Stock:
		Milk : 25
		Coffee : 10
		Spoon : 50
		Sugar : 5
		Cup : 3
		
		Stock:
		Coffee : 10
		Spoon : 50
		Sugar : 5
		
		Receipt:
		Employee ID: 1
		Employee Name: Angajatul
		
		5 x Coffee 35.0 175.0
		20 x Spoon 15.0 300.0
		Total: 475.0
		
		Stock:
		Coffee : 5
		Spoon : 30
		Sugar : 5
		
		
		Receipt:
		Employee ID: 2
		Employee Name: Angajata
		
		10 x Milk 10.0 100.0
		15 x Spoon 15.0 225.0
		Total: 325.0
		
		Stock:
		Milk : 10
		Coffee : 5
		Spoon : 15
		Sugar : 5
		*/
	}
}
