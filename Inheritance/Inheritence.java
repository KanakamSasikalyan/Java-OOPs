/*
 * The process by which one class acquires the properties(data members) 
 * and functionalities(methods) of another class is called inheritance. 
 * The aim of inheritance is to provide the reusability of code so that a class has to write only the unique features and rest of the common properties and functionalities can be extended from the another class.
 */

//Simple Example

class A{
	int data = 100;
	void display() {
		System.out.println("This is parent method");
	}
}
class Inheritence extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritence obj = new Inheritence();
		System.out.println("data is :"+obj.data);
		obj.display();
	}

}
