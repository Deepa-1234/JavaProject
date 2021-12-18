package pac1;

public class StrongCheck {

	public static void main(String[] args) {
		int num=145,ld,fact,sum=0,num1=num;
		while(num>0) {
		ld=num%10;	
		fact=factorial(ld);
		sum=sum+fact;
		num=num/10;
		}
		if(num1==sum) {
			System.out.println(num1+" is strong");
		}
		else {
			System.out.println(num1+" is not strong");
		}
	}

	private static int factorial(int ld) {
		int fact=1;
		for(int i=1;i<=ld;i++) 
		{
			fact=fact*i;
		}
		return fact;
	}

}
