package pac1;

public class SumOfConcecutivenumders {

	public static void main(String[] args) {

		int num=2315,sum=0,t1,t2;
		while(num>0) {
			t1=num%10;
			num=num/10;
			t2=num%10;
			if(num!=0) 
			{
			System.out.println("("+t1+"*"+t2+")");
			sum=t1*t2+sum;
			}
			
			
		}
		System.out.println("sum="+sum);
	}

}
