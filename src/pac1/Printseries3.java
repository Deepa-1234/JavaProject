package pac1;

public class Printseries3 {

	public static void main(String[] args) {

		int count=1,sum=0,num=1;
		
		while(count<=10) {
			System.out.print(num+",");
			
			sum=sum+num;
			num=num+3;
			
			count++;
			}
			
			System.out.println("series sum is "+sum);
		}
	}


