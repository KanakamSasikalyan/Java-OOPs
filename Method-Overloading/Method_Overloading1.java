/*
 *  Overloading – Different Number of parameters in argument list
 */
public class Method_Overloading1 {
	void display(int a, int b) {
		System.out.println("This method having 2 parameters");
		System.out.println("a value is :"+a);
		System.out.println("b value is :"+b);
	}
	void display(int a, int b, int c) {
		System.out.println("\nThis method having 3 parameters");
		System.out.println("a value is :"+a);
		System.out.println("b value is :"+b);
		System.out.println("c value is :"+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading1 obj = new Method_Overloading1();
		obj.display(10, 20);
		obj.display(100, 200, 300);
	}

}
