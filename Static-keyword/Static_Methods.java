/*
 * The methods belongs to the class not the Objects are static methods
 */


public class Static_Methods {
	//static method
	public static void myMethod() {
		System.out.println("This is static method!");
	}
	
	//non-static method
	  void funcn()
	  {
	      //Static method called in non-static method
	      myMethod();
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Methods obj = new Static_Methods();
		obj.funcn();
	}

}
