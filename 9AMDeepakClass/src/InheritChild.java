
public class InheritChild extends Inheritparent{
	
	public  InheritChild() 
	{  	this(5, 8, 9);
		System.out.println("Child Default Constructor");	}
	public  InheritChild(int a) 
	{	this();
		System.out.println("Child 1 Parameterized Constructor");	}
	public  InheritChild(int a, int b) 
	{	this(5, 8, 9, 45);
		System.out.println("Child 2 parameterized Constructor");	}	
	public  InheritChild(int a, int b, int c) 
	{	super(9, 6);
		System.out.println("Child 3 parameterized Constructor");	}	
	public  InheritChild(int a, int b, int c, int d) 
	{  this(5);
		System.out.println("Child 4 parameterized Constructor");	}
	
		
	public static void main(String[] args) {
		
		
		InheritChild IC = new InheritChild(15,12);
	}
}
