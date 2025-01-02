package oops;

public class ImplementsClass extends AbstractClass {

	@Override
	public void sachin() {
		System.out.println("extends from abstract methods");
	}

	@Override
	public void diggi() {
		System.out.println("extends from abstract method 2");
	}

	public static void main(String[] args) {
		ImplementsClass obj = new ImplementsClass();
		obj.diggi();
		ImplementsClass.pravin();
	}
}
