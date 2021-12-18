package pac1;

public class Driver2 {

	public static void main(String[] args) {
		new E();
		System.out.println("------------------");
		new E(10);
		System.out.println("------------------");
		new E(10,20);
		System.out.println("------------------");
		new F();
		System.out.println("------------------");
		new F('a');
		System.out.println("------------------");
		new F(12.3);

	}

}
