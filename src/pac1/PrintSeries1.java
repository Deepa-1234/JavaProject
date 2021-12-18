package pac1;

public class PrintSeries1 {

	public static void main(String[] args) {
		int num1=1,num2=4,count=1;
		while(count<=5) {
			System.out.print(num1+",");
			System.out.print(num2);
			if(count!=5) {
				System.out.print(",");
			}
			num1=num1+3;
			num2=num2+2;
			count++;
		}

	}

}
