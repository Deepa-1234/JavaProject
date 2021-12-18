package pac1;

public class PrintSecondDigit {

	public static void main(String[] args) {
		int num=2356,num2=num;
		while(num>99) {
			num=num/10;
		}
		System.out.println("second digit is "+num%10);
		while(num2>9) {
			num2=num2/10;
		}
		System.out.println("first digit is "+num2%10);
		
	}

}
