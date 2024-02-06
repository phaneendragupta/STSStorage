package javaPracticeDefaultMethImpl;
@FunctionalInterface
public interface DefIntf {
    public void	mymethod();
    
   default void defaultmethod() {
    	
    	System.out.println("Implement this default method");
    }
    

}
