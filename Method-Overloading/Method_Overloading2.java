/*
 * Overloading – Difference in data type of parameters
 */
public class Method_Overloading2 {
	void display(int a, float b) {
		System.out.println("Method with int and float");
		System.out.println("a value is :"+a);
		System.out.println("a value is :"+b);
	}
	void display(int b, double d) {
		System.out.println("\nMethod with int and double");
		System.out.println("a value is :"+b);
		System.out.println("a value is :"+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading2 obj = new Method_Overloading2();
		obj.display(10, 12.4f);
		obj.display(15, 1234.56);
	}

}
