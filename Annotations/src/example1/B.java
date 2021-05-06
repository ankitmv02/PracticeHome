package example1;

public class B extends A {
	@Override
	public void show() {
		System.out.println("In Class B method");
	}
	
	@Deprecated
	public void showold() {
		System.out.println("Old method in B");
	}
}
