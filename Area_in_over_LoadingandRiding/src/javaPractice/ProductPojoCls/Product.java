package javaPractice.ProductPojoCls;

/*
Write a program to create POJO class of Product (Product Id, ProductName)
and Store all values in any collection and Sort that values by ProductName 
in ascending order*/

public class Product  implements Comparable<Product>{
  private	int productId;
	private String productName;
	

	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}



	//Constructor
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}


	@Override
	public int compareTo(Product name) {
		return this.productName.compareToIgnoreCase(name.productName);
	}





	

	
	
	
}
