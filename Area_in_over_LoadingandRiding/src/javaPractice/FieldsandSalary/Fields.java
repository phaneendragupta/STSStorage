package javaPractice.FieldsandSalary;

import java.util.Comparator;

/*20)Create a class having Fields id,name ,salary and sort
it based on id and name using comparator and comparable 
*/

public class Fields implements Comparable<Fields>,Comparator<Fields> {
	
	private int id;
	private String name;

	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Fields(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Fields [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	@Override
	public int compare(Fields o1, Fields o2) {
     int idComparision =Integer.compare(o1.id, o2.id);
	 if(idComparision ==0) {
		 
		 return o1.name.compareTo(o2.name);
	 }	
	 
     return idComparision;
	}

	@Override
	public int compareTo(Fields o) {
		return Integer.compare(this.id, o.id);
	}
	
	

}
