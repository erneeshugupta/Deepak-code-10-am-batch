import java.util.Scanner;

public class Calulation3 
{	public int Sum(int a , int b) 
	{int c= a+b;
	return c; 	} 
	public int Sub(int c , int d) 
	{int e= c-d;
	return e; 	} 
	public void Div(int f , int g) 
	{int h= f/g;
	System.out.println("Result is : "+h);} 
	public int Mul(int i , int j) 
	{int k= i*j;
	return k; 	} 	
	
	public static void main(String[] args) 
	{
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the value for X1");
		int X1 = SC.nextInt();
		System.out.println("Enter the value for X2");
		int X2 = SC.nextInt();
		System.out.println("Enter the value for X3");
		int X3 = SC.nextInt();
		System.out.println("Enter the value for X4");
		int X4 = SC.nextInt();
		System.out.println("Enter the value for X5");
		int X5 = SC.nextInt();
		SC.close();
		
		Calulation3 C = new Calulation3() ; //(((((X1+X2)-X3)+X4)*X5)/X5)
		int Sum_Calc = C.Sum(X1, X2);
		int Sub_calc = C.Sub(Sum_Calc, X3);
		int Sum2_calc = C.Sum(Sub_calc, X4);
		int mul_Calc = C.Mul(Sum2_calc, X5);
		C.Div(mul_Calc, X5);
	}
	}

