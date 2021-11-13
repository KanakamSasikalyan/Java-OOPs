class A{
	int a = 10;
	void show1() {
		System.out.println("This is A method");
	}
}
class B extends A{
	int b = 20;
	void show2() {
		System.out.println("This is B method");
	}
}
class Multilevel extends B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel obj = new Multilevel();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.show1();
		obj.show2();
	}

}
