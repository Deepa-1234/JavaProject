package pac1;

public class E {

	{
		System.out.println("from iib 1 of E");
	}
	E(){
		System.out.println("from const E()");
	}
	E(int a){
		this(1,2);
		System.out.println("from cont E(int)");
	}
	E(int a,int b){
		this();
		System.out.println("from const.E(int,int)");
	}
}
