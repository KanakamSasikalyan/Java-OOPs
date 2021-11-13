class A1{
	int a = 10;
	void showA() {
		System.out.println("This is A method");
	}
}

class B1 extends A1{        //extends A
	int b = 20;
	void showB() {
		System.out.println("This is B method");
	}
}

class C extends A1{       //extends A
	int c = 30;
	void showC() {
		System.out.println("This is C method");
	}
}

class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C cobj = new C();
		System.out.println(cobj.c);
		System.out.println(cobj.a);
		cobj.showA();
		cobj.showC();
		
		B1 bobj = new B1();
		System.out.println(bobj.b);
		System.out.println(bobj.a);
		bobj.showB();
		bobj.showA();
	}

}
