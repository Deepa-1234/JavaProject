//program to reverse each word in a sentence
package pac1;

public class ElementRev {
		public static void main(String[] args) {
			String s1="sky is blue";
			String s2[]=s1.split(" ");
			String s3=" ";
			for(int i=0;i<s2.length;i++)
			{
				s3=s3+rev(s2[i])+" ";
			}
			s3=s3.trim();
			System.out.println(s3);
		}

		private static String rev(String s) {
			char ch[]= new char[s.length()];
			int j=s.length()-1;
			for(int i=0;i<s.length();i++)
			{
				ch[j]=s.charAt(i);
				j--;
			}
			return String.valueOf(ch);
		}

	}

