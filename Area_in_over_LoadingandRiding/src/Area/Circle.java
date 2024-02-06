package Area;

class Circle implements IShape{
	
	double rad;

	
	@Override
	public void areaCalc(double rad) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI*Math.pow(rad, 2));
		
	}

	@Override
	public void areaCalc(double len, double bred) {
		// TODO Auto-generated method stub
		
		System.out.println(len*bred);
	}

	
}
