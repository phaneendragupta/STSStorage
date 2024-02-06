package com.edureka.employee;

class Product{
	
	long prod_id;
	String prod_name;
	float prod_price;
	
	Product(long pid, String name, float price){
		this.prod_id=pid;
		this.prod_name=name;
		this.prod_price=price;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Product [prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_price=" + prod_price + "]";
	}
}

public class ProductTest {

	public static void main(String[] args) {
		Product prod = new Product(10012345, "Mobile", 25000f);
		System.out.println(prod); //toString()
	}

}
