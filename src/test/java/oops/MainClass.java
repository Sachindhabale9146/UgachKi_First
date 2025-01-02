package oops;

public class MainClass {

	public static void main(String[] args) {
		
		SuperClass obj = new UpCasting();
		UpCasting ob = (UpCasting)obj;
		obj.superClassSecondMethod();
		ob.upCastingFirstMethod();
		ob.superClassFirstMethod();
	}
}
