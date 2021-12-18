//program to reverse a string
package pac1;

public class StringRev {

		public static void main(String[] args) {
			String s="happy";
			char ch[]= new char[s.length()];
			int j=s.length()-1;
			for(int i=0;i<s.length();i++)
			{
				ch[j]=s.charAt(i);
				j--;
			}
			String s1=String.valueOf(ch);
			System.out.println(s1);
		}

	}


