package javaPractice.enumcoding;

public class Pizza{
	
	private String name;
	private PizzaSize pizzaSize;
	private double price;
	
	public Pizza(String name, PizzaSize pizzaSize) {

	this.name=name;
	this.pizzaSize=pizzaSize;
	this.price = calculatePrice();
	f
	
	}

	private double calculatePrice() {
    switch (pizzaSize) {
    case SMALL:
    default: 	
          return 5.98;
     case MEDIUM:
    	 return 7.95;
     case LARGE:
    	 return 10.90; 	 
    
    }
			
	}
	
	public String getName() {
		return name;
	}
	
	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}
	
	public double getPrice() {
		return price;
	}
	
}

