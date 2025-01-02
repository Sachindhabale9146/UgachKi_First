package string_problem;

public class Reverse_String_Automation {

	public static void main(String[] args) {
		
		String str1 = "Automation";
		String str2 = "";
		int length_str1 = str1.length();
		System.out.println("length of string : "+length_str1);
		str1.toLowerCase();
		for(int i=length_str1-1;0<=i;i--) {
			
			str2 = str2 + str1.charAt(i);
		}
		String Lstr = str2.toLowerCase();
		System.out.println("reverse String : "+Lstr);
	}
}
