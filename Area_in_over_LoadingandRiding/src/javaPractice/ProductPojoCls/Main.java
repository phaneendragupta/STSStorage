package javaPractice.ProductPojoCls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {



	public static void main(String[] args) {

		List<Product> products=new ArrayList<>();
		
		products.add(new Product(100, "Violin"));
		products.add(new Product(101, "Guitar"));
		products.add(new Product(102, "Piano"));
		products.add(new Product(104, "Flute"));
		
		Collections.sort(products);
		
		for(Product i :products) {
		System.out.println(i);}
	}

}
