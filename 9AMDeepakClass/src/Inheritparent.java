
public class Inheritparent {
	
	public  Inheritparent() 
	{	this(5,  9, 8);
		System.out.println("Parent Default Constructor");
	}
	public  Inheritparent(int a) 
	{	this();
		System.out.println("Parent 1 Parameterized Constructor");
	}
	public  Inheritparent(int a, int b) 
	{  this(5);
		System.out.println("Parent 2 parameterized Constructor");
	}	
	public  Inheritparent(int a, int b, int c) 
	{	
		System.out.println("Parent 3 parameterized Constructor");	
	
	}	
	

}
