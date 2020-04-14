
public class Constructor1 
	{
		public Constructor1(int a, int b, int c, int d) 
			{
				System.out.println("This is Four Parameterized Constructor");
			}	
		public Constructor1()
			{ this(5, 4, 3, 1);
				System.out.println("This is Default Constructor");
			}	
		public Constructor1(int a1, int b1) 
			{  this();
				System.out.println("This is two Parameterized Constructor");
			}	
		public Constructor1(int a2) 
			{   this(5, 6);
				System.out.println("This is one Parameterized Constructor");
			}
		public Constructor1(int x, int y, int z) 
			{ this(6);
			System.out.println("This is Three Parameterized Constructor");
			}	
				
	public static void main(String[] args) {
		Constructor1 C1=new Constructor1(1, 2, 3);
	}
}
