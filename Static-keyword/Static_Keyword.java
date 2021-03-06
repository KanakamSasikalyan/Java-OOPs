/*
 * Static keyword can be used with class, variable, method and block.
 * Static members belong to the class instead of a specific instance, 
 * this means if you make a member static, you can access it without object. 
 * 
 * Static members are common for all the instances(objects) of the class
 * but non-static members are separate for each instance of class.
 */
public class Static_Keyword {
	public static void myMethod() {
		System.out.println("Hello  GitHub.com!");
	}
	public static void main(String[] args) {
		/* You can see that we are calling this
         * method without creating any object. 
         */
		myMethod();
	}
}
