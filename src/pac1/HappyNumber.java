package pac1;

public class HappyNumber {

	public static void main(String[] args) {
		int num=19,num1=num,ld,sqSum=0,count=0;
		while(num>0) {
			ld=num%10;
			sqSum=sqSum+(ld*ld);
			num=num/10;
			if(num==0) {
				num=sqSum;
				if(sqSum<=9) {
					break;
				}
				sqSum=0;
			}
		}
		if(sqSum==1||sqSum==7) {
			System.out.println(num1+" is happy number");
		}
		else {
			System.out.println(num1+" is not a happy number");

		}
	}

}
