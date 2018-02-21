package inheritance;

public class B extends A{
	int j;
	
	B() {
		super(3);
		System.out.println("b()");
	}
	
	public B(int i) {
		super(i);
		this.j=i;
		System.out.println("b(int)");
	}
	
	
	
	
}
