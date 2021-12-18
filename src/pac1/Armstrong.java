package pac1;
public class Armstrong {

public static void main(String[] args)
	{
		System.out.println("hi");
		int num=371
				,num1=num,count=0,ld,sum=0;
		while(num>0) {
						count++;
						num=num/10;					 }
		num=num1;
		while(num>0) {
			
						ld=num%10;
						sum=sum+power(ld,count);
						num=num/10;
					 }
		if(num1==sum)
		System.out.println("strong");
		else
			System.out.println("not strong");
		}
		public static int power(int ld,int count) {
				int prod=1;
				for(int i=count;i>0;i--) {
					prod=prod*ld;
				}
				return prod;
	}

}
