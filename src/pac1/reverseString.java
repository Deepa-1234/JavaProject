package pac1;

public class reverseString {
public static void main(String args[]) {
String s1="hello hai good morning";


String s3=" ";
for(int i=0;i<s1.length();i++)
{
	s3=s1.charAt(i)+s3;
}
s3=s3.trim();
System.out.println(s3);
}
}
