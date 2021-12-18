package pac1;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		int fact=factorial(num);
		System.out.print("=");
		System.out.println(fact);
	}
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) 
		{
			System.out.print(i);
			if(i!=n)
			{
			System.out.print("*");
			}
			fact=fact*i;
		}
		return fact;
		}
	}

