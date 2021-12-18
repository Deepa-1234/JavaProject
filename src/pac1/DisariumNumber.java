package pac1;

public class DisariumNumber {

	public static void main(String[] args) {
		int num=89,count=0,num1=num,prod=1,sum=0,ld;
		while(num>0) {
			count++;
			num=num/10;
		}
		
		num=num1;
		while(num>0) {
			ld=num%10;
			prod=powerRaise(ld,count);
			count--;
			sum=sum+prod;
			num=num/10;
		}
		if(sum==num1) {
			System.out.println(num1+" is disarium");
		}
		else
		{
			System.out.println(num1+" is not disarium");

		}
	}

	private static int powerRaise(int num, int count) {
	int prod=1;

		while(count>0) {
			prod=prod*num;
			count--;
		}
		return prod;
	}

}
