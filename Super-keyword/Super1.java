/*
 *  How to use super keyword to access the variables of parent class.
 *  
 *  When you have a variable in child class which is already present in the parent class,
 *  then in order to access the variable of parent class, you need to use the super keyword.
 */

class Parent{
	String website = "https://www.github.com";
}

class Child1 extends Parent{
	String website = "https://www.google.com";
	void display() {
		//to access the parent varible
		System.out.println("Parent class website : "+super.website);
	}
}

public class Super1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 obj = new Child1();
		System.out.println("Child class website : "+obj.website);
		obj.display();
	}

}
