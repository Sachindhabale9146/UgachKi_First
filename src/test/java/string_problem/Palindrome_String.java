package string_problem;

public class Palindrome_String {

	public static void main(String[] args) {
		
		String str = "madam";
		
		StringBuilder obj = new StringBuilder(str);
		
		StringBuilder str1 = obj.reverse();
		
		String str2 = str1.toString();
		
		if(str.equals(str2)){
			
			System.out.println("The given string is palindrom : " +str);
		}
	}
}
