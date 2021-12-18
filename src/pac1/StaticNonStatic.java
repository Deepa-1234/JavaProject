package pac1;

public class StaticNonStatic {
	static int s;
	int d;
	{
		s=6;
	}
	public StaticNonStatic(){
		//System.out.println(s);
		//System.out.println(this.s);
	}
	void test3() {
		System.out.println("non static method"+StaticNonStatic.s+" "+this.s);
		
	}
	void test3(int a) {
		
	}
	public static void test2(int s) {
		
	}
 public static void test2() {
		System.out.println("static method"+s);
		
	}
	public static void main(String[] args) {
		StaticNonStatic obj=new StaticNonStatic();
		obj.test3();
		obj.test2();
		StaticNonStatic.test2();
		String s1=new String("hello");
		System.out.println(s1.toLowerCase());
		char a = Character.toUpperCase(s1.charAt(0));
		System.out.println(a);
		String str="hello";
		//String[] str1=str.split(" ");
		System.out.println(str.length());
		//	obj.test(new StaticNonStatic());
		//test1(new StaticNonStatic());
	}
//	public static void  test1(StaticNonStatic obj){
//		//System.out.println(this.s);
//		System.out.println(obj.s);
//	}
//	public void test( StaticNonStatic obj) {
//		System.out.println(this.s);
//		System.out.println(obj.s);
//	}
}
