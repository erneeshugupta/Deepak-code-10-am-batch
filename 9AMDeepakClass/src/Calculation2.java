
public class Calculation2 
{
	public int Sum(int a, int b) 
	{int c= a+b;
	return c;		}
	public int Sub(int d, int e)
	{int f = d-e;
	return f;		}
	public void Mul(int x, int y)
	{int z = x*y;
	System.out.println(z);	}
	public int Div(int g, int h)
	{int i = g/h;
	return i;		}

	public static void main(String[] args)
	{
	Calculation2 C1=new Calculation2();
	int Div_calc =C1.Div(10, 2);	
	int Sub_calc = C1.Sub(Div_calc, 2);
	int Sum_Calc = C1.Sum(Sub_calc, 2);
	int Sub_calc2 = C1.Sub(Sum_Calc, 2);	
	int Sum2_calc = C1.Sum(Sub_calc2, 2);
	C1.Mul(Sum2_calc, 2);	
	
	
	}

}
