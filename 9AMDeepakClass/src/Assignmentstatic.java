
public class Assignmentstatic {
	
	public static void Method() {
		System.out.println("I am First Static Method");
		Method2();
	}
	public static void Method2() {
		System.out.println("I am Second Static Method");
	}
	public  void Method3() {
		System.out.println("I am Third Non Static Method");
	}
	public  void Method4() {
		System.out.println("I am Fourth Non Static Method");
		Method2();
		Method3();
	}
	
	public static void main(String[] args) {
		Method();
		Method2();
	}
	
}
