package pac1;

public class Developer extends Emp {
	static private int devcnt;
	Developer(){
		
	}
	Developer(String name, String designation, double salary) {
		super(name,designation,salary);
		++devcnt;
	}
	public void printDevcnt() {
		System.out.println("No of Developers:"+devcnt);
	}
	
	public void code() {
		System.out.println("coding");
	}
}
