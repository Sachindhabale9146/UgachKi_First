package oops;

public class UpCasting extends SuperClass {

	public void upCastingFirstMethod() {
		System.out.println("From Up Casting First Method");
	}
	
	public void upCastingSecondMethod() {
		System.out.println("From Up Casting Second Method");
	}
	
	public static void upCastingStaticMethod() {
		System.out.println("From Up Casting Static Method");
	}
	public static void main(String[] args) {
		SuperClass onj = new UpCasting();
		onj.superClassSecondMethod();
		UpCasting.superClassFirstMethod();
		
	}
}
