package pac1;

public class ReturnCube {

	public static void main(String[] args) {
		int num=5;
		int result=printCube(num);
		System.out.println(result);
		
	}

	private static int printCube(int num) {
		
		return num*num*num;
	}

}
