package pac1;

public class PositionalValuePrint {

	public static void main(String[] args) {
		int num=21463,ld,count=0,prod=1;
		while(num>0)
		{
			ld=num%10;
			prod=incrementTens(count);
			count++;
			System.out.println(ld*prod);
			num=num/10;
		}

	}

	private static int incrementTens(int count) {
		int i=1;
		while(count>0) {
			i=i*10;
			count--;
		}
		return i;
	}

}
