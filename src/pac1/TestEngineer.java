package pac1;



public class TestEngineer extends Emp {
		static private int testCnt;
		TestEngineer(){
			
		}
		TestEngineer(String name, String designation, double salary) {
			super(name,designation,salary);
			++testCnt;
		}
		public void printTestCnt() {
			System.out.println("No of Test Enggs:"+testCnt);
		}
		public void writingTestCases() {
			System.out.println("tesing");
		}
	}


