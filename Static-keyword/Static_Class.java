/*
 * A class can be made static only if it is a nested class.

	=> Nested static class doesn’t need reference of Outer class
	=> A static class cannot access non-static members of the Outer class
	
*  We will see these two points with the help of an example:
 */
public class Static_Class {
	static String website = "GitHub.com";
	//String website = "GitHub.com"             //compilation error
	static class Main{
		public void display() {
			/* If you make the str variable of outer class
			    * non-static then you will get compilation error
			    * because: a nested static class cannot access non-
			    * static members of the outer class.
			*/
			System.out.println(website);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Class.Main obj = new Static_Class.Main();
		obj.display();
	}

}
