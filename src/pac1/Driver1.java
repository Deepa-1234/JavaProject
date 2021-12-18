package pac1;

public class Driver1 {

	public static void main(String[] args) {

		Developer e1=new Developer("Kalpitha","Developer",50000);
		TestEngineer e2= new TestEngineer("Deepa","test Engineer",60000);
		Hr e3= new Hr("Nilima","Hr",40000);
		Developer e4=new Developer("Navya","Developer",50000);
		
		DisplayDetails(e1);
		DisplayDetails(e2);
		DisplayDetails(e3);
		DisplayDetails(e4);
		e4.setSalary(60000);
		e3.setSalary(34000);
		
		new Emp().printCount();
		new Developer().printDevcnt();
		new Hr().printHrCount();
		new TestEngineer().printTestCnt();
		
		
	}

	private static void DisplayDetails(Emp e) {
		System.out.println("Name:"+e.getName());
		System.out.println("Eid"+e.getEid());
		System.out.println("Salary"+e.getSalary());
		System.out.println("Designation"+e.getDesignation());
		e.work();
		if(e instanceof Developer) {
			((Developer)e).code();
		}
		else if(e instanceof TestEngineer) {
			((TestEngineer)e).writingTestCases();
		}
		else if(e instanceof Hr)
		{
			((Hr)e).recruit();
		}
		System.out.println("---------------");
		}
}
