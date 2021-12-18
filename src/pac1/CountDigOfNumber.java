package pac1;

import java.util.Scanner;

public class CountDigOfNumber {

	public static void main(String[] args) {

		int num=238901,count=0,search;
		Scanner s=new Scanner(System.in);

		System.out.println("enter the position of digit you want to display from last");
		search=s.nextInt();

		while(num>0)
		{
			count++;
			if(search==count)
			{
				break;
			}
			num=num/10;
		}
		System.out.println(num%10);
		s.close();
	}

}


