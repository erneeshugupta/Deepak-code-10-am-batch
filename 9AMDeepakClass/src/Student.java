public class Student 
{	int roll_no;
	int age;

	public  void display1 () 
	{
		System.out.println("Welcome All");	}

	public  void display2 ()
	{
		System.out.println("Welcome All of you");	}
	
	public static void main(String[] args) 	
	{
	Student Neeshu = new Student();
	Neeshu.display1();
	Neeshu.display2();
	Neeshu.age=36;
	System.out.println(Neeshu.age);
	Neeshu.roll_no=15;
	System.out.println(Neeshu.roll_no);
		
	}

}
