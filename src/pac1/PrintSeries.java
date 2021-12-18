package pac1;

public class PrintSeries {

	public static void main(String[] args) {

		int num=2,count=1;
		while(count<=10) {
			System.out.print(num);
			if(count!=10) {
				System.out.print(",");
			}
			num=num+2;
			count++;
			
		}
	}

}
