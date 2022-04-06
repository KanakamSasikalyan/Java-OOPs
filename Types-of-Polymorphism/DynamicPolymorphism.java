class ABC{
   public void myMethod(){
	System.out.println("Overridden Method");
   }
}
public class XYZ extends ABC{

   public void myMethod(){
	System.out.println("Overriding Method");
   }
   public static void main(String args[]){
	ABC obj = new XYZ();
	obj.myMethod();
   }
}

/*
  Few more overriding examples:

ABC obj = new ABC();
obj.myMethod();
// This would call the myMethod() of parent class ABC

XYZ obj = new XYZ();
obj.myMethod();
// This would call the myMethod() of child class XYZ

ABC obj = new XYZ();
obj.myMethod();
// This would call the myMethod() of child class XYZ

In the third case the method of child class is to be executed because which method is to be executed is determined by the type of object and since the object belongs to the child class, the child class version of myMethod() is called.
*/
