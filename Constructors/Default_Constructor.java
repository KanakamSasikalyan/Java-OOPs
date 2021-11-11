/*
 * If you do not implement any constructor in your class,
 * Java compiler inserts a default constructor into your code on your behalf.
 * This constructor is known as default constructor.
 * You would not find it in your source code(the java file) as it would be inserted into 
 * the code during compilation and exists in .class file.
 *  This process is shown in the diagram below:
 *  --------------------------------------------------
 *  |     public class Main{                          |
 *  |	  	public static void main(String[] args){   |
 *  |	         Main obj = new Main();               |
 *  |		}                                         |
 *  |	}                                             |             
 *  ---------------------------------------------------   
 *                       |
 *                    Compiler
 *                       |
 *                       *   
 *  --------------------------------------------------
 *  |     public class Main{                          |
 *  |       Main(){                                   |
 *  |			//Constructor automatically inserted  |
 *  |              Java Compiler                      |
 *  |		}                                         |
 *  |	  	public static void main(String[] args){   |
 *  |	         Main obj = new Main();               |
 *  |		}                                         |
 *  |	}                                             |             
 *  ---------------------------------------------------          
 *                 
 */                                                   
public class Default_Constructor {
	String website;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default_Constructor obj = new Default_Constructor();
		System.out.println(obj.website);
	}
}

//Output : null
