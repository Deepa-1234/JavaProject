package pac1;

public class SumOfExchConceDigs {

	public static void main(String[] args) {
		int num=2415,dig1,dig2,exchValue,sum=0;
		while(num>0) {
			dig1=num%10;
			num=num/10;
			dig2=num%10;
			exchValue=exchangeDig(dig1,dig2);
			if(num!=0) {
				sum=sum+exchValue;
			}
			
		}
		System.out.println("sum is:"+sum);
	}

	private static int exchangeDig(int dig1, int dig2) {
		int num=dig1*10+dig2;
		return num;
				
		
	}

}
