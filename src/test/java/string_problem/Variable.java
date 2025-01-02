package string_problem;

public class Variable {

	final int a=3;
	public static void main(String[] args) {
		
//		int a = 1;
//		System.out.println(a);
		
		main1();
		Variable v = new Variable();
		v.main2();
	}
	public static void main1() {
		int a=2;
		System.out.println(a);
	}
	
	public void main2() {
		final int a = 5;
		System.out.println(a + " "+ this.a);
	}
}
