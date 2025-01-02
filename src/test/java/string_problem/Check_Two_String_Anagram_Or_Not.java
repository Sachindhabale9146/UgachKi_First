package string_problem;

import java.util.Arrays;

public class Check_Two_String_Anagram_Or_Not {

	public static void main(String[] args) {
		
		String str1 = "Sachin";
		String str2 = "sAnchi";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
	    boolean status = Arrays.equals(ch1,ch2);
	    
	    if(status==true) {
	    	System.out.println("Yes, Both String Are Anagram...");
	    }
	    else {
	    	System.out.println("OOPs, Both String Are Not Anagram...");
	    }
	}
}
