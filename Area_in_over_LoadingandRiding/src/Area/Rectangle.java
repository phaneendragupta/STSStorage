package Area;

class Rectangle implements IShape{
	
	double len,bred;
	
	@Override
	public void areaCalc(double len, double bred) {
		// TODO Auto-generated method stub
		System.out.println(len*bred);
		
	}


	@Override
	public void areaCalc(double rad) {
		// TODO Auto-generated method stub
		
	}
	
}
