package string_problem;

public class Reverse_String {

	public static void main(String[] args) {
		
		String str = "Sachin";
		
		StringBuilder obj = new StringBuilder(str);
		StringBuilder rstr = obj.reverse();
		
		System.out.println("reverse string is : " +rstr);
	}
}
