class Car{
	String cname;
	String cmodel;
	Car(String cname, String cmodel){
		this.cname = cname;
		this.cmodel = cmodel;
	}
}

class Driver extends Car{
	String dname;
	int age;
	Driver(String cname, String cmodel, String dname, int age){
		super(cname, cmodel);
		this.dname = dname;
		this.age = age;
	}
}

public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver dobj = new Driver("Tesla", "S", "Mark", 23);
		System.out.println("Car Name : "+dobj.cname);
		System.out.println("Car Model : "+dobj.cmodel);
		System.out.println("Driver name : "+dobj.dname);
		System.out.println("Driver age :"+dobj.age);
	}

}
