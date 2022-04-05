
//Method Overriding

class Parent{
	private void method() {
		System.out.println("This is a parent class method");
	}
}

class OOPS extends Parent{
	protected void method() {
		//super.method();
		System.out.println("This is a child class method");
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		OOPS q = new OOPS();
		p.method();
		q.method();
	}
}

//1. Argument list must match
//2. The Access modifier of the child method should not restrictive than parent method.
