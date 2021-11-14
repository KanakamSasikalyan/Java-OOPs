## ✔Method Overloading
Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different. It is similar to constructor overloading in Java, that allows a class to have more than one constructor having different argument lists.

let’s get back to the point, when I say argument list it means the parameters that a method has: For example the argument list of a method add(int a, int b) having two parameters is different from the argument list of the method add(int a, int b, int c) having three parameters

## ✔Three ways to overload a method

In order to overload a method, the argument lists of the methods must differ in either of these:
1.Number of parameters.
For example: This is a valid case of overloading
<pre>
add(int, int)
add(int, int, int)
</pre>
2. Data type of parameters.
For example:
<pre>
add(int, int)
add(int, float)
</pre>
3. Sequence of Data type of parameters.
For example:
<pre>
add(int, float)
add(float, int)
</pre>

## ⚠Note
Invalid case of method overloading:
When I say argument list, I am not talking about return type of the method, for example if two methods have same name, same parameters and have different return type, then this is not a valid method overloading example. This will throw compilation error.
<pre>
int add(int, int)
float add(int, int)
</pre>

## ✔Points to Note:
1. Static Polymorphism is also known as compile time binding or early binding.
2. Static binding happens at compile time. Method overloading is an example of static binding where binding of method call to its definition happens at Compile time.
