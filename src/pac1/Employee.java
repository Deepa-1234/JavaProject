package pac1;
public class Employee implements Comparable {
		
		private String name;
		private int eid;
		private double salary;
		
		
		Employee()
		{
			
		}
		Employee(String name,int eid,double salary) {
			super();
			
			this.name = name;
			this.salary = salary;
			this.eid=eid;
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid=eid;
		}
		
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public int compareTo(Object obj) {
			if(this.salary==((Employee)obj).salary)
			return 0;
			else if(this.salary>((Employee)obj).salary)
			return 1;
			else
			return -1;
		}
		
	}




