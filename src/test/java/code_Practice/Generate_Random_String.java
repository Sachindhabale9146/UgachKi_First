package code_Practice;

import java.util.Random;

public class Generate_Random_String {

	public static void main(String[] args) {
		
		Random rn = new Random();
		
		int random_number = rn.nextInt(50011);
		
//		System.out.println(random_number);
		
		String random_string = rn.toString().concat("_random_string");
		System.out.println(random_string);
	}
}
