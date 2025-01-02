package string_problem;

public class Palindrome_String_Infosys {

	public static void main(String[] args) {
		
		String str1 = "Madame";
		
		String lstr1 = str1.toLowerCase();
		String str2 = "";
		int a = str1.length();
		a = a-1;
		while(0<=a) {
			str2 = str2 + lstr1.charAt(a);
			a--;
		}
		if(lstr1.equals(str2)) {
			System.out.println("Yes, Given String is Palindrome : "+str2);
		}
		else {
			System.out.println("No, Given string is not Palindrome : " +str2);
		}
	}
}
