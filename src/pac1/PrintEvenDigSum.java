package pac1;

public class PrintEvenDigSum {

	public static void main(String[] args) {
		int num=23617,dig,sum=0;
		while(num>0) {
			dig=num%10;
			if(dig%2==0)
			{
				sum=sum+dig;
			}
			num=num/10;
		}
		System.out.println("even digits sum:"+sum);
	}

}
