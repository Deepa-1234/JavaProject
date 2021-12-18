package pac1;

public class ReverseEachwordOfString {

	public static void main(String[] args) {
		String s1="sky is blue";
		String s2[]=s1.split(" ");
		String s3=" ";
		for(int i=0;i<s2.length;i++)
		{
			s3=s3+rev(s2[i]);
		}
		s3=s3.trim();
		System.out.println(s3);

	}

	private static String rev(String s) {
		String temp=" ";
		for(int i=0;i<s.length();i++) {
			temp=s.charAt(i)+temp;
		}
		return temp;
	}

}
