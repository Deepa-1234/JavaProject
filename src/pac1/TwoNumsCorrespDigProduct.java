package pac1;

public class TwoNumsCorrespDigProduct {

	public static void main(String[] args) {

		int num1=327,num2=539,product=0;
		while(num1>0) {
			product=(num1%10)*(num2%10)+product;
			System.out.print("("+num1%10+" * "+num2%10+")");
			
			num1=num1/10;
			num2=num2/10;
			if(num1!=0) {
				System.out.print("+");
			}
		}
		System.out.println("="+product);
	}

}
