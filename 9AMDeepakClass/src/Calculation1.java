
public class Calculation1 
{
	public int Sum(int a, int b) 
	{int c= a+b;
	return c;		}
	public int Sub(int d, int e)
	{int f = d-e;
	return f;		}
	public int Mul(int x, int y)
	{int z = x*y;
	return z;		}
	public void Div(int g, int h)
	{int i = g/h;
	System.out.println(i);	
	}

	public static void main(String[] args)
	{
	Calculation1 C1=new Calculation1();
		int Sum_Calc = C1.Sum(10, 2);
		int Sub_calc = C1.Sub(Sum_Calc, 2);
		int Sum2_calc = C1.Sum(Sub_calc, 2);
		int Mul_calc = C1.Mul(Sum2_calc, 2);
		C1.Div(Mul_calc, 2);
	
	}

}
