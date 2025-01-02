package code_Practice;

import java.util.Scanner;

public class Count_Vowels_Consonants {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String...");
		String str = sc.nextLine();
		str = str.toLowerCase();
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		int a = str.length();
		int count = 0;
		int conCount =0;
		for(int i : ch) {
			if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u') {
				count++;
			}
			else {
				conCount++;
			}
		}
		if(count!=0 || conCount!=0) {
			System.out.println("Count of Vowels in given string : "+count);
			System.out.println("Count of Consonants in given string : "+conCount);
		}
		
		
	}
}
