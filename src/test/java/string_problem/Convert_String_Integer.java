package string_problem;

public class Convert_String_Integer {

	public static void main1(String[] args) {
		
		String str = "123";
		
		int a = Integer.parseInt(str);
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		int a = 123;
		
		String str = Integer.toString(a);
		
		System.out.println(str);
	}
}
