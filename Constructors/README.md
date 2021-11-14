## Constructor in Java
![image](https://user-images.githubusercontent.com/67740644/141668793-b4a8cbfd-5065-4def-adf5-eb1758652d96.png)

Constructor is a block of code that initializes the newly created object. A constructor resembles an instance method in java but it’s not a method as it doesn’t have a return type. In short constructor and method are different(More on this at the end of this guide). People often refer constructor as special type of method in Java.

Constructor has same name as the class and looks like this in a java code.
<pre>
public class MyClass{
   //This is the constructor
   MyClass(){
   }
   ..
}
</pre>
## How does a constructor work

To understand the working of constructor, lets take an example. lets say we have a class MyClass.
When we create the object of MyClass like this:

**MyClass obj = new MyClass()**

The **new keyword** here creates the object of class MyClass and invokes the constructor to initialize this newly created **object**.

## Types of Constructors

There are three types of constructors: Default, No-arg constructor and Parameterized.
types of constructor
![image](https://user-images.githubusercontent.com/67740644/141668913-8cc675f6-d2bf-492a-9317-cb911005a4ce.png)

## Default constructor

If you do not implement any constructor in your class, Java compiler inserts a default constructor into your code on your behalf.
This constructor is known as default constructor. You would not find it in your source code(the java file) as it would be inserted into the code during compilation and exists in .class file.
This process is shown in the diagram below:
![default_constructor](https://user-images.githubusercontent.com/67740644/141668708-9583589a-82e3-4f18-80f9-304848ad1b8e.jpg)

## no-arg constructor:

Constructor with no arguments is known as no-arg constructor. The signature is same as default constructor, however body can have any code unlike default constructor where the body of the constructor is empty.
- Although you may see some people claim that that default and no-arg constructor is same but in fact they are not, even if you write public Demo() { } in your class Demo it cannot be called default constructor since you have written the code of it.

## Example: no-arg constructor
<pre>
class Demo
{
     public Demo()
     {
         System.out.println("This is a no argument constructor");
     }
     public static void main(String args[]) {
    	 new Demo();
     }
}
</pre>

**Output**:
This is a no argument constructor

## Parameterized constructor
Constructor with arguments(or you can say parameters) is known as Parameterized constructor.
