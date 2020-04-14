
public class MethodProgram {
	
	public void Method1() 
	{System.out.println("This is default Method");}
	public void Method2(int a)
	{System.out.println("This is one Parameterized Method");}
	public void Method3(int a, int b)
	{System.out.println("This is two Parameterized Method");}
	public void Method4(int a, int b, int c)
	{System.out.println("This is three Parameterized Method");}
	public void Method5(int a, int b, int c, int d)
	{System.out.println("This is four Parameterized Method");
	this.Method1();
	this.Method2(2);
	this.Method4(5, 6, 9);
	this.Method3(8, 7);}
	
	public static void main(String[] args) 
	{
		MethodProgram M = new MethodProgram();
		M.Method5(4, 5, 7, 8);
	}
	}
	
	
	

