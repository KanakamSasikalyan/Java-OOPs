//Use of super keyword to invoke constructor of parent class
/*
 * When we create the object of sub class, the new keyword invokes the constructor of child class, 
 * which implicitly invokes the constructor of parent class. 
 * So the order to execution when we create the object of child class is: 
 * parent class constructor is executed first and then the child class constructor is executed. 
 * It happens because compiler itself adds super()(this invokes the no-arg constructor of parent class) as the first statement in the constructor of child class.
 */

class Parentclass
{
   //no-arg constructor
   Parentclass(){
	System.out.println("no-arg constructor of parent class");
   }
   //arg or parameterized constructor
   Parentclass(String str){
	System.out.println("parameterized constructor of parent class");
   }
}
class Super2 extends Parentclass
{
   Super2(){
       /* super() must be added to the first statement of constructor 
	* otherwise you will get a compilation error. Another important 
	* point to note is that when we explicitly use super in constructor
	* the compiler doesn't invoke the parent constructor automatically.
	*/
	super("Hahaha");
	System.out.println("Constructor of child class");

   }
   void display(){
	System.out.println("Hello");
   }
   public static void main(String args[]){		
	   Super2 obj= new Super2();
	obj.display();	 
   }
}

