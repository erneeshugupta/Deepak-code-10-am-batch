
public class Practicechild extends Practiceparent {

	public Practicechild() {
		System.out.println("This is Child defcault Constructor 1");		
	}	
	
	public Practicechild(int a) {
		
		System.out.println("This is Child One Parameterized Constructor 2");
	}

public void Pcmethod1() {
	super.Pcmethod4(3);
	System.out.println("This is CHild default Method 1 ");

}

public void Pcmethod2(int b) {
	System.out.println("This is Child One parameterized method 2");
}


public static void main(String[] args) {
	
	Practicechild PC = new Practicechild();
	PC.Pcmethod1();
	PC.Pcmethod2(5);
	PC.Pcmethod3();
	PC.Pcmethod4(8);
	
	

}





}
