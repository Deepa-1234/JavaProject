package pac1;


public class example {

	public static void main(String[] args) {
		String s="hello how are you";
		String s2[]=s.split(" ");
		String s3=" ";
		for(int i=s2.length-1;i>=0;i--) {
			s3=reverse(s2[i])+" "+s3;
		}
		s3=s3.trim();
		System.out.println(s3);
	}
		public static String reverse(String s1)
		{
			String s2=" ";
			for(int i=0;i<s1.length();i++) {
				s2=s1.charAt(i)+s2;
			}
			s2=s2.trim();
			return s2;
			
		}
		
		
	

}
