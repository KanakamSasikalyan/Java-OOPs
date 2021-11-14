/*
 * Aggregation is a special form of association. 
 * It is a relationship between two classes like association, 
 * however its a directional association, which means it is strictly a one way association. 
 * It represents a HAS-A relationship.
 */

class Address{
	String country;
	String city;
	String pincode;
	Address(String cou, String city, String pin){
		this.country = cou;
		this.city = city;
		this.pincode = pin;
	}
}

class Student{
	Address add;
	String name;
	Student(String name, Address add){
		this.name = name;
		this.add = add;
	}
}
public class Aggregation_Intro {
	public static void main(String[] args) {
		Address add = new Address("India", "Mumbai", "+91");
		Student stu = new Student("Mark", add);
		System.out.println("Name is :"+stu.name);
		System.out.println("Country : "+stu.add.country);
		System.out.println("City : "+stu.add.city);
		System.out.println("Pin Code : "+stu.add.pincode);
	}
}
