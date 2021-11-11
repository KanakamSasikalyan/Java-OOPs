/*
 * Constructor with arguments(or you can say parameters) is known as Parameterized constructor.
 */
public class Parameterized_constructor {
	String website;
	Parameterized_constructor(String web){       //Parameterized constructor
		this.website = web;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized_constructor obj = new Parameterized_constructor("Github");
		System.out.println(obj.website);
	}

}

//Output : Github