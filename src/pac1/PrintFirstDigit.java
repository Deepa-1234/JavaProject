package pac1;

public class PrintFirstDigit {

	public static void main(String[] args) {
		int num=4567,ld;
		while(num>0) {
			ld=num%10;
			num=num/10;
			if(num==0)
			{
				System.out.println(ld);
				
			}

		}

	}

}
