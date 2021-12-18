package pac1;

public class Hr extends Emp {
		static private int hrCnt;
		Hr(){
			
		}
		Hr(String name, String designation, double salary) {
			super(name,designation,salary);
			++hrCnt;
		}
		public void recruit() {
			System.out.println("recruting");
		}
		public void printHrCount() {
			System.out.println("No of Hrs:"+hrCnt);
		}
	}


