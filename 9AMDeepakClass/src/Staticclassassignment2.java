
public class Staticclassassignment2 {
	
	public static void Method4() {
		System.out.println("I am Static Method 4 of Staticclassassignment2");
		System.out.println("**Below I am calling STatic method of another class by 2 ways:**");
//Calling Static Method from another Static Method within different class BY 2 possible ways
	Staticclassassignment.Method1();
	Staticclassassignment SM = new Staticclassassignment();
	SM.Method1();
//Calling non Static Method from another Static Method different class BY 2 possible ways	
	System.out.println("**Below I am calling nonSTatic method of another class by 1 way:**");
	SM.Method3();
	
	}
	
	public static void main(String[] args) {
		Method4();
	}

}
