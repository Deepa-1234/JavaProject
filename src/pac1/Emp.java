package pac1;


public class Emp {
	
	private String name;
	private String designation;
	private int eid;
	private double salary;
	private static int count=0;
	private static int autoEid=1;
	
	Emp()
	{
		
	}
	Emp(String name, String designation, double salary) {
		super();
		
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.eid=autoEid++;
		count++;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public int getEid() {
		return eid;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary > this.salary)
		this.salary = salary;
	}
	 public void work() {
		 System.out.println(name+"is working as"+designation);
	 }
	 public void printCount() {
		 System.out.println("No of Emps"+count);
	 }
	
}
