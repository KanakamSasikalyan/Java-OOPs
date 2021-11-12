/*
 * 
 * A static variable is common to all the instances (or objects) of the class because it is a class level variable.
 * In other words you can say that only a single copy of static variable is created and shared among all the instances of the class.
 * Memory allocation for such variables only happens once when the class is loaded in the memory.
 *Few Important Points:
	=> Static variables are also known as Class Variables.
	=> Unlike non-static variables, such variables can be accessed directly in static and non-static methods.
 */
public class Static_Variables {
	static int age = 10;                     //static var
	static String name = "GitHub.com";       //static var
	private static void myMethod() {
		System.out.println("Age : "+age);
		System.out.println("Name : "+name);
	}
	public static void main(String[] args) {
		myMethod();
	}
}
