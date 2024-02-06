package javaPractice.enumcoding;

public class PizzaApp {

	public static void main(String[] args) {
		System.out.println("Availabe sizes:");
		 for(PizzaSize pizzaSize : PizzaSize.values()) {
			 System.out.println("-" + pizzaSize.name());
			 
		 }
		 System.out.println();

		Pizza pizzaOrder= new Pizza("Margareta", PizzaSize.MEDIUM);
		System.out.println(pizzaOrder.getName());
		System.out.println(pizzaOrder.getPizzaSize().name());
		System.out.println(pizzaOrder.getPrice());
			
		
		
		
		
	}

}
