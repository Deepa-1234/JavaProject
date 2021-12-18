package pac1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DriverEmployee {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		Employee obj1= new Employee("Deepa",1,70000.0);
//		Employee obj2= new Employee("Nilima",2,50000.0);
		int choice=1,ch,eid;
		double salary;
		String name;
		Scanner s=new Scanner(System.in);
		ArrayList<Employee> a= new ArrayList<>();
//		addEmp(a,obj1);
//		addEmp(a,obj2);
		while(choice==1){
			System.out.println("Press 1 to add create an Employee");
			System.out.println("Press 2 to Display Employee Details");
			System.out.println("Press 3 to search an employee based on name");
			System.out.println("Press 4 to delete an employee based on eid");
			System.out.println("Press 5 to display Employee details in ascending order of salary");
			
			ch=s.nextInt();
			
			switch(ch){
				case 1: 	System.out.println("Enter name");
							name=s.next();
							System.out.println("Enter eid");
							eid=s.nextInt();
							System.out.println("Enter salary");
							salary=s.nextDouble();
							addEmp(a,new Employee(name,eid,salary));
							break;
				case 2:	displayDetails(a);break;
				case 3: System.out.println("Enter emp name");
						name=s.next();
						searchEmp(a,name);
						break;
				case 4: System.out.println("enter eid to delete");
						eid=s.nextInt();
						deleteEmp(a,eid);
						break;
				case 5: ArrayList<Employee> a2=new ArrayList<>(a);
						Collections.sort(a2);
						displayDetails(a2);
						break;
			    default:System.out.println("Invalid option!!!!");
						break;
			}
			
			System.out.println("enter 1 to continue");
			System.out.println("press any key to stop");
			choice=s.nextInt();
			
		}
		System.out.println("thank you");
		s.close();
	}

	public static void deleteEmp(ArrayList<Employee> a, int eid) {
		boolean f=false;
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getEid()==eid) {
				a.remove(i);
				f=true;
			}
		}
		if(f)
			System.out.println("Employee removed");
		else
			System.out.println("Employee not removed");
			
		
	}

	public static void searchEmp(ArrayList<Employee> a, String name) {

			boolean f=false;
			for(int i=0;i<a.size();i++)
			{
				if(a.get(i).getName().equals(name))
				{ 
					f=true;
					break;
				}
			}
				if(f)
					System.out.println("Employee found");
					else
					System.out.println("Employee not found");
				
			}
			
		
	

	public static void displayDetails(ArrayList<Employee> a) {
		if(!a.isEmpty()) {
			for(int i=0;i<a.size();i++) {
				System.out.println("Emp Name:"+a.get(i).getName());
				System.out.println("Emp Eid:"+a.get(i).getEid());
				System.out.println("Emp Salary:"+a.get(i).getSalary());
				System.out.println("---------------------");
			}
		}else
			System.out.println("List is empty");
		
		
	}

	public static void addEmp(ArrayList<Employee> a, Employee obj1) {
		a.add(obj1);
		}

}
