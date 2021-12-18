package pac1;

public class ReverseStringPosition {

	public static void main(String[] args) {
		String s1="sky is blue";
		String s2[]=s1.split(" ");
		String s3=" ";
		for(int i=0;i<s2.length;i++) {
			s3=" "+s2[i]+s3;
		}
System.out.println(s3);
	}

}
