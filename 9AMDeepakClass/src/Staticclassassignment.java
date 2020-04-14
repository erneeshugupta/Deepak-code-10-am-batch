//Calling Static Method from another Static Method within same class
public class Staticclassassignment 
{	
	public void Method3() {
		System.out.println("I am NON Static method 3 of Staticclassassignment");
		}
	
	public static void Method1() {
		System.out.println("I am Static method 1 of Staticclassassignment  ");
		}
	
	public static void Method2() {
		System.out.println("I am Static method 2 of Staticclassassignment  ");
//Calling Static Method from another Static Method within same class BY 3 possible ways
		System.out.println("*****Static method called BY 3 possible ways :*****");
		Staticclassassignment.Method1();
		Method1();
		Staticclassassignment SA = new Staticclassassignment();
		SA.Method1();
//Calling NON Static Method from Static Method within same class BY 1 possible way
		System.out.println("*****NON Static method called BY 1 possible way :*****");
		SA.Method3();
		
		}
	
	public static void main(String[] args) {
			Method2();
	}

}
