//package StreamsExr;
//import java.util.*;
//
//public class Comparator{
//	
//	
//
//  public class Person implements Comparable<Person> {
//	    private String name;
//	    private int age;
//
//	    public Person(String name, int age) {
//	        this.name = name;
//	        this.age = age;
//	    }
//
//	    @Override
//	    public int compareTo(Person otherPerson) {
//	        return this.age - otherPerson.age;
//	    }
//
//	    @Override
//	    public String toString() {
//	        return name + " (" + age + " years old)";
//	    }
//	}
//
//	public class Main {
//	    public static void main(String[] args) {
//	        List<Person> people = new ArrayList<>();
//	        people.add(new Person("Alice", 30));
//	        people.add(new Person("Bob", 25));
//	        people.add(new Person("Charlie", 35));
//
//	        Collections.sort(people); // Sorts by age
//
//	        for (Person person : people) {
//	            System.out.println(person);
//	        }
//	    }
//	}
//}
//
//
//
