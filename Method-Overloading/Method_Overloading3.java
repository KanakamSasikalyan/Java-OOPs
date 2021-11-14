/*
 * Overloading – Sequence of data type of arguments
 */
public class Method_Overloading3 {
	
	void display(int a, float b) {
		System.out.println("Method with int and float");
		System.out.println("a value is :"+a);
		System.out.println("a value is :"+b);
	}
	void display(float a, int b) {
		System.out.println("\nMethod with float and int");
		System.out.println("a value is :"+a);
		System.out.println("a value is :"+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading3 obj = new Method_Overloading3();
		obj.display(10, 12.45f);
		obj.display(13.45f, 12);
	}

}
