/*
 * Constructor is a block of code that initializes newly created object.
 * A constructor resembles an instance method in java but it’s not a method as it doesn’t have a return type.
 * In short constructor and method are different.
 * People often refer constructor as special type of method in Java.
 */

//Simple Constructor Program
public class Constructor {
	String website;
	
	//Constructor
	Constructor(){
		this.website = "GitHub.com";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj = new Constructor();
		System.out.println("Website name is : "+obj.website);
	}

}

//Output : GitHub.com
