package pac1;

public class F extends E {

	{
		System.out.println("from iib 1 of F");
	}
	F(){
		super(10);
		System.out.println("from const F()");
	}
	F(char a){
		this();
		System.out.println("from cont F(char)");
	}
	F(double a){
		this();
		System.out.println("from const.F(double)");
	}
}
