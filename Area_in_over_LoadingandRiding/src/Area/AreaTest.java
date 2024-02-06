package Area;

public class AreaTest{
	public static void main(String[] args) {
		
		IShape obj = null;
		
		obj = new Circle();
		obj.areaCalc(5.0);
		
		obj = new Rectangle();
		obj.areaCalc(5.0,6.0);
		
		
		
		
	}
}
