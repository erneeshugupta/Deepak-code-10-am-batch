
public class Inhermethodchild extends Inhermethodparent{
	
	public void M1() {
		this.M9();
		System.out.println("Child Default Method ");
	}
	public void M2() {
		this.M1();
		System.out.println("Child 1 Parameterinzed Method ");
	}
	public void M3() {
		this.M2();
		System.out.println("Child 2 Parameterinzed Method ");
	}
	public void M4() {
		System.out.println("Child 3 Parameterinzed Method ");
	}
	public void M9() {
		
		super.M8();
		super.M5();
		super.M6();
		super.M7();
		System.out.println("Child 4 Parameterinzed Method ");
	}
	
public static void main(String[] args) {
	Inhermethodchild IM = new Inhermethodchild();
	IM.M3();
	
}
	
}
