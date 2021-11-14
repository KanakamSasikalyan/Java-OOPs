class Job{
	String company;
	String role;
	double salary;
	Job(String com, String role, double sal){
		this.company = com;
		this.role = role;
		this.salary = sal;
	}
}

class Fresher{
	String fname;
	Job job;
	Fresher(String name, Job j){
		this.fname = name;
		this.job = j;
	}
}

public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job job = new Job("Google", "SDE-1", 12.5);
		Fresher emp = new Fresher("Mark", job);
		System.out.println("Name is : "+emp.fname);
		System.out.println("Company is : "+emp.job.company);
		System.out.println("Role : "+emp.job.role);
		System.out.println("Salary :"+emp.job.salary);
	}

}
