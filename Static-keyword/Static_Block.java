/*
 * Static block is used for initializing the static variables.
 * This block gets executed when the class is loaded in the memory.
 * A class can have multiple Static blocks, which will execute in the same sequence in which they have been written into the program.
 * 
 * 
 */
//Example 1: Single static block

public class Static_Block {
	static int age;
	static String name;
	
	static {
		age = 10;
		name = "GitHub";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Age : "+age);
		System.out.println("Name : "+name);
	}

}

Example 2: Multiple Static blocks

public class Static_Block{
	static int age;
	static String name;
	static {
		age = 9;
		name = "Git";
	}
	
	//overriding takes place
	static {
		age = 11;
		name = "GitHub";
	}
	public static void main(String[] args) {
		System.out.println("Age : "+age);         // 11
		System.out.println("Name : "+name);       // GitHub
	}
}
