/*                      A      => Parent Class 
                        ^ 
                        | => extends
                        |
                        B      => Child Class           */


class Parent{
	int age = 29;
	String name = "GitHub";
	void display() {
		System.out.println("This is parent method");
	}
}
class Single extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single obj = new Single();
		System.out.println(obj.age);
		System.out.println(obj.name);
		obj.display();
	}

}
