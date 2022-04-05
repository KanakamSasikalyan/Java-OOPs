class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Bow-Bow");
	}
	public static void main(String[] args) {
		Animal obj = new Animal();
		obj.sound();
		Animal obj2 = new Cat();
		obj2.sound();
		Animal obj3 = new Dog();
		obj3.sound();
	}
}
