import java.util.Scanner;

public class ScannerProgram 
{	static int x1, x2, x3,x4;
	public void Method1 ()
	{		System.out.println("This is Default Method");	}
	public void Method2 (int x1)
	{		System.out.println("This is one Parameterized Method");	}
	public void Method3 (int x1, int x2)
	{		System.out.println("This is two Parameterized Method");	}
	public void Method4 (int x1, int x2, int x3, int x4)
	{		System.out.println("This is Three Parameterized Method");	}
	public void Method5 (int x1, int x2, int x3, int x4)

	{		System.out.println("This is Four Parameterized Method");	}
	
	public void scaninput() 			
	{		
		Scanner SC = new Scanner(System.in);
		System.out.println("enter the value of x1");
		int x1 = SC.nextInt();			
		System.out.println("enter the value of x2");
		int x2 = SC.nextInt();	
		System.out.println("enter the value of x3");
		int x3 = SC.nextInt();	
		System.out.println("enter the value of x4");
		int x4 = SC.nextInt();	
	}
		
		public static void main(String[] args) 
		{
		ScannerProgram SI = new ScannerProgram();
		SI.scaninput();
		ScannerProgram SP = new ScannerProgram();
				SP.Method5(x1, x2, x3, x4);
		}
		
}
		
	
			
	
	
