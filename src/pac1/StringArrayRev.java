//Program to reverse words position in a sentence
package pac1;

public class StringArrayRev {

	public static void main(String[] args) {
		String s1="hello how are you";
		String[] s2=s1.split(" ");
		String rev[] =  new String[s2.length];
		int j=0;
	for(int i=s2.length-1;i>=0;i--)
	{
		rev[j]=s2[i];
		j++;
	}
	String s3=" ";
	for(int i=0;i<rev.length;i++) {
		s3=s3+rev[i]+" ";
	}
	s3=s3.trim();
	System.out.println(s3);
}
}
