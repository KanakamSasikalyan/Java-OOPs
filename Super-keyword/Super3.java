//How to use super keyword in case of method overriding

/*
 * We can call super() explicitly in the constructor of child class, but it would not make any sense because it would be redundant.
 * It’s like explicitly doing something which would be implicitly done otherwise.
 * However when we have a constructor in parent class that takes arguments then we can use parameterized super, like super(100);
 * to invoke parameterized constructor of parent class from the constructor of child class.
 */
class Super{
	void display() {
		System.out.println("Hello  from parent");
	}
}

class Sub extends Super{
	Sub(){
		super.display();     //parent method call by super
	}
	void display() {
		System.out.println("Hello  from child");
	}
}

public class Super3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub obj = new Sub();
		obj.display();
	}

}
