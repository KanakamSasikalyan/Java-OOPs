/*
 * Association establishes relationship between two separate classes through their objects.
 * The relationship can be one to one, One to many, many to one and many to many.
 */

//Simple Example

class Details{
	int age;
	String name;
	Details(int age, String name){
		this.age = age;
		this.name = name;
	}
}

class Student extends Details{
	String clg;
	Student(int age, String name, String clg){
		super(age, name);          
		this.clg = clg;
	}
}
public class Association_Intro {
	public static void main(String[] args) {
		Student obj = new Student(21, "Mark", "Stanford-University");
		System.out.println("Name : "+obj.name);
		System.out.println("Age :"+obj.age);
		System.out.println("College : "+obj.clg);
	}
}
