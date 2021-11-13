class A{
	int a = 10;
	void showA() {
		System.out.println("This is A method");
	}
}

class B extends A{
	int b = 10;
	void showB() {
		System.out.println("This is B method");
	}
}

class C extends A{
	int c = 10;
	void showC() {
		System.out.println("This is C method");
	}
}

class D extends A{
	int d = 10;
	void showD() {
		System.out.println("This is D method");
	}
}

class E extends B{
	int e = 10;
	void showE() {
		System.out.println("This is E method");
	}
	
}
public class Hybrid {
	public static void main(String[] args) {
		B bobj = new B();
		System.out.println(bobj.b);
		System.out.println(bobj.a);
		bobj.showA();
		bobj.showB();
		
		C cobj = new C();
		System.out.println(cobj.c);
		System.out.println(cobj.a);
		cobj.showA();
		cobj.showC();
		
		D dobj = new D();
		System.out.println(dobj.d);
		System.out.println(dobj.a);
		dobj.showA();
		dobj.showD();
		
		E eobj = new E();
		System.out.println(eobj.b);
		System.out.println(eobj.e);
		eobj.showB();
		eobj.showE();
	}
}
